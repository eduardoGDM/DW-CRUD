package com.example.crud.domain.product;
import com.example.crud.domain.pedido.Pedido;
import com.example.crud.domain.pedido_produto.PedidoProduto;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.HashSet;
import java.util.UUID;

@Table(name="product")
@Entity(name="product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id_produto")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_produto;

    private String codigo;

    private String descricao;

    private Double valor_custo;

    private Double valor_venda;
    
    private Boolean active;
    
    public Product(RequestProduct requestProduct) {
        this.codigo = requestProduct.codigo();
        this.descricao = requestProduct.descricao();
        this.valor_custo = requestProduct.valor_custo();
        this.valor_venda = requestProduct.valor_venda();
        this.active = true;
        
    }
}
