package com.zappts.zappts.service.mapper;

import com.zappts.zappts.domain.Deck;
import com.zappts.zappts.service.dto.DeckDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DeckMapper extends GenericoMapper<DeckDTO, Deck>{
    
    @Override
    @Mapping(source = "nomeCarta", target = "idKey.idCarta.nome")
    @Mapping(source = "nomeJogador", target = "idKey.idJogador.nome")
    @Mapping(source = "idCarta", target = "idKey.idCarta.id")
    @Mapping(source = "idJogador", target = "idKey.idJogador.id")
    Deck paraEntidade(DeckDTO dto);
    
    @Override
    @Mapping(source = "nomeCarta", target = "idKey.idCarta.nome")
    @Mapping(source = "nomeJogador", target = "idKey.idJogador.nome")
    @Mapping(source = "idCarta", target = "idKey.idCarta.id")
    @Mapping(source = "idJogador", target = "idKey.idJogador.id")
    List<Deck> paraEntidade(List<DeckDTO> listaDto);
    
    @Override
    @Mapping(source = "idKey.idCarta.nome", target = "nomeCarta")
    @Mapping(source = "idKey.idJogador.nome", target = "nomeJogador")
    @Mapping(source = "idKey.idCarta.id", target = "idCarta")
    @Mapping(source = "idKey.idJogador.id", target = "idJogador")
    DeckDTO paraDto(Deck entidade);
    
    @Override
    @Mapping(source = "idKey.idCarta.nome", target = "nomeCarta")
    @Mapping(source = "idKey.idJogador.nome", target = "nomeJogador")
    @Mapping(source = "idKey.idCarta.id", target = "idCarta")
    @Mapping(source = "idKey.idJogador.id", target = "idJogador")
    List<DeckDTO> paraDto(List<Deck> listaEntidade);
}