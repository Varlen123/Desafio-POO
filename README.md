

## 📌 Visão Geral

Este projeto é um desafio prático de POO, focado na criação de um sistema bancário que simula operações básicas como saque e depósito. O objetivo é aplicar os pilares da POO: **abstração**, **encapsulamento**, **herança** e **polimorfismo**.

---

## 🧱 Descrição das Classes

### 1. `Pessoa` (Classe Base)

* **Atributos**: `nome`, `idade`
* **Métodos**: Getters para os atributos
* **Descrição**: Representa uma pessoa genérica. Serve como classe base para outras classes que compartilham esses atributos.

### 2. `Cliente` (Herda de `Pessoa`)

* **Atributos**: `conta` (do tipo `Conta`)
* **Descrição**: Representa um cliente do banco. Cada cliente possui uma conta associada.

### 3. `Conta` (Classe Abstrata)

* **Atributos**: `agencia`, `numero`, `saldo`
* **Métodos**:

  * `depositar(double valor)`: Adiciona valor ao saldo.
  * `sacar(double valor)`: Método abstrato a ser implementado pelas subclasses.
* **Descrição**: Define a estrutura comum para diferentes tipos de contas bancárias.

### 4. `ContaCorrente` (Herda de `Conta`)

* **Atributos**: `limite`
* **Métodos**:

  * Implementa `sacar(double valor)`: Permite saque até o valor do saldo mais o limite.
* **Descrição**: Representa uma conta corrente com limite adicional para saques.

### 5. `ContaPoupanca` (Herda de `Conta`)

* **Métodos**:

  * Implementa `sacar(double valor)`: Permite saque apenas até o valor do saldo.
* **Descrição**: Representa uma conta poupança sem limite adicional.

### 6. `Banco`

* **Atributos**: `clientes` (lista de `Cliente`), `contas` (lista de `Conta`)
* **Métodos**:

  * `adicionarCliente(Cliente cliente)`: Adiciona um cliente ao banco.
  * `adicionarConta(Conta conta)`: Adiciona uma conta ao banco.
  * `autenticar(Cliente cliente, Conta conta)`: Verifica se o cliente e a conta pertencem ao banco.
* **Descrição**: Gerencia os clientes e contas do banco, além de autenticar operações.

### 7. `Main`

* **Função**: Contém o método `main` para execução do programa.
* **Descrição**: Ponto de entrada do aplicativo. Aqui são criados objetos e realizadas operações para demonstrar o funcionamento do sistema.

---

## 🧪 Funcionalidades Implementadas

* Criação de clientes e contas (corrente e poupança).
* Depósitos e saques com validações específicas para cada tipo de conta.
* Autenticação de clientes e contas antes de permitir operações.
* Demonstração do uso de herança, encapsulamento, abstração e polimorfismo.

---

## 🚀 Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/Varlen123/Desafio-POO.git
   ```
2. Navegue até o diretório do projeto:

   ```bash
   cd Desafio-POO/Desafio
   ```
3. Compile os arquivos Java:

   ```bash
   javac *.java
   ```
4. Execute o programa:

   ```bash
   java Main
   ```

---

## 📚 Conceitos de POO Aplicados

* **Abstração**: A classe `Conta` define um modelo genérico para contas bancárias.
* **Encapsulamento**: Atributos privados com acesso controlado por métodos públicos.
* **Herança**: `ContaCorrente` e `ContaPoupanca` herdam de `Conta`; `Cliente` herda de `Pessoa`.
* **Polimorfismo**: Métodos `sacar` são implementados de forma diferente em `ContaCorrente` e `ContaPoupanca`.

