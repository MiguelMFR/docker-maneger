# Docker Manager

Docker Manager é uma API desenvolvida em Java com Spring Boot para facilitar o gerenciamento de containers e imagens Docker. Com ela, é possível listar, filtrar, criar, iniciar, parar e deletar containers via endpoints HTTP. A API oferece uma interface simples para interagir com o Docker sem precisar acessar o CLI diretamente.

## Funcionalidades

- Listar todos os containers.
- Listar todas as imagens.
- Filtrar imagens pelo nome.
- Criar, iniciar, parar e deletar containers.

## Endpoints

### Listar todos os containers
`GET /api/containers`

Retorna uma lista de todos os containers Docker.

**Exemplo:**
GET http://localhost:8080/api/containers

---

### Listar todas as imagens
`GET /api/images`

Retorna uma lista de todas as imagens Docker.

**Exemplo:**
GET http://localhost:8080/api/images

---

### Filtrar uma imagem pelo nome
`GET /api/images/filter`

Retorna informações de uma imagem específica filtrada pelo nome.

**Exemplo:**
GET http://localhost:8080/api/images/filter?filterName=<image_name>

---

### Criar um container
`POST /api/containers`

Cria um novo container a partir de uma imagem. O nome da imagem deve ser passado como um Query Parameter.

**Exemplo:**
POST http://localhost:8080/api/containers?imageName=<image_name>

---

### Iniciar um container
`POST /api/containers/{id}/start`

Inicia um container que já foi criado.

**Exemplo:**
POST http://localhost:8080/api/containers/{id}/start

*Substitua `{id}` pelo ID do container.*

---

### Parar um container
`POST /api/containers/{id}/stop`

Para um container em execução.

**Exemplo:**
POST http://localhost:8080/api/containers/{id}/stop

*Substitua `{id}` pelo ID do container.*

---

### Deletar um container
`DELETE /api/containers/{id}/delete`

Deleta um container existente.

**Exemplo:**
DELETE http://localhost:8080/api/containers/{id}/delete

markdown
Copiar código
*Substitua `{id}` pelo ID do container.*

---

## Pré-requisitos

- Docker instalado e em execução.
- Java JDK 17+.
- Maven para gerenciar dependências e o ciclo de vida do projeto.
- Spring Boot como framework web.

## Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/docker-manager.git

2. Entre no diretório do projeto:
   ```bash
   cd docker-manager

3. Compile o projeto usando o Maven:
   ```bash
   mvn clean install

4. Inicie o servidor Spring Boot:
   ```bash
   mvn spring-boot:run

## Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **Spring Boot**: Framework para construção da API.
- **Docker API**: Integração com Docker para gerenciamento de containers e imagens.
- **Maven**: Gerenciamento de dependências e build do projeto.



































