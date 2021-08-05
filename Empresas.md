# Empresas :classical_building:



## 🛠 Funcionalidades

- Consulta listagem de empresas com método GET no endereço http://localhost:8080/listaEmpresas;

  - Caso haja registros no banco de dados, será retornado a listagem de empresas;

  - Caso não haja registro será retornado a seguinte mensagem:

    *"Nenhuma empresa está cadastrada. Para carregar os dados fictícios acesse http://localhost:8080/listaEmpresas/carregarEmpresas"*

- Carregar dados fictícios no banco de dados utilizando método GET no endereço http://localhost:8080/listaEmpresas/carregarEmpresas;

  - Serão carregados alguns registros fictícios ao banco de dados e será retornado a mensagem:

    *"Empresas carregadas com sucesso! Acesse novamente http://localhost:8080/listaEmpresas para ver os dados"*

    

## :computer: Tecnologia Aplicada

- Java 11;

- Spring Boot;

- JPA

- Hibernate

- Maven;

- H2 Database;

  

## 🚀 Preparação do Ambiente

- Será necessário instalar:
  - JDK11 ou superior;
  - Eclipse IDE
  - Postman
  - Git/Github
- Faça o clone do repositória em sua máquina;
- Clicando em *File* e *Import*, procure pela opção ***Existing Maven Projects***;
- Busque pelo local onde foi realizado o clone do repositório;
- O Maven irá baixar todas as dependências necessárias;
- Selecione o *EmpresaApplication.java* no package *br.com.eduardo.empresas*, clique com o botão direito e em seguida em ***Run As*** e ***Java Application***;
- O Eclipse irá subir a aplicação com o TomCat no endereço *localhost* utilizando a porta 8080;
- Utilize o Postman para realizar as requisições conforme descritas em **Funcionalidades** aqui no README;









