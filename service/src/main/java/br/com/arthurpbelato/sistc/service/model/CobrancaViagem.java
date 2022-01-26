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
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_COBRANCA_VIAGEM")
@Getter
@Setter
public class CobrancaViagem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_COBRANCA_VIAGEM")
    @SequenceGenerator(name = "SEQ_COBRANCA_VIAGEM", sequenceName = "SEQ_COBRANCA_VIAGEM", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DATA_HORA")
    private LocalDateTime dataHora;

    @Column(name = "VALOR")
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "ID_ONIBUS")
    private Onibus onibus;

    @ManyToOne
    @JoinColumn(name = "ID_PASSE")
    private Passe passe;

}
