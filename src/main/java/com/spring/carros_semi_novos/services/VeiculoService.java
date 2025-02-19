package com.spring.carros_semi_novos.services;

import com.spring.carros_semi_novos.domain.Veiculo;
import com.spring.carros_semi_novos.dto.VeiculoDTO;
import com.spring.carros_semi_novos.exception.VeiculoNotFoundException;
import com.spring.carros_semi_novos.repository.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
@RequiredArgsConstructor
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

    public Veiculo salvar(VeiculoDTO dto){
        Veiculo veiculo = new Veiculo(null, dto.getModelo(), dto.getMarca(),
                dto.getPlaca(), dto.getAno(), dto.getPreco());
        return repository.save(veiculo);
    }

    public Veiculo atualizar (Long id, VeiculoDTO dto) {
        Veiculo veiculo = buscarPorId(id);
        veiculo.setModelo(dto.getModelo());
        veiculo.setMarca(dto.getMarca());
        veiculo.setPlaca(dto.getPlaca());
        veiculo.setAno(dto.getAno());
        veiculo.setPreco(dto.getPreco());
        return repository.save(veiculo);
    }

    public void excluir(Long id){
        if (!repository.existsById(id)) {
            throw new VeiculoNotFoundException("Veículo não encontrado para exclusão!");
        }
        repository.deleteById(id);
    }
}
