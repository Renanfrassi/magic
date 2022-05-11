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
public class Carta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CARTA")
    @SequenceGenerator(name = "SQ_CARTA", sequenceName = "serial_carta", initialValue = 1, allocationSize = 1)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "edição")
    private String edição;

    @Column(name = "ativo")
    @Value("false")
    private Boolean laminada;

	@Column(name = "preco")
	private Double preco;

    @OneToMany
    @JoinColumn(name = "id_idioma")
    private Idioma idioma;

}