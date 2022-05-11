package com.zappts.zappts.domain;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "idioma")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Idioma implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_IDIOMA")
    @SequenceGenerator(name = "SQ_IDIOMA", sequenceName = "serial_idioma", initialValue = 1, allocationSize = 1)
    private Integer id;

    @Column(name = "nome")
    private String nome;
}