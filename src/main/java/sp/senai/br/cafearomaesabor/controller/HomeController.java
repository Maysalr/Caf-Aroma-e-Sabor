package sp.senai.br.cafearomaesabor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sp.senai.br.cafearomaesabor.model.Movimentacao;
import sp.senai.br.cafearomaesabor.model.Produto;
import sp.senai.br.cafearomaesabor.repository.MovimentacaoRepository;
import sp.senai.br.cafearomaesabor.repository.ProdutoRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    @ModelAttribute("paginaAtiva")
    public String activePage() {
        return "home";
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home(Model model) {

        List<Produto> todosProdutos = produtoRepository.findAll();

        // KPI: Estoque total (soma de quantidades)
        int totalEstoque = todosProdutos.stream()
                .filter(p -> p.getQuantidade() != null)
                .mapToInt(Produto::getQuantidade)
                .sum();

        // KPI: Produtos vencendo em 7 dias
        LocalDate hoje = LocalDate.now();
        LocalDate daqui7 = hoje.plusDays(7);
        List<Produto> vencendoEm7 = produtoRepository.findProdutosVencendoEntre(hoje, daqui7);

        // KPI: Estoque critico
        List<Produto> estoqueCritico = produtoRepository.findProdutosEstoqueCritico();

        // KPI: Valor total
        BigDecimal valorTotal = todosProdutos.stream()
                .filter(p -> p.getQuantidade() != null && p.getCustoUnitario() != null)
                .map(p -> p.getCustoUnitario().multiply(BigDecimal.valueOf(p.getQuantidade())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        // Ultimas movimentacoes (5)
        List<Movimentacao> ultimasMov = movimentacaoRepository.findAllByOrderByDataMovimentacaoDesc();
        if (ultimasMov.size() > 5) {
            ultimasMov = ultimasMov.subList(0, 5);
        }

        model.addAttribute("totalEstoque", totalEstoque);
        model.addAttribute("vencendoEm7", vencendoEm7);
        model.addAttribute("qtdVencendo7", vencendoEm7.size());
        model.addAttribute("estoqueCritico", estoqueCritico);
        model.addAttribute("qtdEstoqueCritico", estoqueCritico.size());
        model.addAttribute("valorTotal", valorTotal);
        model.addAttribute("ultimasMovimentacoes", ultimasMov);
        model.addAttribute("produtosEstoqueBaixo", estoqueCritico);

        return "home";
    }
}