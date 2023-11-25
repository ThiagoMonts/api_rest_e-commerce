package com.uniesp.ecommerce.controllers;

import com.uniesp.ecommerce.entities.NotaFiscal;
import com.uniesp.ecommerce.services.NotaFiscalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notasfiscais")
public class NotaFiscalController {
    @Autowired
    private NotaFiscalService notaFiscalService;

    @GetMapping
    public ResponseEntity<List<NotaFiscal>> listarNotasFiscais() {
        List<NotaFiscal> notasFiscais = notaFiscalService.listarNotasFiscais();
        return ResponseEntity.ok(notasFiscais);
    }

    @GetMapping("/{id}")
    public ResponseEntity<NotaFiscal> obterNotaFiscalPorId(@PathVariable Long id) {
        NotaFiscal notaFiscal = notaFiscalService.obterNotaFiscalPorId(id);
        if (notaFiscal != null) {
            return ResponseEntity.ok(notaFiscal);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<NotaFiscal> cadastrarNotaFiscal(@RequestBody NotaFiscal notaFiscal) {
        NotaFiscal novaNotaFiscal = notaFiscalService.cadastrarNotaFiscal(notaFiscal);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaNotaFiscal);
    }

}
