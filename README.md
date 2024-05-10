Alunos: Luan Hernandes, Victor Rafael, João Barbosa
<h1>Sistema de Vendas - CRUD Backend</h1>

Tecnologias Utilizadas<br/>
Java: A linguagem de programação principal para o desenvolvimento do backend.<br/>
Spring Framework: Utilizado para implementar o padrão arquitetural MVC (Model-View-Controller), fornecendo estrutura e suporte para o desenvolvimento web.<br/>
Spring Boot: Facilita a configuração e inicialização do projeto Spring, reduzindo a quantidade de configuração necessária.<br/>
Spring Data JPA: Oferece suporte para operações de acesso a banco de dados usando a abordagem de ORM (Object-Relational Mapping).<br/>
Banco de Dados Relacional: Utilizamos um banco de dados relacional PostgreSQL para armazenar os dados do sistema.<br/><br/>
Estrutura do Projeto
O projeto segue a estrutura padrão do Spring Boot MVC, com os seguintes componentes principais:

Model: Classes que representam as entidades do sistema, como Produto, PedidoProduto, Pedido, etc.<br/>
Repository: Interfaces que estendem JpaRepository para realizar operações CRUD no banco de dados.<br/>
Service: Classes que contêm a lógica de negócios do sistema e interagem com os repositórios para realizar operações no banco de dados.<br/>
Controller: Classes responsáveis por lidar com as requisições HTTP, chamando os serviços apropriados e retornando as respostas adequadas.<br/><br/>
Configuração do Ambiente
Java: Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina.<br/>
Spring Framework: O projeto Spring Boot já contém as dependências necessárias para o desenvolvimento web. Basta importar o projeto em sua IDE preferida.<br/>
Banco de Dados: Configure as propriedades de conexão com o banco de dados no arquivo application.properties ou application.yml, conforme o banco de dados utilizado.<br/><br/>
Execução do Projeto
Clone ou faça o download do repositório do projeto.<br/>
Importe o projeto em sua IDE.<br/>
Certifique-se de que todas as dependências foram baixadas e configuradas corretamente.<br/>
Execute a aplicação Spring Boot. Isso iniciará o servidor embutido Tomcat e implantará a aplicação.<br/>
Acesse os endpoints REST fornecidos pelo CRUD através de um cliente HTTP (por exemplo, Postman) ou integre-os com a parte frontend do sistema.<br/><br/>
Endpoints Disponíveis
Os endpoints disponíveis no CRUD podem incluir, mas não se limitam a:

/produtos: CRUD para gerenciar produtos.
/pedido_produto: CRUD para gerenciar pedidos produtos.
/pedidos: CRUD para gerenciar pedidos.
Para cada endpoint, existem operações HTTP correspondentes (GET, POST, PUT, DELETE) que podem ser usadas para manipular os dados.
