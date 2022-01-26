package br.com.arthurpbelato.sistc.service.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
public class OnibusDTO {
    private Long id;
    private String cidade;
    private String estado;
    private String nomeLinha;
    private Time inicioCirculacao;
    private Time fimCirculacao;
}
