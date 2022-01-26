package br.com.arthurpbelato.sistc.service.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.sql.Time;

@Getter
@Setter
@Table(name = "TB_ONIBUS")
@Entity
public class Onibus {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ONIBUS")
    @SequenceGenerator(name = "SEQ_ONIBUS", sequenceName = "SEQ_ONIBUS", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CIDADE", length = 50)
    private String cidade;

    @Column(name = "ESTADO", length = 2)
    private String estado;

    @Column(name = "NOME_LINHA", length = 100)
    private String nomeLinha;

    @Column(name = "INICIO_CIRCULACAO")
    private Time inicioCirculacao;

    @Column(name = "FIM_CIRCULACAO")
    private Time fimCirculacao;

}
