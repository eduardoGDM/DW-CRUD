CREATE TABLE product (
    id_produto SERIAL PRIMARY KEY,
    codigo VARCHAR(20) NOT NULL,
    descricao TEXT NOT NULL,
    valor_custo NUMERIC NOT NULL,
    valor_venda NUMERIC NOT NULL,
    active BOOLEAN
);
CREATE TABLE pedido (
    id_pedido SERIAL PRIMARY KEY,
    id_funcionario SERIAL,
    id_cliente SERIAL,
    data_pedido DATE NOT NULL,
    data_remessa DATE NOT NULL,
    active BOOLEAN
);
CREATE TABLE pedido_produto (
    id SERIAL,
    id_pedido SERIAL,
    id_produto SERIAL,
    quantidade INT,
    preco_unitario NUMERIC NOT NULL,
    desconto NUMERIC NOT NULL,
    PRIMARY KEY (id_pedido, id_produto),
    FOREIGN KEY (id_pedido) REFERENCES pedido(id_pedido),
    FOREIGN KEY (id_produto) REFERENCES product(id_produto)
);
