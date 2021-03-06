package com.zappts.zappts.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class CartaDeckDTO implements Serializable {

    private Integer id;

    private String nome;
}