package com.zappts.zappts.service.mapper;

import com.zappts.zappts.domain.Deck;
import com.zappts.zappts.service.dto.DeckDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DeckMapper extends GenericoMapper<DeckDTO, Deck>{
    
    @Override
    @Mapping(source = "nomeCarta", target = "idKey.carta.nome")
    @Mapping(source = "nomeJogador", target = "idKey.jogador.nome")
    @Mapping(source = "idCarta", target = "idKey.carta.id")
    @Mapping(source = "idJogador", target = "idKey.jogador.id")
    @Mapping(source = "nome", target = "idKey.nome")
    Deck paraEntidade(DeckDTO dto);
    
    @Override
    @Mapping(source = "nomeCarta", target = "idKey.carta.nome")
    @Mapping(source = "nomeJogador", target = "idKey.jogador.nome")
    @Mapping(source = "idCarta", target = "idKey.carta.id")
    @Mapping(source = "idJogador", target = "idKey.jogador.id")
    @Mapping(source = "nome", target = "idKey.nome")
    List<Deck> paraEntidade(List<DeckDTO> listaDto);
    
    @Override
    @Mapping(source = "idKey.carta.nome", target = "nomeCarta")
    @Mapping(source = "idKey.jogador.nome", target = "nomeJogador")
    @Mapping(source = "idKey.carta.id", target = "idCarta")
    @Mapping(source = "idKey.jogador.id", target = "idJogador")
    @Mapping(source = "idKey.nome", target = "nome")
    DeckDTO paraDto(Deck entidade);
    
    @Override
    @Mapping(source = "idKey.carta.nome", target = "nomeCarta")
    @Mapping(source = "idKey.jogador.nome", target = "nomeJogador")
    @Mapping(source = "idKey.carta.id", target = "idCarta")
    @Mapping(source = "idKey.jogador.id", target = "idJogador")
    @Mapping(source = "idKey.nome", target = "nome")
    List<DeckDTO> paraDto(List<Deck> listaEntidade);
}