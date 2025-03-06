package main;

import banco.Conta;

public class TestaIgualdadeObjetos {
  public static void main(String[] args) {
    int a = 10;
    int b = a;
    b = 20;

    System.out.println("Valor de a: " + a);
    System.out.println("Valor de b: " + b);

    Conta c1 = new Conta();
    c1.titular.nome = "JV";
    c1.saldo = 50;

    Conta c2;
    c2 = c1;

    c2.saldo = 10;

    System.out.println("Saldo de c1: " + c1.saldo);
    System.out.println("Saldo de c2: " + c2.saldo);

    Conta c3 = new Conta();
    Conta c4 = new Conta();

    c3.titular.nome = "Israel";
    c3.saldo = 50;

    c4.titular.nome = "Israel";
    c4.saldo = 50;

    System.out.printf("Conta do cliente %s possui saldo R$%.2f.%n", c3.titular.nome, c3.getSaldo());
    System.out.printf("Conta do cliente %s possui saldo R$%.2f.%n", c4.titular.nome, c4.getSaldo());

    boolean igualdade1 = c1 == c2;
    System.out.println("c1 == c2? " + igualdade1);
    System.out.println(c1);
    System.out.println(c2);

    boolean igualdade2 = c3 == c4;
    System.out.println("c3 == c4? " + igualdade2);
    System.out.println(c3);
    System.out.println(c4);
  }
}
