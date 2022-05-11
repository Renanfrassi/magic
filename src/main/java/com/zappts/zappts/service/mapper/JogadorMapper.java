package com.zappts.zappts.service.mapper;

import com.zappts.zappts.domain.Jogador;
import com.zappts.zappts.service.dto.JogadorDTO;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface JogadorMapper extends GenericoMapper<JogadorDTO, Jogador>{
    
    @Override
    Jogador paraEntidade(JogadorDTO dto);
    
    @Override
    List<Jogador> paraEntidade(List<JogadorDTO> listaDto);
    
    @Override
    JogadorDTO paraDto(Jogador entidade);
    
    @Override
    List<JogadorDTO> paraDto(List<Jogador> listaEntidade);
}