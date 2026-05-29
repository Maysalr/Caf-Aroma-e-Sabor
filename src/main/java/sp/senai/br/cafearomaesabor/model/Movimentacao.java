package sp.senai.br.cafearomaesabor.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @NotBlank(message = "Tipo de movimentacao e obrigatorio")
    private String tipo;

    @NotNull(message = "Quantidade e obrigatoria")
    private Integer quantidade;

    @NotNull(message = "Data da movimentacao e obrigatoria")
    private LocalDate dataMovimentacao;

    private String responsavel;

    private String observacoes;
}
