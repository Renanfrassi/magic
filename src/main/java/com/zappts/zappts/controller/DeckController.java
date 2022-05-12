package com.zappts.zappts.controller;

import com.zappts.zappts.service.DeckService;
import com.zappts.zappts.service.dto.DeckDTO;
import com.zappts.zappts.service.dto.DeckJogadorDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/deck")
@RequiredArgsConstructor
public class DeckController {

    private final DeckService deckService;


    @GetMapping
    public ResponseEntity<List<DeckDTO>> procurarTodos(){
        return ResponseEntity.ok().body(deckService.procurarTodos());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<DeckDTO> buscarPorId(@PathVariable int id){
        return ResponseEntity.ok().body(deckService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<DeckDTO> salvar(@RequestBody DeckDTO deck){
        return ResponseEntity.created(URI.create("./api/deck")) .body(deckService.salvar(deck));
    }

    @PutMapping
    public ResponseEntity<DeckDTO> alterar(@RequestBody DeckDTO deck){
        return ResponseEntity.ok().body(deckService.alterar(deck));
    }

    @DeleteMapping(value = "/{nomeDeck}/{idCarta}/{idJogador}")
    public ResponseEntity<Void> deletarCartaDoDeck(@PathVariable String nomeDeck, @PathVariable Integer idCarta, @PathVariable Integer idJogador){
        deckService.deletarCartaDoDeck(nomeDeck, idCarta, idJogador);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "jogador-cartas/{id}/{nomeDeck}")
    public ResponseEntity<DeckJogadorDTO> buscaDeck(@PathVariable Integer id, @PathVariable String nomeDeck){
        return ResponseEntity.ok().body(deckService.buscaDeck(id, nomeDeck));
    }

    @GetMapping(value = "jogador/{id}")
    public ResponseEntity<List<DeckJogadorDTO>> buscaDeckPorIdJogador(@PathVariable Integer id){
        return ResponseEntity.ok().body(deckService.buscaDeckPorIdJogador(id));
    }

}
