# Sistema de Conta Bancária (Encapsulamento POO)

Este é um projeto simples em Java desenvolvido para praticar conceitos fundamentais de Programação Orientada a Objetos, com foco em encapsulamento, construtores e manipulação de atributos privados.

## 🚀 Funcionalidades

* **Abertura de Conta**: Permite criar uma conta com ou sem depósito inicial.
* **Depósito**: Realiza depósitos verificando se o valor é positivo.
* **Saque**: Realiza saques com aplicação de uma taxa fixa de $ 5.00, verificando se há saldo suficiente.
* **Proteção de Dados**: O número da conta e o saldo possuem acesso restrito (encapsulamento), permitindo apenas alterações seguras via métodos.

## 🛠️ Tecnologias

* **Linguagem**: Java
* **JDK**: 17
* **IDE**: IntelliJ IDEA (configurações incluídas)

## 📂 Estrutura do Projeto

* `src/Main.java`: Ponto de entrada que gerencia a interação com o usuário via console.
* `src/entities/BankAccount.java`: Classe que contém a lógica de negócio, atributos e métodos da conta.

## 💻 Como Executar

1. Certifique-se de ter o JDK 17 instalado.
2. Compile os arquivos `.java` na pasta `src`.
3. Execute a classe `Main`.
4. Siga as instruções no terminal para criar sua conta, depositar e sacar valores.

---
*Desenvolvido para fins de estudo de POO.*
