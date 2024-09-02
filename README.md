# Sistema de Gerenciamento de Livros

## Descrição

Este projeto é um programa em Java que simula um sistema de gerenciamento de livros em uma livraria. Ele permite o cadastro e a venda de livros físicos e ebooks, aplicando conceitos de orientação a objetos como herança, interfaces, polimorfismo e tratamento de exceções.

## Funcionalidades

1. **Gerenciamento de Livros**:
   - O sistema permite cadastrar novos livros, sejam eles físicos ou ebooks.
   - Exibe todos os livros cadastrados.
   
2. **Vendas**:
   - Realiza a venda de livros físicos, diminuindo o estoque disponível.
   - Registra a venda de ebooks.

3. **Classes e Herança**:
   - **Livro (Classe Abstrata)**: Base para todos os tipos de livros com atributos como título, autor e preço.
   - **LivroFisico**: Subclasse de `Livro` com atributos adicionais como peso e estoque. Inclui métodos para calcular desconto com base no peso.
   - **Ebook**: Subclasse de `Livro` com atributos adicionais como tamanho de arquivo e formato.

4. **Interfaces e Polimorfismo**:
   - **Vendavel**: Interface que define o método `vender()` para registrar vendas e manipular estoque.
   - Ambas as subclasses (`LivroFisico` e `Ebook`) implementam a interface `Vendavel`.

5. **Tratamento de Exceções**:
   - **PrecoInvalidoException**: Exceção personalizada para tratar preços negativos ao definir o preço de um livro.

6. **Interatividade**:
   - Menu interativo para cadastro de livros, realização de vendas e exibição de livros cadastrados.

## Estrutura do Projeto

- **Livro**: Classe abstrata contendo atributos comuns e métodos básicos.
- **LivroFisico**: Subclasse de `Livro`, implementa a interface `Vendavel` e métodos específicos para livros físicos.
- **Ebook**: Subclasse de `Livro`, implementa a interface `Vendavel` e métodos específicos para ebooks.
- **Vendavel**: Interface que define o contrato para a venda de livros.
- **PrecoInvalidoException**: Classe de exceção personalizada para tratamento de preços inválidos.

## Como Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/sistema-gerenciamento-livros.git
