package sp.senai.br.cafearomaesabor.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import sp.senai.br.cafearomaesabor.model.Produto;
import sp.senai.br.cafearomaesabor.repository.ProdutoRepository;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @ModelAttribute("paginaAtiva")
    public String activePage() {
        return "produto";
    }

    @GetMapping
    public String listagem(Model model) {
        List<Produto> produtos = produtoRepository.findAllByOrderByNomeAsc();
        model.addAttribute("produtos", produtos);
        return "produto/listagem";
    }

    @GetMapping("/form-inserir")
    public String formInserir(Model model) {
        model.addAttribute("produto", new Produto());
        return "produto/form-inserir";
    }

    @PostMapping("/salvar")
    public String salvar(@Valid Produto produto, BindingResult result) {
        if (result.hasErrors()) {
            return "produto/form-inserir";
        }
        produtoRepository.save(produto);
        return "redirect:/produto";
    }

    @GetMapping("/form-alterar/{id}")
    public String formAlterar(@PathVariable Long id, Model model) {
        Optional<Produto> produto = produtoRepository.findById(id);
        if (produto.isPresent()) {
            model.addAttribute("produto", produto.get());
            return "produto/form-alterar";
        }
        return "redirect:/produto";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        produtoRepository.deleteById(id);
        return "redirect:/produto";
    }
}
