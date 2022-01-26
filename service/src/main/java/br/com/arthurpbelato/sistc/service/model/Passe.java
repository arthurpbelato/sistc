package br.com.arthurpbelato.sistc.service.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "TB_PASSE")
@Entity
@Getter
@Setter
public class Passe {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PASSE")
    @SequenceGenerator(name = "SEQ_PASSE", sequenceName = "SEQ_PASSE", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CODIGO_RFID")
    private Long codigoRFID;

    @Column(name = "SALDO")
    private Double saldo;

    @Column(name = "ATIVO")
    private Boolean ativo;

    @Column(name = "CATEGORIA_ESTUDANTIL")
    private Boolean categoriaEstudantil;

    @ManyToOne
    @JoinColumn(name = "ID_PESSOA")
    private Pessoa pessoa;

}
