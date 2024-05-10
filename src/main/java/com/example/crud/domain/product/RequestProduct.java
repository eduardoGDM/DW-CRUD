package com.example.crud.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestProduct(
        Integer id_produto,
        
        @NotBlank
        String codigo,
        @NotBlank
        String descricao,
        @NotNull
        Double valor_custo,
        @NotNull
        Double valor_venda
){

}