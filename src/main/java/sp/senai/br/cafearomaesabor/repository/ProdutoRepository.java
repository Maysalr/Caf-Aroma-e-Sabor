package sp.senai.br.cafearomaesabor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sp.senai.br.cafearomaesabor.model.Produto;

import java.time.LocalDate;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findAllByOrderByNomeAsc();

    List<Produto> findByNomeContainingIgnoreCase(String nome);

    @Query("SELECT p FROM Produto p WHERE p.dataValidade BETWEEN :inicio AND :fim ORDER BY p.dataValidade ASC")
    List<Produto> findProdutosVencendoEntre(LocalDate inicio, LocalDate fim);

    @Query("SELECT p FROM Produto p WHERE p.quantidade <= p.estoqueMinimo ORDER BY p.quantidade ASC")
    List<Produto> findProdutosEstoqueCritico();

    @Query("SELECT p FROM Produto p WHERE p.dataValidade < :hoje ORDER BY p.dataValidade ASC")
    List<Produto> findProdutosVencidos(LocalDate hoje);
}
