package com.projectmannage.springads.infrastructure.controller;

import com.projectmannage.springads.domain.entity.Cliente;
import com.projectmannage.springads.domain.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService service;

    // Injeção de dependência do Service via construtor
    public ClienteController(ClienteService service) {
        this.service = service;
    }

    // Endpoint para salvar um novo cliente (POST
    // http://localhost:8080/api/clientes)
    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente) {
        Cliente clienteSalvo = service.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteSalvo);
    }

    // Endpoint para listar todos os clientes (GET
    // http://localhost:8080/api/clientes)
    @GetMapping
    public ResponseEntity<List<Cliente>> listar() {
        List<Cliente> clientes = service.listarTodos();
        return ResponseEntity.ok(clientes);
    }

    // Endpoint para buscar por ID (GET http://localhost:8080/api/clientes/{id})
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Endpoint para deletar por ID (DELETE http://localhost:8080/api/clientes/{id})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}