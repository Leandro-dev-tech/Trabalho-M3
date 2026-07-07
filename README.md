# Padrão de Projeto Decorator em Java

## Objetivo

O usuário digita uma mensagem e seu nome. A mensagem original é criada pela classe `MensagemSimples`, e depois recebe uma assinatura usando a classe `AssinaturaDecorator`.

## Estrutura do Projeto

```text
src/
├── AssinaturaDecorator.java
├── Main.java
├── Mensagem.java
└── MensagemSimples.java
```

## Requisitos

- Java JDK 8 ou superior

## Como Rodar

Abra o terminal na pasta principal do projeto.

Compile os arquivos:

```bash
javac src/*.java
```

Execute o programa:

```bash
java -cp src Main
```