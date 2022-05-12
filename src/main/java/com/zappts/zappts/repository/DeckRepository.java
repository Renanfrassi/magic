package com.zappts.zappts.repository;

import com.zappts.zappts.domain.Deck;
import com.zappts.zappts.service.dto.CartaDeckDTO;
import com.zappts.zappts.service.dto.DeckJogadorDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeckRepository extends JpaRepository<Deck, Integer> {

    @Query("select distinct new com.zappts.zappts.service.dto.DeckJogadorDTO(d.idKey.nome, j.id, j.nome) " +
            "from Deck d, Jogador j " +
            "where j.id = :idJogador and j.id = d.idKey.jogador.id")
    List<DeckJogadorDTO> buscaDeckPorIdJogador(@Param("idJogador") Integer idJogador);

    @Query("select distinct new com.zappts.zappts.service.dto.DeckJogadorDTO(d.idKey.nome, j.id, j.nome)" +
            "from Deck d, Jogador j " +
            "where j.id = :idJogador and d.idKey.nome = :nomeDeck " +
            "and j.id = d.idKey.jogador.id")
    DeckJogadorDTO buscaDeck(@Param("idJogador") Integer idJogador, @Param("nomeDeck") String nomeDeck);

    @Query("select new com.zappts.zappts.service.dto.CartaDeckDTO(c.id, c.nome) " +
            "from Deck d, Carta c, Jogador j " +
            "where d.idKey.nome = :nomeDeck " +
            "and j.id = :idJogador " +
            "and c.id = d.idKey.carta.id")
    List<CartaDeckDTO> buscaCartasDeckJogador(@Param("idJogador") Integer idJogador, @Param("nomeDeck") String nomeDeck);

    @Modifying
    @Query("delete from Deck d " +
            "where d.idKey.nome = :nomeDeck " +
            "and d.idKey.jogador.id = :idJogador " +
            "and d.idKey.carta.id = :idCarta")
    void deletarCartaDoDeck(@Param("nomeDeck") String nomeDeck, @Param("idCarta")  Integer idCarta,  @Param("idJogador")  Integer idJogador);

}