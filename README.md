# 🍃 Meu Projeto de Estudos: API REST com Java Spring

![Java](https://img.shields.io/badge/Java-17-blue?logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-green?logo=spring&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-4.0-red?logo=apachemaven&logoColor=white)

> Uma API REST desenvolvida para estudo, explorando boas práticas, arquitetura limpa e recursos do Spring Boot.

---

## 🛠 Tecnologias Utilizadas

- **Linguagem:** Java 17
- **Framework:** Spring Boot
- **Build:** Maven
- **Banco de Dados:** H2

---

## 🚀 Funcionalidades

- 🔹 CRUD completo de `User`
- 🔹 Endpoints RESTful seguindo boas práticas de design
- 🔹 Estrutura organizada em camadas (Controller, Service, Model)

---

## 📚 Estrutura do Projeto

```text
src/
├─ main/
│  ├─ java/com/marcossial/SpringAPI/
│  │  ├─ api/
│  │  │  ├─ controller/   # Camada de controle (endpoints)
│  │  │  └─ model/        # Entidades e DTOs
│  │  ├─ service/         # Regras de negócio
│  └─ resources/
│     └─ application.properties  # Configurações da aplicação
└─ test/  # Testes unitários e de integração
```

## 📝 Próximos passos

- Documentar os endpoints utilizando Swagger
- Utilizar um banco de dados persistente
- Tratamento de exceções
- Adicionar JWT para autenticação
- separar entidades expostas na API por DTOs (Data Transfer Objects)
- Frontend
