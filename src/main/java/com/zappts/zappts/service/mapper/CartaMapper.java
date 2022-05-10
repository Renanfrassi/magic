package com.zappts.zappts.service.mapper;

import com.zappts.zappts.domain.Carta;
import com.zappts.zappts.service.dto.CartaDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CartaMapper extends GenericoMapper<CartaDTO, Carta>{
    @Override
    Carta paraEntidade(CartaDTO dto);
    @Override
    List<Carta> paraEntidade(List<CartaDTO> listaDto);
    @Override
    CartaDTO paraDto(Carta entidade);
    @Override
    List<CartaDTO> paraDto(List<Carta> listaEntidade);
}