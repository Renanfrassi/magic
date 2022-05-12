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

    @EmbeddedId
    private DeckKey idKey;
}