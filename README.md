# Projeto Shop com Spring Boot

Este é um projeto de demonstração construído com o **Spring Boot** para criar uma aplicação web de uma loja. O projeto utiliza o **Maven** como gerenciador de dependências e é configurado para usar o **Java 17**.

## Tecnologias Utilizadas

- **Spring Boot**: O projeto utiliza a versão **3.0.0** do Spring Boot.
- **Java**: O código-fonte é escrito em Java e é compatível com a versão 17.
- **H2 Database**: Um banco de dados em memória H2 é utilizado para armazenamento em tempo de execução.

## Estrutura do Projeto

O projeto `shop` possui as seguintes dependências:

- `spring-boot-starter-web`: Para criar aplicações web.
- `spring-boot-starter-test`: Dependências para testes de aplicações Spring Boot.
- `spring-boot-starter-data-jpa`: Para utilizar o Spring Data JPA com Hibernate.
- `h2`: Um banco de dados rápido em memória para desenvolvimento e testes.

## Compilando o Projeto

Você pode compilar o projeto utilizando o Maven. Execute o seguinte comando no terminal:

```shell
mvn clean install
```

Isso irá compilar o código-fonte, executar os testes e criar um arquivo JAR executável no diretório `target`.

## Executando a Aplicação

Para executar a aplicação, utilize o seguinte comando:

```shell
java -jar target/shop-0.0.1-SNAPSHOT.jar
```

Alternativamente, se você tiver o Docker instalado, pode criar uma imagem Docker da sua aplicação executando:

```shell
mvn spring-boot:build-image
```

E então execute a imagem com:

```shell
docker run --rm -p 8080:8080 shop:0.0.1-SNAPSHOT
```

<img width="726" alt="Screen Shot 2024-02-21 at 15 12 06" src="https://github.com/marcelinx/shop-process-spring/assets/81206036/158bed0b-6fc7-46a8-a232-ef72bc0e81d3">
