package br.senai.lab365.futurodev.caixaeletronico.models;

public class Conta {
  private Cliente titular;
  private double saldo;
  private int numeroConta;

  public Cliente getTitular() {
    return titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void depositar(double valor) {
    if (valor <= 0) {
      System.out.println("Insira um valor positivo.");
    } else {
      this.saldo += valor;
      System.out.printf("Depósito de R$%.2f realizado com sucesso.", valor);
    }
  }

  public boolean sacar(double valor) {
    if (valor <= this.saldo) {
      this.saldo -= valor;
      System.out.printf("Saque de R$%.2f realizado com sucesso.", valor);
      return true;
    } else {
      System.out.println("Saldo insuficiente.");
      return false;
    }
  }

  public void transferir(Conta destino, double valor) {
    if (this.sacar(valor)) {
      destino.depositar(valor);
    }
  }
}
