package com.zappts.zappts.controller;

import com.zappts.zappts.service.JogadorService;
import com.zappts.zappts.service.dto.JogadorDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.net.URI;
import java.util.List;

@Transactional
@RestController
@RequestMapping("/api/jogador")
@RequiredArgsConstructor
public class JogadorController {

    private final JogadorService jogadorService;


    @GetMapping
    public ResponseEntity<List<JogadorDTO>> procurarTodos(){
        return ResponseEntity.ok().body(jogadorService.procurarTodos());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<JogadorDTO> buscarPorId(@PathVariable int id){
        return ResponseEntity.ok().body(jogadorService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<JogadorDTO> salvar(@RequestBody JogadorDTO jogador){
        return ResponseEntity.created(URI.create("./api/jogador")) .body(jogadorService.salvar(jogador));
    }

    @PutMapping
    public ResponseEntity<JogadorDTO> alterar(@RequestBody JogadorDTO jogador){
        return ResponseEntity.ok().body(jogadorService.alterar(jogador));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id){
        jogadorService.deletar(id);
        return ResponseEntity.noContent().build();
    }

}