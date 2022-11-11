# Livro de Receitas

Este projeto foi construído de maneira simples para prática de conceitos introdutórios sobre Spring Boot e Spring Web MVC
vistos no livro Spring in Action.

Se trata de um livro de receitas muito básico contendo duas receitas: um Frango Caramelizado e um Bolo de Maracujá.

Deixo claro que as receitas não são de minha autoria, sendo utilizadas somente para praticar os conceitos.

## Conceitos chave praticados

* Auto configuração do Spring Boot
* Criação de Controllers MVC
* Criação de templates com Thymeleaf
* Testes com Spring Web MVC Test

## Como Rodar
#### Testes
```bash
$ ./gradlew test
```
#### Aplicação
```bash
$ ./gradlew bootRun
```
Conforme instruções, a aplicação irá rodar por padrão na porta 8080. Server de Live Reload roda na porta 35729.

#### Packaging

Obs.: Necessário Java 11+

```bash
$ ./gradlew assemble
```

O output é gerado na pasta /build/lib.