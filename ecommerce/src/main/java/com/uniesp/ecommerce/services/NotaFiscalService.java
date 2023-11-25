package com.uniesp.ecommerce.services;

import com.uniesp.ecommerce.entities.NotaFiscal;
import com.uniesp.ecommerce.repositories.NotaFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaFiscalService {
    @Autowired
    private NotaFiscalRepository notaFiscalRepository;

    public List<NotaFiscal> listarNotasFiscais() {
        return notaFiscalRepository.findAll();
    }

    public NotaFiscal obterNotaFiscalPorId(Long id) {
        return notaFiscalRepository.findById(id).orElse(null);
    }

    public NotaFiscal cadastrarNotaFiscal(NotaFiscal notaFiscal) {
        return notaFiscalRepository.save(notaFiscal);
    }
}
