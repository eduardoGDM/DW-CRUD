package com.example.crud.domain.pedido;

import lombok.*;

import jakarta.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.example.crud.domain.pedido_produto.PedidoProduto;
import com.example.crud.domain.product.Product;

@Entity(name = "pedido")
@Table(name = "pedido")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id_pedido")
public class Pedido {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pedido;

    private Integer id_funcionario;

    private Integer id_cliente;

    private Date data_pedido;

    private Date data_remessa;

    private Boolean active;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PedidoProduto> produtos = new HashSet<>();

    public Pedido(RequestPedido requestPedido) {
        this.id_funcionario = requestPedido.id_funcionario();
        this.id_cliente = requestPedido.id_cliente();
        this.data_pedido = requestPedido.data_pedido();
        this.data_remessa = requestPedido.data_remessa();
        this.active = true;
    }
}
