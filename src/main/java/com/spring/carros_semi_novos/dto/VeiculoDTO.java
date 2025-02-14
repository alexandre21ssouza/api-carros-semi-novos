package com.spring.carros_semi_novos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VeiculoDTO {
    private String modelo;
    private String marca;
    private String placa;
    private int ano;
    private double preco;
}
