# ShortMyUrl

![Java](https://img.shields.io/badge/Java-17-%23ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.0%2B-%236DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-%2347A248?style=for-the-badge&logo=mongodb&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.9%2B-%23C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
[![Docker](https://img.shields.io/badge/Docker-Container-%230db7ed?style=for-the-badge&logo=docker&logoColor=white)](https://www.docker.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-%23333?style=for-the-badge&logo=license&logoColor=white)](LICENSE)
![Build](https://img.shields.io/badge/Build-Passing-%2300C853?style=for-the-badge&logo=githubactions&logoColor=white)


**ShortMyUrl** é uma aplicação web desenvolvida em JAVA para encurtamento de URLs, com backend em Spring e persistência de dados no MongoDB. Ideal para criar e redirecionar links curtos de forma rápida e eficiente.

Esse projeto também tem em .NET-CORE 8

[![Acesse: ShortMyUrl-DOTNET](https://img.shields.io/badge/Repo-ShortMyUrl--DOTNET-%237025F7?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Felipe-Amorim-Dev/ShortMyUrl-DOTNET)

## 🚀 Tecnologias

- JAVA 17 (Spring-Boot)
- Maven
- MongoDB
- Docker & Docker Compose
- Swagger (para testes e documentação da API)

## 📁 Arquitetura do Projeto

<p>O projeto segue uma arquitetura modular baseada em camadas, com princípios de Domain-Driven Design (DDD) e separação de responsabilidades, facilitando manutenção, testes e escalabilidade.

**ShortMyUrl.Application.Controllers**
Camada de apresentação Web API. Responsável por receber requisições HTTP, validar entradas e retornar respostas apropriadas. Utiliza Swagger para documentação automática da API.

**ShortMyUrl.Domain**
Contém a lógica de negócio (serviços de domínio e regras de validação). É independente de tecnologias externas, promovendo baixo acoplamento.

**ShortMyUrl.Infrastructure**
Camada de persistência de dados. Responsável por interagir com o MongoDB, utilizando repositórios genéricos e entidades persistentes.
</p>

<img src="IMG/Arquitetura do Projeto.png" width="100%" align="center">

## 🛠️ Como rodar o projeto

### ✅ Pré-requisitos

- [Java JDK 17+](https://adoptium.net/temurin/releases/) – necessário para compilar e executar o projeto
- [Maven 3.9+](https://maven.apache.org/download.cgi) – gerenciamento de dependências e build
- [Docker](https://www.docker.com/) – para containerizar a aplicação
- [MongoDB Compass](https://www.mongodb.com/products/compass) *(opcional)* – para visualizar os dados salvos no MongoDB

### MongoDB Container (independente)

Primeiro crie a rede interna do docker
```bash
docker network create nome-da-sua-network
```
Depois crie o container para o mongoDb

```bash
docker run -d --name mongodb-container -p 27017:27017 --network nome-da-sua-network mongo
```

### Rodando a API

Abra um terminal onde o arquivo **docker-compose.yml** está e rode o comando abaixo:

```bash
docker compose up --build
```

Acesse em: [http://localhost:8081/swagger](http://localhost:8081/swagger)

<hr>

### Caso seu projeto não consiga se conectar ao container do MongoDB, troque a ConectString de mongodb://seu-endereço-de-ip:27017

<hr>

## 🔧 Configurações

```yaml
# docker-compose.yml (exemplo)
services:
  shortmyurl-api:
    ...
    environment:
      - MongoDbSettings__ConnectionString=mongodb://mongodb-container:27017
    networks:
      - shortmyurl-network

networks:
  shortmyurl-network:
    name: shortmyurl-network
```

## 📁 Estrutura

- `ShortMyUrl.API` — Camada de apresentação (Controllers e configurações).
- `ShortMyUrl.Domain` — Regras de negócio.
- `ShortMyUrl.Data` — Repositórios e acesso ao MongoDB.

## 📜 Licença

Este projeto está licenciado sob a licença MIT.


