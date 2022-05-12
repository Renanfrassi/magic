package com.zappts.zappts.service.mapper;

import com.zappts.zappts.domain.Deck;
import com.zappts.zappts.domain.Jogador;
import com.zappts.zappts.service.dto.DeckJogadorDTO;
import com.zappts.zappts.service.dto.JogadorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DeckJogadorMapper extends GenericoMapper<DeckJogadorDTO, Deck>{
    
    @Override
    @Mapping(source = "nomeJogador", target = "idKey.jogador.nome")
    @Mapping(source = "nomeDeck", target = "idKey.nome")
    @Mapping(source = "idJogador", target = "idKey.jogador.id")
    Deck paraEntidade(DeckJogadorDTO dto);
    
    @Override
    @Mapping(source = "nomeJogador", target = "idKey.jogador.nome")
    @Mapping(source = "nomeDeck", target = "idKey.nome")
    @Mapping(source = "idJogador", target = "idKey.jogador.id")
    List<Deck> paraEntidade(List<DeckJogadorDTO> listaDto);
    
    @Override
    @Mapping(source = "idKey.jogador.nome", target = "nomeJogador")
    @Mapping(source = "idKey.nome", target = "nomeDeck")
    @Mapping(source = "idKey.jogador.id", target = "idJogador")
    DeckJogadorDTO paraDto(Deck entidade);
    
    @Override
    @Mapping(source = "idKey.jogador.nome", target = "nomeJogador")
    @Mapping(source = "idKey.nome", target = "nomeDeck")
    @Mapping(source = "idKey.jogador.id", target = "idJogador")
    List<DeckJogadorDTO> paraDto(List<Deck> listaEntidade);
}