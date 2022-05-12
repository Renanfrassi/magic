package com.zappts.zappts.domain;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Embeddable
public class DeckKey implements Serializable{

    private String nome;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_carta")
    private Carta carta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_jogador")
    private Jogador jogador;
    

}