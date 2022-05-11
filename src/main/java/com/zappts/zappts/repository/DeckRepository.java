package com.zappts.zappts.repository;

import com.zappts.zappts.domain.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckRepository extends JpaRepository<Deck, Integer> {

    @Query("select new com.zappts.zappts.service.dto.DeckJogadorDTO(d.id, d.nome, j.id, j.nome) from Deck d, Jogador j where j.id = :idJogador and j.id = d.idKey.id")
    List<DeckJogadorDTO> buscaDeckPorIdJogador(@Param("idJogador") Integer idJogador);

    @Query("select distinct new com.zappts.zappts.service.dto.DeckJogadorDTO(d.id, d.nome, j.id, j.nome) from Deck d, Jogador j where j.id = :idJogador and d.id = :idDeck and j.id = d.idKey.id")
    DeckJogadorDTO buscaDeck(@Param("idJogador") Integer idJogador, @Param("idDeck") Integer idDeck);

    @Query("select new com.zappts.zappts.service.dto.CartaDeckDTO(c.id, c.nome) from Deck d, Carta c where d.id = :idDeck and j.id = :idJogador and c.id = d.idKey.id")
    List<CartaDeckDTO> buscaCartasDeckJogador(@Param("idJogador") Integer idJogador, @Param("idDeck") Integer idDeck);

}