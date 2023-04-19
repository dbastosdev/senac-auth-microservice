# senac-auth-microservice

Projeto backend para geração de token jwt. 

Para rodar o projeto: 

## 1) Dados da aplicação: 

- Java 17
- Spring Boot 2.4.4
- Banco de dados H2
- Spring Data JPA
- Spring Validation
- Maven

## 2) Funcionamento

A api possui endpoint de login para obtenção de token jwt. E rotas acessíveis apenas com a utilização do token para teste. 

## 3) Endpoints

| Method | url | body | reponse
|---|---|---|---|
| `POST` | /oauth/token| username, password e grant_type | Token JWT
| `GET` | /users | Authorization + token | Retorna todos os usuários

## 4) Entidades para autenticação: 

Composto por User e Role. Com relação N:N. 
