package com.zappts.zappts.service;

import com.zappts.zappts.repository.JogadorRepository;
import com.zappts.zappts.service.dto.JogadorDTO;
import com.zappts.zappts.service.mapper.JogadorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class JogadorService {

    private final JogadorRepository jogadorRepository;

    private final JogadorMapper jogadorMapper;

    public List<JogadorDTO> procurarTodos(){

        return jogadorMapper.paraDto(jogadorRepository.findAll());

    }

    public JogadorDTO buscarPorId(int id){

        return jogadorMapper.paraDto(jogadorRepository.findById(id).get());

    }

    public JogadorDTO salvar(JogadorDTO jogador){
        
        jogadorRepository.save(jogadorMapper.paraEntidade(jogador));

        return jogador;

    }

    public JogadorDTO alterar(JogadorDTO jogador){
        
        jogadorRepository.save(jogadorMapper.paraEntidade(jogador));

        return jogador;

    }

    public void deletar(Integer id){
        
        jogadorRepository.deleteById(id);

    }

}