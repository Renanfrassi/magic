package com.zappts.zappts.service.mapper;

import com.zappts.zappts.domain.Deck;
import com.zappts.zappts.service.dto.DeckDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DeckMapper extends GenericoMapper<DeckDTO, Deck>{
    
    @Override
    @Mapping(source = "nomeCarta", target = "id.idCarta.nome")
    @Mapping(source = "nomeJogador", target = "id.idJogador.nome")
    @Mapping(source = "idCarta", target = "id.idCarta.id")
    @Mapping(source = "idJogador", target = "id.idJogador.id")
    @Mapping(source = "id", target = "id.id")
    Deck paraEntidade(DeckDTO dto);
    
    @Override
    @Mapping(source = "nomeCarta", target = "id.idCarta.nome")
    @Mapping(source = "nomeJogador", target = "id.idJogador.nome")
    @Mapping(source = "idCarta", target = "id.idCarta.id")
    @Mapping(source = "idJogador", target = "id.idJogador.id")
    @Mapping(source = "id", target = "id.id")
    List<Deck> paraEntidade(List<DeckDTO> listaDto);
    
    @Override
    @Mapping(source = "id.idCarta.nome", target = "nomeCarta")
    @Mapping(source = "id.idJogador.nome", target = "nomeJogador")
    @Mapping(source = "id.idCarta.id", target = "idCarta")
    @Mapping(source = "id.idJogador.id", target = "idJogador")
    @Mapping(source = "id.id", target = "id")
    DeckDTO paraDto(Deck entidade);
    
    @Override
    @Mapping(source = "id.idCarta.nome", target = "nomeCarta")
    @Mapping(source = "id.idJogador.nome", target = "nomeJogador")
    @Mapping(source = "id.idCarta.id", target = "idCarta")
    @Mapping(source = "id.idJogador.id", target = "idJogador")
    @Mapping(source = "id.id", target = "id")
    List<DeckDTO> paraDto(List<Deck> listaEntidade);
}