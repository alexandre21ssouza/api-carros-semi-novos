package com.spring.carros_semi_novos.services;

import com.spring.carros_semi_novos.domain.Carro;
import com.spring.carros_semi_novos.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository repository;

    public List<Carro> listarTodos(){
        return  repository.findAll();
    }

    public Optional<Carro> buscarPorId(Long id){
        return repository.findById(id);
    }

    public Carro salvar(Carro carro){
        return repository.save(carro);
    }

    public void excluir(Long id){
        repository.deleteById(id);
    }
}
