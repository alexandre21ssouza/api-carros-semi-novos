package com.spring.carros_semi_novos.controller;

import com.spring.carros_semi_novos.domain.Veiculo;
import com.spring.carros_semi_novos.services.VeiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
@RequiredArgsConstructor
public class VeiculoController {
    private final VeiculoService service;


    @GetMapping
    public List<Veiculo> listar(){
        return service.listarTodos();
    }
}
