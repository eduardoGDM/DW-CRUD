package com.example.crud.controllers;

import com.example.crud.domain.pedido_produto.PedidoProduto;
import com.example.crud.domain.pedido_produto.PedidoProdutoRepository;
import com.example.crud.domain.pedido_produto.RequestPedidoProduto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido_produto")
public class PedidoProdutoController {

    @Autowired
    private PedidoProdutoRepository repository;

    @PostMapping
    public ResponseEntity<PedidoProduto> createPedidoProduto(@RequestBody PedidoProduto pedidoProduto) {
        return ResponseEntity.ok(repository.save(pedidoProduto));
    }

    @GetMapping
    public ResponseEntity<List<PedidoProduto>> getAllPedidoProdutos() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<PedidoProduto> updatePedidoProduto(@PathVariable Integer id, @RequestBody PedidoProduto pedidoProduto) {
        PedidoProduto existing = repository.findById(id).orElseThrow(() -> new RuntimeException("PedidoProduto not found"));
        existing.setQuantidade(pedidoProduto.getQuantidade());
        existing.setPreco_unitario(pedidoProduto.getPreco_unitario());
        existing.setDesconto(pedidoProduto.getDesconto());
        return ResponseEntity.ok(repository.save(existing));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePedidoProduto(@PathVariable Integer id) {
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
