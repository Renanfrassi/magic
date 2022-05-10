package com.zappts.zappts.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class JogadorDTO implements Serializable {
    
    private Integer id;

    private String nome;
}