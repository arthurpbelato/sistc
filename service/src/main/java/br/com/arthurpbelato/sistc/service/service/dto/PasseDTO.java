package br.com.arthurpbelato.sistc.service.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PasseDTO {
    private Long id;
    private Long codigoRFID;
    private Double saldo;
    private Boolean ativo;
    private Boolean categoriaEstudantil;
    private Long idPessoa;
}
