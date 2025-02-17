package com.spring.carros_semi_novos.controller;

import com.spring.carros_semi_novos.domain.Veiculo;
import com.spring.carros_semi_novos.dto.VeiculoDTO;
import com.spring.carros_semi_novos.services.VeiculoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
@RequiredArgsConstructor
@Tag(name = "Veículos", description = "Gerenciamento de estoque de Veículos")
public class VeiculoController {
    private final VeiculoService service;

    @Operation(summary = "Lista todos os veículos")
    @GetMapping
    public ResponseEntity<List<Veiculo>> listar(){
        return ResponseEntity.ok(service.listarTodos());
    }

    @Operation(summary = "Busca os veículos pelo id")
    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> buscarPorId(@PathVariable Long id) {
        Veiculo veiculo = service.buscarPorId(id);
        return ResponseEntity.ok(veiculo);
    }

    @Operation(summary = "Adiciona um novo veículo")
    @PostMapping
    public ResponseEntity<Veiculo> adicionar(@RequestBody VeiculoDTO dto){
        Veiculo veiculo = service.salvar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(veiculo);
    }

    @Operation(summary = "Atualiza um veículo pelo id")
    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> atualizar(@PathVariable Long id,
                                             @RequestBody VeiculoDTO dto){
        Veiculo veiculo = service.atualizar(id, dto);
        return ResponseEntity.ok(veiculo);
    }

    @Operation(summary = "Remove um veículo pelo id")
    @DeleteMapping("{/id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }

}
