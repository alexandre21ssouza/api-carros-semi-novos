package com.spring.carros_semi_novos.services;

import com.spring.carros_semi_novos.domain.Veiculo;
import com.spring.carros_semi_novos.exception.VeiculoNotFoundException;
import com.spring.carros_semi_novos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public List<Veiculo> listarTodos(){
        return  repository.findAll();
    }

    public Veiculo buscarPorId(Long id){

        Veiculo veiculo = repository.findById(id).orElse(null);
        if (veiculo == null){
            throw new VeiculoNotFoundException("Veículo não encontrado");
        }
        return veiculo;
    }

    public Veiculo salvar(Veiculo veiculo){
        return repository.save(veiculo);
    }

    public void excluir(Long id){
        repository.deleteById(id);
    }
}
