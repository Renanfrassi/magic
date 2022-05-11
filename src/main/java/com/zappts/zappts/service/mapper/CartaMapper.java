package com.zappts.zappts.service.mapper;

import com.zappts.zappts.domain.Carta;
import com.zappts.zappts.service.dto.CartaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CartaMapper extends GenericoMapper<CartaDTO, Carta>{
    @Override
    @Mapping(source = "idIdioma", target = "idioma.id")
    @Mapping(source = "nomeIdioma", target = "idioma.nome")
    Carta paraEntidade(CartaDTO dto);
    @Override
    @Mapping(source = "idIdioma", target = "idioma.id")
    @Mapping(source = "nomeIdioma", target = "idioma.nome")
    List<Carta> paraEntidade(List<CartaDTO> listaDto);
    @Override
    @Mapping(source = "idioma.id", target = "idIdioma")
    @Mapping(source = "idioma.nome", target = "nomeIdioma")
    CartaDTO paraDto(Carta entidade);
    @Override
    @Mapping(source = "idioma.id", target = "idIdioma")
    @Mapping(source = "idioma.nome", target = "nomeIdioma")
    List<CartaDTO> paraDto(List<Carta> listaEntidade);
}