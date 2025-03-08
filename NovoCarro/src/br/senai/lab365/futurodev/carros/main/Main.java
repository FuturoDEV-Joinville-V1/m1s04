package br.senai.lab365.futurodev.carros.main;

import br.senai.lab365.futurodev.carros.models.Carro;

public class Main {
  public static void main(String[] args) {
    Carro uno = new Carro();

    System.out.println("Carro está ligado? " + uno.isLigado());

    uno.ligar();

    System.out.println("Carro está ligado? " + uno.isLigado());

    uno.desligar();

    System.out.println("Carro está ligado? " + uno.isLigado());

    int velocidadeNova = uno.acelerar(5);

    System.out.println("Nova velocidade do carro: " + velocidadeNova);

    uno.setVelocidadeMaxima(5);
    uno.ligar();

    uno.acelerar(2);

    System.out.println("mais aceleração");

    uno.acelerar(2);

    uno.acelerar(2);

    uno.desligar();

    uno.ligar();
    uno.acelerar(3);
    uno.frear(2);
    uno.frear(2);

    uno.setSomBuzina("BIIII");
    uno.buzinar();
  }
}
