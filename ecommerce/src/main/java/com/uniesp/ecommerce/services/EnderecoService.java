package com.uniesp.ecommerce.services;

import com.uniesp.ecommerce.entities.Endereco;
import com.uniesp.ecommerce.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> listarEnderecos() {
        return enderecoRepository.findAll();
    }

    public Endereco obterEnderecoPorId(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }

    public Endereco cadastrarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
}
