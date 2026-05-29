package sp.senai.br.cafearomaesabor.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sp.senai.br.cafearomaesabor.model.Movimentacao;
import sp.senai.br.cafearomaesabor.model.Produto;
import sp.senai.br.cafearomaesabor.repository.MovimentacaoRepository;
import sp.senai.br.cafearomaesabor.repository.ProdutoRepository;

import java.util.List;

@Controller
@RequestMapping("/movimentacao")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @ModelAttribute("paginaAtiva")
    public String activePage() {
        return "movimentacao";
    }

    @GetMapping
    public String listagem(Model model) {
        List<Movimentacao> movimentacoes = movimentacaoRepository.findAllByOrderByDataMovimentacaoDesc();
        List<Produto> produtos = produtoRepository.findAllByOrderByNomeAsc();
        model.addAttribute("movimentacoes", movimentacoes);
        model.addAttribute("produtos", produtos);
        model.addAttribute("movimentacao", new Movimentacao());
        return "movimentacao/listagem";
    }

    @PostMapping("/salvar")
    public String salvar(@Valid Movimentacao movimentacao, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Produto> produtos = produtoRepository.findAllByOrderByNomeAsc();
            model.addAttribute("produtos", produtos);
            return "movimentacao/listagem";
        }

        // Atualizar quantidade do produto
        Produto produto = movimentacao.getProduto();
        if (produto != null && produto.getId() != null) {
            Produto prod = produtoRepository.findById(produto.getId()).orElse(null);
            if (prod != null) {
                if ("ENTRADA".equalsIgnoreCase(movimentacao.getTipo())) {
                    prod.setQuantidade(prod.getQuantidade() + movimentacao.getQuantidade());
                } else if ("SAIDA".equalsIgnoreCase(movimentacao.getTipo())) {
                    int novaQtd = prod.getQuantidade() - movimentacao.getQuantidade();
                    prod.setQuantidade(Math.max(novaQtd, 0));
                }
                produtoRepository.save(prod);
            }
        }

        movimentacaoRepository.save(movimentacao);
        return "redirect:/movimentacao";
    }
}
