package com.zappts.zappts.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class DeckJogadorDTO implements Serializable {
    
    private Integer idDeck;

    private String nomeDeck;

    private Integer idJogador;

    private String nomeJogador;

    private List<CartaDeckDTO> cartasDTO = new ArrayList<>();

    public DeckJogadorDTO(Integer idDeck, String nomeDeck, Integer idJogador, String nomeJogador){
        
        this.idDeck = idDeck;

        this.nomeDeck = nomeDeck;
    
        this.idJogador = idJogador;
    
        this.nomeJogador = nomeJogador;
    }

}