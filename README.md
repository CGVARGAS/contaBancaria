# Conta Bancária

Este programa em Java implementa a classe `ContaBancaria`, que permite gerenciar informações de contas bancárias, incluindo número da conta, nome do cliente e saldo.

## Estrutura do Programa

### Classe `ContaBancaria`

A classe `ContaBancaria` possui os seguintes atributos:

- **numeroConta:** Número identificador da conta.
- **nome:** Nome do titular da conta.
- **saldo:** Saldo disponível na conta.
- **tarifa:** Valor da tarifa para operações.

### Métodos Principais

- **Construtores:** Permite criar uma conta com ou sem saldo e tarifa definidos.
- **getNumeroConta():** Retorna o número da conta.
- **getNome():** Retorna o nome do cliente.
- **setNome(String nome):** Define o nome do cliente.
- **getSaldo():** Retorna o saldo atual da conta.
- **deposito(double valor):** Realiza um depósito na conta.
- **saque(double valor):** Realiza um saque na conta, descontando a tarifa.

### Como Utilizar

Para utilizar a classe `ContaBancaria`, basta instanciá-la e realizar operações como depósito e saque.

---

**Diagrama de Classe**

![diagrama_ContaBancaria](https://github.com/CGVARGAS/contaBancaria/assets/86916502/df55028a-b972-424e-b9aa-05b89c2c346f)

---

Para incluir o diagrama de classe, substitua "link-para-o-seu-diagrama-de-classe.png" pelo caminho ou URL onde a imagem do diagrama de classe está localizada.

Este README fornece uma visão geral do programa e da classe `ContaBancaria`. Certifique-se de adicionar mais informações, como requisitos, instruções de compilação ou execução, se necessário.

Caso tenha mais detalhes ou informações específicas para adicionar ao README, sinta-se à vontade para expandi-lo de acordo com as necessidades do seu projeto.
