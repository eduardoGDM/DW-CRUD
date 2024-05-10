Alunos: Luan Hernandes, Victor Rafael, João Barbosa
<h1>Sistema de Vendas - CRUD Backend</h1>

Tecnologias Utilizadas
Java: A linguagem de programação principal para o desenvolvimento do backend.
Spring Framework: Utilizado para implementar o padrão arquitetural MVC (Model-View-Controller), fornecendo estrutura e suporte para o desenvolvimento web.
Spring Boot: Facilita a configuração e inicialização do projeto Spring, reduzindo a quantidade de configuração necessária.
Spring Data JPA: Oferece suporte para operações de acesso a banco de dados usando a abordagem de ORM (Object-Relational Mapping).
Banco de Dados Relacional: Utilizamos um banco de dados relacional PostgreSQL para armazenar os dados do sistema.
Estrutura do Projeto
O projeto segue a estrutura padrão do Spring Boot MVC, com os seguintes componentes principais:

Model: Classes que representam as entidades do sistema, como Produto, PedidoProduto, Pedido, etc.
Repository: Interfaces que estendem JpaRepository para realizar operações CRUD no banco de dados.
Service: Classes que contêm a lógica de negócios do sistema e interagem com os repositórios para realizar operações no banco de dados.
Controller: Classes responsáveis por lidar com as requisições HTTP, chamando os serviços apropriados e retornando as respostas adequadas.
Configuração do Ambiente
Java: Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina.
Spring Framework: O projeto Spring Boot já contém as dependências necessárias para o desenvolvimento web. Basta importar o projeto em sua IDE preferida.
Banco de Dados: Configure as propriedades de conexão com o banco de dados no arquivo application.properties ou application.yml, conforme o banco de dados utilizado.
Execução do Projeto
Clone ou faça o download do repositório do projeto.
Importe o projeto em sua IDE.
Certifique-se de que todas as dependências foram baixadas e configuradas corretamente.
Execute a aplicação Spring Boot. Isso iniciará o servidor embutido Tomcat e implantará a aplicação.
Acesse os endpoints REST fornecidos pelo CRUD através de um cliente HTTP (por exemplo, Postman) ou integre-os com a parte frontend do sistema.
Endpoints Disponíveis
Os endpoints disponíveis no CRUD podem incluir, mas não se limitam a:

/produtos: CRUD para gerenciar produtos.
/pedido_produto: CRUD para gerenciar pedidos produtos.
/pedidos: CRUD para gerenciar pedidos.
Para cada endpoint, existem operações HTTP correspondentes (GET, POST, PUT, DELETE) que podem ser usadas para manipular os dados.
