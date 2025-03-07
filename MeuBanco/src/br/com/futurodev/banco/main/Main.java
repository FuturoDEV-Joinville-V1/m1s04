package br.com.futurodev.banco.main;

import br.com.futurodev.banco.models.Cliente;
import br.com.futurodev.banco.models.Conta;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Conta minhaConta = new Conta();
    //    System.out.println(minhaConta);

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite seu nome:");
    String nomeTitular = entrada.nextLine();

    System.out.println("Digite seu sobrenome:");
    String sobrenomeTitular = entrada.nextLine();

    System.out.println("Digite seu cpf:");
    String cpfTitular = entrada.nextLine();

    System.out.println("Digite um saldo inicial:");
    double saldoInicial = Double.parseDouble(entrada.nextLine());

    Cliente titularConta = new Cliente();
    titularConta.nome = nomeTitular;
    titularConta.sobrenome = sobrenomeTitular;
    titularConta.cpf = cpfTitular;

    minhaConta.setTitular(titularConta);
    minhaConta.depositar(saldoInicial);

    System.out.printf(
        "A conta do cliente %s possui saldo de R$%.2f.%n",
        minhaConta.getTitular().nome, minhaConta.getSaldo());

    System.out.println("Digite um valor de saque:");
    double valorSaque = Double.parseDouble(entrada.nextLine());

    minhaConta.sacar(valorSaque);

    System.out.printf(
        "A conta do cliente %s possui saldo de R$%.2f.%n",
        minhaConta.getTitular().nome, minhaConta.getSaldo());
    /*
    minhaConta.depositar(75);

    System.out.printf(
        "A conta do cliente %s possui saldo de R$%.2f.%n",
        minhaConta.nomeTitular, minhaConta.getSaldo());*/

    Conta outraConta;
    outraConta = minhaConta;

    /*System.out.println("Digite outro nome de Titular:");
    outraConta.nomeTitular = entrada.nextLine();*/

    System.out.println("Digite um valor de depósito inicial:");
    double valorDeposito = Double.parseDouble(entrada.nextLine());
    outraConta.depositar(valorDeposito);

    System.out.printf(
        "A conta do cliente %s possui saldo de R$%.2f.%n",
        outraConta.getTitular().nome, outraConta.getSaldo());

    System.out.printf(
        "A conta do cliente %s possui saldo de R$%.2f.%n",
        minhaConta.getTitular().nome, minhaConta.getSaldo());

    System.out.println(minhaConta == outraConta);
    System.out.println(minhaConta);
    System.out.println(outraConta);
  }
}
