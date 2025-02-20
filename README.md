# 🚗 api-carros-semi-novos

# Estoque de Carros - API RESTful com Spring Boot

## Este projeto é uma API REST para gerenciar um estoque de carros, utilizando Spring Boot, Banco de Dados H2 e PostgreSQL, Postman para testes, Swagger para documentação e Maven para gerenciamento de dependências.

## 🛠️ Tecnologias Utilizadas

### Java 21

### Spring Boot 3

### Spring Data JPA (para comunicação com o banco de dados)

### Spring Web

### Banco de Dados H2 (para testes) e PostgreSQL

### Swagger (para documentação da API)

### Lombok (para reduzir código boilerplate)

### Maven (para gerenciamento do projeto)

### Postman

### InteliJ

## 📂 Estrutura do Projeto

api-carros-semi-novos/

├── src/main/java/com/spring/carros_semi_novos/

├── CarrosSemiNovosApplication.java      📌  # Classe principal da aplicação

├── model/Carro.java                    📌  # Modelo da entidade Carro

├── repository/CarroRepository.java📌 # Interface do repositório

├── service/CarroService.java       📌# Serviço contendo regras de negócio

├── controller/CarroController.java 📌# Controlador com endpoints REST

├── config/SwaggerConfig.java       📌# Configuração do Swagger

├── src/main/resources/

├── application.properties         📌 # Configuração do banco de dados

├── pom.xml                             📌 # Dependências do projeto

## 🔧 Configuração e Execução

## 1️⃣ Clonar o repositório


git clone https://github.com/seu-usuario/api-carros-semi-novos.git
cd estoque-carros

## 2️⃣ Compilar o projeto

mvn clean install

## 3️⃣ Rodar a aplicação

mvn spring-boot:run

 A API estará disponível em http://localhost:8080

🚗 Carros

![Captura de tela de 2025-02-19 23-00-37](https://github.com/user-attachments/assets/008921ff-a1cc-4590-889f-76c1e43a1c1a)


## 📜 Documentação com Swagger

Após iniciar a aplicação, acesse:

http://localhost:8080/swagger-ui.html

Isso abrirá a interface interativa do Swagger para testar os endpoints da API.

## ⚙️ Configuração do Banco de Dados

Banco H2 (padrão)

http://localhost:8080/h2-console

![Captura de tela de 2025-02-19 21-15-29](https://github.com/user-attachments/assets/4e8ae61f-8cf7-43f0-aaf4-4e59cfad6b7e)



No arquivo application.properties, já está configurado o banco H2

Banco PostgreSQL - Profile : prod (produção)

Para usar PostgreSQL, edite application-prod.properties


## 📌 Licença

Este projeto é de código aberto e pode ser utilizado livremente.
