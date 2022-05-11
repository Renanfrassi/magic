package com.zappts.zappts.service;

import com.zappts.zappts.repository.DeckRepository;
import com.zappts.zappts.repository.JogadorRepository;
import com.zappts.zappts.service.dto.DeckDTO;
import com.zappts.zappts.service.dto.JogadorDTO;
import com.zappts.zappts.service.mapper.DeckMapper;
import com.zappts.zappts.service.mapper.JogadorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class DeckService {

    private final DeckRepository deckRepository;
    private final DeckMapper deckMapper;

    public List<DeckDTO> procurarTodos(){

        return deckMapper.paraDto(deckRepository.findAll());

    }

    public DeckDTO buscarPorId(int id){

        return deckMapper.paraDto(deckRepository.findById(id).get());

    }

    public DeckDTO salvar(DeckDTO deck){

        deckRepository.save(deckMapper.paraEntidade(deck));

        return deck;

    }

    public DeckDTO alterar(DeckDTO deck){

        deckRepository.save(deckMapper.paraEntidade(deck));

        return deck;

    }

    public String deletar(int id){

        deckRepository.deleteById(id);

        return "Jogador deletada com sucesso!";

    }
}
