package com.zappts.zappts.domain;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "deck")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Deck implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DECK")
    @SequenceGenerator(name = "SQ_DECK", sequenceName = "serial_deck", initialValue = 1, allocationSize = 1)
    private Integer id;

    private DeckKey idKey;

    private String nome;

}