# Descri��o:

Este projeto � uma amostra simples de gerenciamento de estoques para fins de demonstra��o dos recursos do Spring Framework e utiliza��o do banco de dados n�o-relacional MongoDB.
Ele conta com telas de cadatro de fornecedores, clientes, produtos e estoque, tamb�m comtempla a movimenta��o de vendas de produtos que acarretam na diminui��o do estoque. 
Uma tela de adminsitra��o � outra funcionalidade para apoio de indicadores como, alertas de estoque m�nimo e m�ximo de determinado produto, 
totalizadores de vendas por m�s e por categoria de produtos e relat�rios gerais com filtros personalizados.

Nas pr�ximas vers�es ser�o entregues um controle de acesso, cadastramento de novos usu�rios e associa��es � perfis.

# Ferramentas:

* Spring Tool Suite 4
* Robo 3T

# Tecnologias:

* JDK 1.8+
* Spring Boot
* Spring MVC
* MongoDB
* Maven
* Git
* Thymeleaf

# Clonar e importar projeto

1. Na raiz do reposit�rio do GitHub, clique em "clone or download" e copie o link
2. Abra o STS e crie um workspace
3. Na view Git Repositories, clique em "Clone a Git Repository"
4. Cole a URI copiada > "Next" > Escolha a branch master
5. Informe o diret�rio onde ficar�o os reposit�rios locais e clique em "Finish"
6. Expanda o reposit�rio e a Working Tree
7. Selecione projeto "controle-estoque-web", clique com o bot�o direito e depois em "Import Projects"
8. Selecione o projeto e clique em "Finish"

# Build

* mvn clean install

# Inicializa��o

* mvn cargo:run

Obs: Ir� inicializar na porta '8082'

# Access the pages using the URLs:

* http://localhost:8080/produtos/listar
* http://localhost:8080/produtos/adicionarProduto
* http://localhost:8080/categoria/listar
* http://localhost:8080/categorias/adicionarCategoria
* http://localhost:8080/fornecedores/listar
* http://localhost:8080/fornecedores/adicionarFornecedor
* http://localhost:8080/inventarios/listar
* http://localhost:8080/clientes/listar
* http://localhost:8080/clientes/adicionarCliente

# Funcionalidades previstas

* Cadastro de produtos e categorias de produtos
* Cadastro de fornecedores e clientes
* Realiza��o de venda e controle por itens vendidos
* Aplica��o de desconto
* Realiza��o de venda mediante quantidade em estoque
* Alertas de estoque m�nimo e m�ximo atingidos
* Relat�rios de acompanhamento de vendas
* Controle de usu�rios


