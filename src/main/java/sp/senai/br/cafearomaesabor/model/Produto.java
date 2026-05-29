package sp.senai.br.cafearomaesabor.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome do produto e obrigatorio")
    private String nome;

    private String descricao;

    private String categoria;

    private String origemPais;

    private String fornecedor;

    @NotBlank(message = "Numero do lote e obrigatorio")
    private String numeroLote;

    private LocalDate dataFabricacao;

    @NotNull(message = "Data de validade e obrigatoria")
    private LocalDate dataValidade;

    private Integer quantidade;

    private String unidadeMedida;

    private BigDecimal custoUnitario;

    @NotNull(message = "Estoque minimo e obrigatorio")
    private Integer estoqueMinimo;

    private String localizacaoAlmoxarifado;

    private String observacoes;

    public int getDiasRestantes() {
        if (dataValidade == null) return 0;
        return (int) java.time.temporal.ChronoUnit.DAYS.between(LocalDate.now(), dataValidade);
    }

    public boolean isEstoqueCritico() {
        return quantidade != null && estoqueMinimo != null && quantidade <= estoqueMinimo;
    }

    public boolean isVencido() {
        return dataValidade != null && dataValidade.isBefore(LocalDate.now());
    }

    public String getLinhaClass() {
        if (isVencido()) return "linha-vencido";
        int d = getDiasRestantes();
        if (d <= 3) return "linha-critico";
        if (d <= 7) return "linha-urgente";
        if (d <= 15) return "linha-atencao";
        return "linha-ok";
    }

    public String getBadgeClass() {
        if (isVencido()) return "badge-vencido";
        int d = getDiasRestantes();
        if (d <= 3) return "badge-critico pulse";
        if (d <= 7) return "badge-urgente";
        if (d <= 15) return "badge-atencao";
        return "badge-ok";
    }

    public String getBadgeClassDias() {
        if (isVencido()) return "badge-vencido";
        int d = getDiasRestantes();
        if (d <= 3) return "badge-critico";
        if (d <= 7) return "badge-urgente";
        if (d <= 15) return "badge-atencao";
        return "badge-ok";
    }

    public String getStatusTexto() {
        if (isVencido()) return "VENCIDO";
        int d = getDiasRestantes();
        if (d <= 3) return "CRITICO";
        if (d <= 7) return "URGENTE";
        if (d <= 15) return "ATENCAO";
        return "OK";
    }
}
