package com.zappts.zappts.service;

import com.zappts.zappts.repository.DeckRepository;
import com.zappts.zappts.service.dto.DeckDTO;
import com.zappts.zappts.service.dto.DeckJogadorDTO;
import com.zappts.zappts.service.mapper.DeckMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DeckService {

    private final DeckRepository deckRepository;

    private final DeckMapper deckMapper;

    public List<DeckDTO> procurarTodos() {

        return deckMapper.paraDto(deckRepository.findAll());

    }

    public DeckDTO buscarPorId(int id) {

        return deckMapper.paraDto(deckRepository.findById(id).get());

    }

    public DeckDTO salvar(DeckDTO deck) {

        deckRepository.save(deckMapper.paraEntidade(deck));

        return deck;

    }

    public DeckDTO alterar(DeckDTO deck) {

        deckRepository.save(deckMapper.paraEntidade(deck));

        return deck;

    }

    @Transactional
    public void deletarCartaDoDeck(String nomeDeck, Integer idCarta, Integer idJogador) {

        deckRepository.deletarCartaDoDeck(nomeDeck, idCarta, idJogador);

    }

    public List<DeckJogadorDTO> buscaDeckPorIdJogador(Integer idJogador) {

        List<DeckJogadorDTO> deckJogador = deckRepository.buscaDeckPorIdJogador(idJogador);

        deckJogador.stream().forEach(
                deck -> {
                    deck.setCartas(deckRepository.buscaCartasDeckJogador(idJogador, deck.getNomeDeck()));
                }
        );

        return deckJogador;
    }

    public DeckJogadorDTO buscaDeck(Integer idJogador, String nomeDeck) {
        DeckJogadorDTO deckJogador = deckRepository.buscaDeck(idJogador, nomeDeck);

        deckJogador.setCartas(deckRepository.buscaCartasDeckJogador(idJogador, nomeDeck));

        return deckJogador;

    }


}
