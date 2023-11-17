package com.uniesp.ecommerce.services;

import com.uniesp.ecommerce.entities.Cliente;
import com.uniesp.ecommerce.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> obterClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente cadastrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente atualizarCliente(Long id, Cliente novoCliente) {
        if (clienteRepository.existsById(id)) {
            novoCliente.setId(id);
            return clienteRepository.save(novoCliente);
        }
        return null; // Cliente não encontrado
    }

    public void excluirCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
