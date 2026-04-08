# User Management API 👤
![Status](https://img.shields.io/badge/Status-Completo-brightgreen)
![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-Framework-brightgreen)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data-JPA-blue)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![Docker](https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=white)
![Swagger](https://img.shields.io/badge/Swagger-UI-85EA2D?logo=swagger&logoColor=black)

API REST desenvolvida com **Java e Spring Boot** para gerenciamento de usuários.  
Este projeto foi criado com o objetivo de praticar a construção de **APIs backend organizadas**, utilizando arquitetura em camadas e integração com banco de dados e testes unitários.

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
- JUnit 5
- Mockito

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

src/test/java/com/paulo/usermanagementapi
└── service
    └── UserServiceTest

```
A aplicação segue uma **arquitetura em camadas**, separando responsabilidades entre API, regras de negócio e acesso a dados.

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

## 🧪 Testes

O projeto conta com testes unitários da camada de Service, cobrindo os principais fluxos da `UserService`.

### 🔧 Ferramentas utilizadas

- **JUnit 5** — estrutura de testes  
- **Mockito** — mock do repositório para isolar a camada de serviço  

### 📌 Cenários cobertos

| Método        | Cenário                                      |
|--------------|----------------------------------------------|
| `createUser` | Criação bem-sucedida de usuário              |
| `getAllUsers`| Retorno da lista de usuários                 |
| `getUserById`| Busca por ID existente                       |
| `getUserById`| Exceção ao buscar ID inexistente             |
| `updateUser` | Atualização bem-sucedida de dados            |
| `deleteUser` | Remoção de usuário existente                 |

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
  "senha": "MinhaSenha123@"
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

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com o objetivo de praticar:

- Construção de **APIs REST com Spring Boot**
- Organização de projetos backend em **arquitetura em camadas**
- Integração com banco de dados usando **JPA e Hibernate**
- Implementação de **CRUD completo**
- Documentação de APIs com **Swagger/OpenAPI**
- Testes unitários com JUnit 5 e Mockito

---

## 👨‍💻 Autor

**Paulo Viola** - [GitHub](https://github.com/pauloviola16)

