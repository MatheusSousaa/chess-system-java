# ♟️ Chess System (Sistema de Xadrez em Java)

> Projeto desenvolvido em Java com foco na aplicação de princípios de **Orientação a Objetos (POO)**, lógica de programação e tratamento de exceções para simular uma partida completa de xadrez diretamente pelo console/terminal.

---

## 🚀 Sobre o Projeto

O sistema implementa as regras fundamentais do xadrez tradicional, permitindo que dois jogadores disputem uma partida utilizando coordenadas no terminal. O código foi estruturado de forma a separar responsabilidades em camadas (como tabuleiro, peças, partidas e exceções), aplicando conceitos avançados de POO como encapsulamento, herança, polimorfismo e classes abstratas.

---

## ✨ Funcionalidades

* **Tabuleiro 8x8** com renderização dinâmica no console.
* **Movimentação completa** de todas as peças tradicionais:
  * ♜ Torre
  * ♞ Cavalo
  * ♝ Bispo
  * ♛ Dama (Rainha)
  * ♚ Rei
  * ♟ Peão
* **Validação de movimentos** (impedindo jogadas irregulares ou que deixem o Rei em risco).
* **Turnos alternados** entre os jogadores (Brancas vs. Pretas).
* **Detecção de Xeque e Xeque-Mate**.
* **Histórico de peças capturadas**.
* **Tratamento de exceções personalizadas** para entradas inválidas ou movimentos ilegais.

---

## 🛠️ Tecnologias Utilizadas

* **Java** (JDK 17 ou superior recomendado)
* **IDE:** IntelliJ IDEA / Eclipse / VS Code
* **Conceitos Aplicados:** Programação Orientada a Objetos (POO), Camadas, Exceções Personalizadas.

---

## 📂 Estrutura do Projeto

O código-fonte principal está organizado nos seguintes pacotes:
* `boardgame`: Lógica genérica do tabuleiro e peças.
* `chess`: Regras específicas do xadrez (partida, peças e movimentos).
* `application`: Classe principal (`Program.java`) responsável pela interação com o usuário via console.

---

## 📥 Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/seu-usuario/seu-repositorio-xadrez.git](https://github.com/seu-usuario/seu-repositorio-xadrez.git)

2.   Abra o projeto na sua IDE de preferência (IntelliJ IDEA, Eclipse, etc.).

3.    Localize a classe principal de execução (geralmente Program.java dentro do pacote application).

4.    Execute o projeto como uma aplicação Java padrão (Run).

5.    Como jogar:

        O jogo solicitará a origem e o destino da peça utilizando coordenadas de xadrez (Ex: origem c2 e destino c4).

        O terminal atualizará o tabuleiro a cada turno bem-sucedido.

👨‍💻 Autor

Feito por Matheus Sousa. Sinta-se à vontade para entrar em contato ou contribuir com melhorias!
