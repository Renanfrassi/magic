package com.zappts.zappts.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class DeckJogadorDTO implements Serializable {
    private String nomeDeck;

    private Integer idJogador;

    private String nomeJogador;

    private List<CartaDeckDTO> cartas = new ArrayList<>();

    public DeckJogadorDTO(String nomeDeck, Integer idJogador, String nomeJogador){

        this.nomeDeck = nomeDeck;
    
        this.idJogador = idJogador;
    
        this.nomeJogador = nomeJogador;
    }

}