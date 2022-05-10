package com.zappts.zappts.domain;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "carta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Jogador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_JOGADOR")
    @SequenceGenerator(name = "SQ_JOGADOR", sequenceName = "serial_jogador", initialValue = 1, allocationSize = 1)
    private Integer id;

    @Column(name = "nome")
    private String nome;
}