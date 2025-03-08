package br.senai.lab365.futurodev.carros.models;

public class Carro {
  private String modelo;
  private String cor;
  private boolean ligado;
  private int velocidadeAtual;
  private int velocidadeMaxima;
  private String somBuzina;

  public Carro(String modelo, String cor) {
    this.modelo = modelo;
    this.cor = cor;
  }

  public Carro() {}

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getVelocidadeMaxima() {
    return velocidadeMaxima;
  }

  public void setVelocidadeMaxima(int velocidadeMaxima) {
    this.velocidadeMaxima = velocidadeMaxima;
  }

  public boolean isLigado() {
    return ligado;
  }

  public int getVelocidadeAtual() {
    return velocidadeAtual;
  }

  public String getSomBuzina() {
    return somBuzina;
  }

  public void setSomBuzina(String somBuzina) {
    this.somBuzina = somBuzina;
  }

  public void ligar() {
    if (!this.ligado) {
      this.ligado = true;
      System.out.println("O carro foi ligado.");
    }
  }

  public void desligar() {
    if (this.ligado) {
      this.ligado = false;
      System.out.println("O carro foi desligado.");
      this.frear(this.velocidadeAtual);
    }
  }

  public int acelerar(int quantidade) {

    if (!this.ligado) {
      System.out.println("Carro desligado.");
      return 0;
    }

    // aceleração incremental
    for (int i = 0; i < quantidade; i++) {
      if (this.velocidadeAtual == this.velocidadeMaxima) {
        System.out.println("Velocidade máxima atingida. Velocidade atual: " + this.velocidadeAtual);
        break;
      }
      this.velocidadeAtual++;
      System.out.println("Carro acelerando. Velocidade atual: " + this.velocidadeAtual);
    }

    /* outra opção de aceleração incremental:
    int velocidadeFinal = this.velocidadeAtual + quantidade;
    while (this.velocidadeAtual < velocidadeFinal) {
      this.velocidadeAtual++;
      System.out.println("Carro acelerando. Velocidade atual: " + this.velocidadeAtual);
    }*/

    // solução de aceleração instantânea:
    // this.velocidadeAtual += quantidade;

    return this.velocidadeAtual;
  }

  public int frear(int quantidade) {
    // desaceleração incremental
    for (int i = 0; i < quantidade; i++) {
      if (this.velocidadeAtual == 0) {
        System.out.println(
            "Velocidade mínima atingida. Carro parado. Velocidade: " + this.velocidadeAtual);
        break;
      }
      this.velocidadeAtual--;
      System.out.println("Carro freando. Velocidade atual: " + this.velocidadeAtual);
    }

    return this.velocidadeAtual;
  }

  public void buzinar() {
    System.out.println(this.somBuzina);
  }
}
