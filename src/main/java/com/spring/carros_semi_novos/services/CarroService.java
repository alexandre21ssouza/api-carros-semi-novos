package com.spring.carros_semi_novos.services;

import com.spring.carros_semi_novos.domain.Veiculo;
import com.spring.carros_semi_novos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private VeiculoRepository repository;

    public List<Veiculo> listarTodos(){
        return  repository.findAll();
    }

    public Optional<Veiculo> buscarPorId(Long id){
        return repository.findById(id);
    }

    public Veiculo salvar(Veiculo veiculo){
        return repository.save(veiculo);
    }

    public void excluir(Long id){
        repository.deleteById(id);
    }
}
