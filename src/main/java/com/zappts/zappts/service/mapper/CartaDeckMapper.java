package com.zappts.zappts.service.mapper;

import com.zappts.zappts.domain.Carta;
import com.zappts.zappts.service.dto.CartaDeckDTO;
import org.mapstruct.Mapper;

import java.util.List;

public class CartaDeckMapper {

    @Mapper(componentModel = "spring")
    public interface CartaMapper extends GenericoMapper<CartaDeckDTO, Carta>{

        @Override
        Carta paraEntidade(CartaDeckDTO dto);

        @Override
        List<Carta> paraEntidade(List<CartaDeckDTO> listaDto);

        @Override
        CartaDeckDTO paraDto(Carta entidade);

        @Override
        List<CartaDeckDTO> paraDto(List<Carta> listaEntidade);
    }

}
