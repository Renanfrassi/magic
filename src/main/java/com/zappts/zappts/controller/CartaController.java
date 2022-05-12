package com.zappts.zappts.controller;

import com.zappts.zappts.service.CartaService;
import com.zappts.zappts.service.dto.CartaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/carta")
@RequiredArgsConstructor
public class CartaController {
    private final CartaService cartaService;

    @GetMapping
    public ResponseEntity<List<CartaDTO>> procurarTodos(){
        return ResponseEntity.ok().body(cartaService.procurarTodos());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CartaDTO> procurarPorId(@PathVariable int id){
        return ResponseEntity.ok().body(cartaService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<CartaDTO> salvar(@RequestBody CartaDTO carta){
        return ResponseEntity.created(URI.create("./api/carta")) .body(cartaService.salvar(carta));
    }

    @PutMapping
    public ResponseEntity<CartaDTO> alterar(@RequestBody CartaDTO carta){
        return ResponseEntity.ok().body(cartaService.alterar(carta));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id){
        cartaService.deletar(id);
        return ResponseEntity.noContent().build();
    }

}