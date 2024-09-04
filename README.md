# Gerenciamento de Livros - API REST

Este repositório contém uma API REST desenvolvida para gerenciar livros. A API permite o cadastro de livros, a listagem de todos os livros e a exibição de detalhes de um livro específico. 

## Funcionalidades

- **Cadastrar Livros**: Adicionar novos livros à base de dados.
- **Listar Livros**: Recuperar a lista de todos os livros cadastrados.
- **Exibir Livro Específico**: Exibir os detalhes de um livro específico, como título, resumo, quantidade de páginas, autores e categoria.

## Estrutura do Projeto

O projeto segue a seguinte estrutura de componentes:

- **Controller**: Responsável por receber as requisições HTTP e retornar as respostas.
- **Repository**: Responsável pela comunicação com a base de dados.
- **Service**: Contém a lógica de negócio.
- **Exception Customizada**: Implementa erros personalizados para serem lançados em situações específicas.
- **Entity**: Representa a entidade "Livro" no sistema.
- **Request**: Estrutura utilizada para manipular as requisições de dados.

## Regras de Implementação

- **Tabela Única**: Todos os dados dos livros devem ser armazenados em uma única tabela.
- **Autores**: Os autores devem ser armazenados como strings separadas por vírgula (ex.: Paulo, Maria, Pedro).

## Equipe

- **Equipe 4**: Henrique, Roberto Lucas e Railan

## Inicialização do Banco de Dados

Para inicializar o banco de dados utilizando o Docker, execute o seguinte comando:

```bash
docker run --name mariadb-container -e MYSQL_ROOT_PASSWORD=minhasenha -e MYSQL_DATABASE=meubanco -d -p 3306:3306 mariadb:latest
