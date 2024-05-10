package com.example.crud.controllers;

import com.example.crud.domain.pedido.Pedido;
import com.example.crud.domain.pedido.PedidoRepository;
import com.example.crud.domain.pedido.RequestPedido;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private PedidoRepository repository;

    @SuppressWarnings("rawtypes")
    @GetMapping
    public ResponseEntity getAllPedidos(){
        var allPedidos = repository.findAllByActiveTrue();
        return ResponseEntity.ok(allPedidos);
    }

    @SuppressWarnings("rawtypes")
    @PostMapping
    public ResponseEntity registerPedido(@RequestBody @Valid RequestPedido data){
        Pedido newPedido = new Pedido(data);
        repository.save(newPedido);
        return ResponseEntity.ok().build();
    }

    @SuppressWarnings("rawtypes")
    @PutMapping
    @Transactional
    public ResponseEntity updatePedido(@RequestBody @Valid RequestPedido data){
        Optional<Pedido> optionalPedido = repository.findById(data.id_pedido());
        if (optionalPedido.isPresent()) {
            Pedido pedido = optionalPedido.get();
            pedido.setId_funcionario(data.id_funcionario());
            pedido.setId_cliente(data.id_cliente());
            pedido.setData_pedido(data.data_pedido());
            pedido.setData_remessa(data.data_remessa());
            return ResponseEntity.ok(pedido);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @SuppressWarnings("rawtypes")
    @DeleteMapping("/{id_pedido}")
    @Transactional
    public ResponseEntity deletePedido(@PathVariable Integer id_pedido){
        Optional<Pedido> optionalPedido = repository.findById(id_pedido);
        if (optionalPedido.isPresent()) {
            Pedido pedido = optionalPedido.get();
            pedido.setActive(false);
            return ResponseEntity.noContent().build();
        } else {
            throw new EntityNotFoundException();
        }
    }

}

