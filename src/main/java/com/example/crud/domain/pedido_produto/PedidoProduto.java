package com.example.crud.domain.pedido_produto;

import com.example.crud.domain.pedido.Pedido;
import com.example.crud.domain.product.Product;
import com.example.crud.domain.pedido_produto.RequestPedidoProduto;

import jakarta.persistence.*;
import lombok.*;

// Anotações do Lombok para gerar getters, setters, construtores e métodos equals/hashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "pedido_produto")
public class PedidoProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_pedido", nullable = false)
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_produto", nullable = false)
    private Product produto;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private Double preco_unitario;

    @Column(nullable = true)
    private Double desconto;

    // Construtor adicional para facilitar a criação de instâncias com todos os atributos
    public PedidoProduto(RequestPedidoProduto requestPedidoProduto) {
        this.pedido = requestPedidoProduto.pedido();
        this.produto = requestPedidoProduto.produto();
        this.quantidade = requestPedidoProduto.quantidade();
        this.preco_unitario = requestPedidoProduto.preco_unitario();
        this.desconto = requestPedidoProduto.desconto();
    }
}
