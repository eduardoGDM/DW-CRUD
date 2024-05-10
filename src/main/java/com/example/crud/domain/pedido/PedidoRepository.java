package com.example.crud.domain.pedido;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.UUID;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    List<Pedido> findAllByActiveTrue();
}