package main;

import banco.Conta;

public class TestaTransferencia {
  public static void main(String[] args) {
    Conta c1 = new Conta();
    Conta c2 = new Conta();

    c1.depositar(100);

    System.out.println("Saldo da c1: " + c1.getSaldo());
    System.out.println("Saldo da c2: " + c2.getSaldo());

    c1.transferePara(c2, 10);

    System.out.println("Saldo da c1: " + c1.getSaldo());
    System.out.println("Saldo da c2: " + c2.getSaldo());
  }
}
