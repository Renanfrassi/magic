package com.zappts.zappts.service;

import com.zappts.zappts.repository.CartaRepository;
import com.zappts.zappts.service.dto.CartaDTO;
import com.zappts.zappts.service.mapper.CartaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartaService {

    private final CartaRepository cartaRepository;
    private final CartaMapper cartaMapper;

    public List<CartaDTO> procurarTodos(){

        return cartaMapper.paraDto(cartaRepository.findAll());

    }

    public CartaDTO buscarPorId(int id){

        return cartaMapper.paraDto(cartaRepository.findById(id).get());

    }

    public CartaDTO salvar(CartaDTO carta){
        
        cartaRepository.save(cartaMapper.paraEntidade(carta));

        return carta;

    }

    public CartaDTO alterar(CartaDTO carta){
        
        cartaRepository.save(cartaMapper.paraEntidade(carta));

        return carta;

    }

    public void deletar(Integer id){
        
        cartaRepository.deleteById(id);

    }

}