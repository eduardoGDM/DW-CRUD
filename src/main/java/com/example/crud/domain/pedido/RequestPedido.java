package com.example.crud.domain.pedido;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record RequestPedido(
        Integer id_pedido,

        Integer id_funcionario,

        Integer id_cliente,

        @NotNull
        Date data_pedido,
        @NotNull
        Date data_remessa
){

}
