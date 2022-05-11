package com.zappts.zappts.service.mapper;

import com.zappts.zappts.domain.Jogador;
import com.zappts.zappts.service.dto.JogadorDTO;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface DeckJogadorMapper extends GenericoMapper<DeckJogadorDTO, Deck>{
    
    @Override
    @Mapping(source = "nomeJogador", target = "idKey.idJogador.nome")
    @Mapping(source = "idJogador", target = "idKey.idJogador.id")
    Deck paraEntidade(DeckJogadorDTO dto);
    
    @Override
    @Mapping(source = "nomeJogador", target = "idKey.idJogador.nome")
    @Mapping(source = "idJogador", target = "idKey.idJogador.id")
    List<Deck> paraEntidade(List<DeckJogadorDTO> listaDto);
    
    @Override
    @Mapping(source = "idKey.idJogador.nome", target = "nomeJogador")
    @Mapping(source = "idKey.idJogador.id", target = "idJogador")
    DeckJogadorDTO paraDto(Deck entidade);
    
    @Override
    @Mapping(source = "idKey.idJogador.nome", target = "nomeJogador")
    @Mapping(source = "idKey.idJogador.id", target = "idJogador")
    List<DeckJogadorDTO> paraDto(List<Deck> listaEntidade);
}