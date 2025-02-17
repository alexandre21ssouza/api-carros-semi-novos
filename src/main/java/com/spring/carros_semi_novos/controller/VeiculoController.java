package com.spring.carros_semi_novos.controller;

import com.spring.carros_semi_novos.domain.Veiculo;
import com.spring.carros_semi_novos.dto.VeiculoDTO;
import com.spring.carros_semi_novos.services.VeiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
@RequiredArgsConstructor
public class VeiculoController {
    private final VeiculoService service;


    @GetMapping
    public ResponseEntity<List<Veiculo>> listar(){
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> buscarPorId(@PathVariable Long id) {
        Veiculo veiculo = service.buscarPorId(id);
        return ResponseEntity.ok(veiculo);
    }

    @PostMapping
    public ResponseEntity<Veiculo> adicionar(@RequestBody VeiculoDTO dto){
        Veiculo veiculo = service.salvar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(veiculo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> atualizar(@PathVariable Long id,
                                             @RequestBody VeiculoDTO dto){
        Veiculo veiculo = service.atualizar(id, dto);
        return ResponseEntity.ok(veiculo);
    }

    @DeleteMapping("{/id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }

}
