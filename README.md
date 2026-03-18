# User Management API 👤

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-Framework-brightgreen)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data-JPA-blue)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![Maven](https://img.shields.io/badge/Maven-Build-red)

API REST desenvolvida com **Java e Spring Boot** para gerenciamento de usuários.  
Este projeto foi criado com o objetivo de praticar a construção de **APIs backend organizadas**, utilizando arquitetura em camadas e integração com banco de dados.

---

# 🚀 Tecnologias

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven

---

# 📚 Funcionalidades

### 🔹 Gerenciamento de Usuários

- Criação de usuários
- Listagem de usuários
- Busca de usuário por ID
- Atualização de dados
- Remoção de usuários

---

# 🔗 Endpoints da API

| Método | Endpoint | Descrição |
|------|------|------|
| POST | /users | Criar um novo usuário |
| GET | /users | Listar todos os usuários |
| GET | /users/{id} | Buscar usuário por ID |
| PUT | /users/{id} | Atualizar usuário |
| DELETE | /users/{id} | Remover usuário |

---

# 📥 Exemplo de Requisição

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

# 📂 Estrutura do Projeto

```
src/main/java/com/paulo/usermanagementapi

controller
service
repository
entity
dto
exception
```

A aplicação segue uma **arquitetura em camadas**, separando responsabilidades entre API, regras de negócio e acesso a dados.

---

# 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com o objetivo de praticar:

- Construção de **APIs REST com Spring Boot**
- Organização de projetos backend em **arquitetura em camadas**
- Integração com banco de dados usando **JPA e Hibernate**
- Implementação de **CRUD completo**

---


