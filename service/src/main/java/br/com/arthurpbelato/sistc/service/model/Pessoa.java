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
import java.time.LocalDate;

@Getter
@Setter
@Table(name = "TB_PESSOA")
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PESSOA")
    @SequenceGenerator(name = "SEQ_PESSOA", allocationSize = 1, sequenceName = "SEQ_PESSOA")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME", length = 100)
    private String nome;

    @Column(name = "SOBRENOME", length = 100)
    private String sobrenome;

    @Column(name = "DATA_NASCIMENTO")
    private LocalDate dataNascimento;

    @Column(name = "CIDADE", length = 50)
    private String cidade;

    @Column(name = "ESTADO", length = 2)
    private String estado;

    @Column(name = "TELEFONE", length = 20)
    private String telefone;

    @Column(name = "EMAIL", length = 200)
    private String email;

    @Column(name = "NOME_FOTO", length = 100)
    private String nomeFoto;

}
