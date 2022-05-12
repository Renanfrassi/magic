package com.zappts.zappts.service.dto;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class DeckDTO implements Serializable {

    private String nome;

    private Integer idCarta;
    
    private String nomeCarta;

	private Integer idJogador;
    
    private String nomeJogador;
    
}