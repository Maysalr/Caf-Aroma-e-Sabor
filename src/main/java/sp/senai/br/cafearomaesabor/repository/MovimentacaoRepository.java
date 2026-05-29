package sp.senai.br.cafearomaesabor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sp.senai.br.cafearomaesabor.model.Movimentacao;

import java.util.List;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {

    List<Movimentacao> findAllByOrderByDataMovimentacaoDesc();

    List<Movimentacao> findByProdutoIdOrderByDataMovimentacaoDesc(Long produtoId);
}
