package br.senai.lab365.futurodev.caixaeletronico.main;

import br.senai.lab365.futurodev.caixaeletronico.models.Cliente;
import br.senai.lab365.futurodev.caixaeletronico.models.Conta;
import br.senai.lab365.futurodev.caixaeletronico.repositories.ClienteRepository;
import br.senai.lab365.futurodev.caixaeletronico.repositories.ContaRepository;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ContaRepository contaRepository = new ContaRepository();
    ClienteRepository clienteRepository = new ClienteRepository();

    System.out.println("Bem vindo ao caixa eletrônico!");
    Scanner entrada = new Scanner(System.in);

    int operacao;

    do {
      System.out.println("Escolha uma operação:");
      System.out.println("1 - Criar conta");
      System.out.println("2 - Depositar");
      System.out.println("3 - Sacar");
      System.out.println("4 - Transferir");
      System.out.println("5 - Ver saldo");
      System.out.println("0 - Sair");

      operacao = Integer.parseInt(entrada.nextLine());

      switch (operacao) {
        case 1 -> operacaoCadastraConta(entrada, contaRepository, clienteRepository);
        case 2 -> operacaoDeposito(entrada, contaRepository);
        case 3 -> operacaoSaque(entrada, contaRepository);
        case 4 -> operacaoTransferencia(entrada, contaRepository);
        case 5 -> operacaoVerSaldo(entrada, contaRepository);
        case 0 -> System.out.println("Encerrando sessão.");
        default -> System.out.println("Selecione uma opção válida.");
      }
    } while (operacao != 0);
  }

  private static void operacaoVerSaldo(Scanner entrada, ContaRepository contaRepository) {
    System.out.println("Digite o número da conta para consulta:");
    int numeroConta = Integer.parseInt(entrada.nextLine());
    Conta conta = contaRepository.buscar(numeroConta);
    if (conta != null) {
      System.out.printf(
          "Saldo disponível na conta %d: R$%.2f.%n", conta.getNumeroConta(), conta.getSaldo());
    } else {
      System.out.println("Conta inexistente");
    }
  }

  private static void operacaoTransferencia(Scanner entrada, ContaRepository contaRepository) {
    System.out.println("Digite o número da conta origem:");
    int numeroContaOrigem = Integer.parseInt(entrada.nextLine());
    Conta contaOrigem = contaRepository.buscar(numeroContaOrigem);

    System.out.println("Digite o número da conta destino:");
    int numeroContaDestino = Integer.parseInt(entrada.nextLine());
    Conta contaDestino = contaRepository.buscar(numeroContaDestino);

    System.out.println("Insira um valor para transferir:");
    double valorTransferencia = Double.parseDouble(entrada.nextLine());

    contaOrigem.transferir(contaDestino, valorTransferencia);
  }

  private static void operacaoSaque(Scanner entrada, ContaRepository contaRepository) {
    System.out.println("Digite o número da conta para sacar:");
    int numeroConta = Integer.parseInt(entrada.nextLine());
    Conta contaSaque = contaRepository.buscar(numeroConta);
    System.out.println("Insira um valor para saque:");
    double valorSaque = Double.parseDouble(entrada.nextLine());

    contaSaque.sacar(valorSaque);
  }

  private static void operacaoDeposito(Scanner entrada, ContaRepository contaRepository) {
    System.out.println("Digite o número da conta para depósito:");
    int numeroConta = Integer.parseInt(entrada.nextLine());
    Conta contaDeposito = contaRepository.buscar(numeroConta);
    System.out.println("Insira um valor para depósito:");
    double valorDeposito = Double.parseDouble(entrada.nextLine());

    contaDeposito.depositar(valorDeposito);
  }

  private static void operacaoCadastraConta(
      Scanner entrada, ContaRepository contaRepository, ClienteRepository clienteRepository) {
    Conta novaConta = new Conta();
    System.out.println("Digite um nome:");
    String nome = entrada.nextLine();
    System.out.println("Digite um sobrenome:");
    String sobrenome = entrada.nextLine();
    System.out.println("Digite um CPF:");
    String cpf = entrada.nextLine();

    Cliente novoCliente = new Cliente(nome, sobrenome, cpf);
    clienteRepository.salvar(novoCliente);
    novaConta.setTitular(novoCliente);

    contaRepository.salvar(novaConta);
    System.out.printf("Conta cadastrada. Número da conta: %d.%n", novaConta.getNumeroConta());
  }
}
