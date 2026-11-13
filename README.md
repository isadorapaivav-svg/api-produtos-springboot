# API de Gerenciamento de Produtos

Projeto desenvolvido utilizando Java e Spring Boot 2.7.18 para gerenciamento de produtos por meio de uma API REST.

## Tecnologias utilizadas

- Java 21
- Spring Boot 2.7.18
- Spring Web
- Spring Data JPA
- Spring Security
- Spring Boot Actuator
- Bean Validation
- Swagger / OpenAPI
- Banco de dados H2
- Maven

## Funcionalidades

- Cadastrar produtos (POST)
- Listar produtos (GET)
- Buscar produto por ID (GET)
- Atualizar produtos (PUT)
- Excluir produtos (DELETE)
- Validar dados dos produtos
- Autenticação com Spring Security
- Monitoramento da aplicação

## Estrutura dos produtos

Cada produto possui:

- ID
- Nome
- Descrição
- Preço
- Quantidade

## Endpoints

| Método | Endpoint | Funcionalidade |
|---|---|---|
| POST | `/api/produtos` | Cadastrar produto |
| GET | `/api/produtos` | Listar produtos |
| GET | `/api/produtos/{id}` | Buscar por ID |
| PUT | `/api/produtos/{id}` | Atualizar produto |
| DELETE | `/api/produtos/{id}` | Excluir produto |

## Banco de dados

O projeto utiliza o banco H2 em memória, integrado ao Spring Data JPA.

## Segurança

A aplicação utiliza Spring Security com autenticação HTTP Basic.

## Monitoramento

Utiliza Spring Boot Actuator para monitorar a saúde da aplicação.

Endpoint: `/actuator/health`

## Documentação

A documentação interativa da API está disponível pelo Swagger:

`/swagger-ui/index.html`

## Como executar

Execute os comandos:

```bash
./mvnw clean test
./mvnw spring-boot:run
```

## Objetivo

HEAD
HEAD
Projeto prático de aprendizagem dos fundamentos e práticas com Spring Boot, incluindo desenvolvimento de APIs REST e persistência de dados.# api-produtos-springboot

Projeto prático de aprendizagem dos fundamentos e práticas com Spring Boot, incluindo desenvolvimento de APIs REST e persistência de dados.
6b6748e (Entrega da API REST de produtos)

Projeto prático de aprendizagem dos fundamentos e práticas com Spring Boot, incluindo desenvolvimento de APIs REST, persistência de dados, validação, segurança e monitoramento.
2ceaa46 (Atualiza README do projeto)
