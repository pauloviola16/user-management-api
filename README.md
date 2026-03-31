# User Management API 👤
![Status](https://img.shields.io/badge/Status-Completo-brightgreen)
![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-Framework-brightgreen)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data-JPA-blue)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![Docker](https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=white)
![Swagger](https://img.shields.io/badge/Swagger-UI-85EA2D?logo=swagger&logoColor=black)

API REST desenvolvida com **Java e Spring Boot** para gerenciamento de usuários.  
Este projeto foi criado com o objetivo de praticar a construção de **APIs backend organizadas**, utilizando arquitetura em camadas e integração com banco de dados.

---

## 🚀 Tecnologias

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- SpringDoc OpenAPI (Swagger)

---

## 📚 Funcionalidades

### 🔹 Gerenciamento de Usuários
- Criação de usuários
- Listagem de usuários
- Busca de usuário por ID
- Atualização de dados
- Remoção de usuários

---

## 🔗 Endpoints da API

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| POST | /users | Criar um novo usuário |
| GET | /users | Listar todos os usuários |
| GET | /users/{id} | Buscar usuário por ID |
| PUT | /users/{id} | Atualizar usuário |
| DELETE | /users/{id} | Remover usuário |

---

## 📄 Documentação

A API conta com documentação interativa gerada automaticamente via **Swagger/OpenAPI**.

Com o projeto rodando localmente, acesse:
```
http://localhost:8080/swagger-ui.html
```

Na página é possível visualizar todos os endpoints, os campos esperados em cada requisição e testar as chamadas diretamente pelo navegador.

---

## 📥 Exemplo de Requisição

### Criar usuário
POST /users
```json
{
  "nomeCompleto": "João Silva",
  "email": "joao@email.com",
  "senha": "senha1234"
}
```

---

## ▶️ Como rodar o projeto

### 🐳 Com Docker
```bash
docker pull pauloviola/user-management-api
```

🔗 [Ver imagem no Docker Hub](https://hub.docker.com/repository/docker/pauloviola/user-management-api/)

### 🔹 Sem Docker

Pré-requisitos: Java 17+, Maven e MySQL configurados localmente.
```bash
git clone https://github.com/pauloviola16/user-management-api.git
cd user-management-api
./mvnw spring-boot:run
```

A aplicação estará disponível em: `http://localhost:8080`

---

## 📂 Estrutura do Projeto
```
src/main/java/com/paulo/usermanagementapi
├── controller
├── service
├── repository
├── entity
├── dto
├── exception
└── config
```

A aplicação segue uma **arquitetura em camadas**, separando responsabilidades entre API, regras de negócio e acesso a dados.

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com o objetivo de praticar:

- Construção de **APIs REST com Spring Boot**
- Organização de projetos backend em **arquitetura em camadas**
- Integração com banco de dados usando **JPA e Hibernate**
- Implementação de **CRUD completo**
- Documentação de APIs com **Swagger/OpenAPI**

---

## 👨‍💻 Autor

**Paulo Viola** - [GitHub](https://github.com/pauloviola16)

