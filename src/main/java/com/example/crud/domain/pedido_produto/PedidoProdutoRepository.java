package com.example.crud.domain.pedido_produto;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.UUID;

public interface PedidoProdutoRepository extends JpaRepository<PedidoProduto, Integer> {
}