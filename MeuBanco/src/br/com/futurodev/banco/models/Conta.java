package br.com.futurodev.banco.models;

public class Conta {
  private static int totalContasCriadas = 0;

  private Cliente titular = new Cliente();
  private double saldo;
  protected double limite;

  public Conta(double saldo) {
    this.saldo = saldo;
    totalContasCriadas++;
  }

  public Conta() {
    totalContasCriadas++;
  }

  public Conta(String nomeTitular, String sobrenomeTitular, String cpfTitular) {
    this.titular.nome = nomeTitular;
    this.titular.sobrenome = sobrenomeTitular;
    this.titular.cpf = cpfTitular;
    totalContasCriadas++;
  }

  public Conta(String nomeTitular, String sobrenomeTitular, String cpfTitular, double saldo) {
    this(nomeTitular, sobrenomeTitular, cpfTitular);
    this.saldo = saldo;
  }

  public void sacar(double valorSaque) {
    if (valorSaque <= this.saldo + this.limite) {
      // saldo = saldo - valorSaque;
      this.saldo -= valorSaque;
      System.out.println("Saque realizado com sucesso!");
    } else {
      System.out.println("Saldo insuficiente.");
    }
  }

  public void depositar(double valorDeposito) {
    this.saldo += valorDeposito;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void transferePara(Conta destino, double valor) {
    this.sacar(valor);
    destino.depositar(valor);
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public Cliente getTitular() {
    return this.titular;
  }

  public double getLimite() {
    return limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  public static int getTotalContasCriadas() {
    return totalContasCriadas;
  }
}
