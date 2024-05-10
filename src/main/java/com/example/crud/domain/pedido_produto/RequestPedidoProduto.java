package com.example.crud.domain.pedido_produto;

import com.example.crud.domain.pedido.Pedido;
import com.example.crud.domain.product.Product;
import jakarta.validation.constraints.NotNull;

public record RequestPedidoProduto(
        Product produto,
        
        Pedido pedido,

        Integer quantidade,

        Double preco_unitario,
        @NotNull
        Double desconto
){

}