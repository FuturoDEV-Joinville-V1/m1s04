package automoveis;

public class Carro {
    public int qtdPortas;
    public String cor;
    public String fabricante;
    public String modelo;
    public int anoFabricacao;
    public int anoModelo;
    public boolean possuiEscada;

    public void acelerar() {
        System.out.println("Acelerando");
    }

    public void frear() {
        System.out.println("Freando");
    }

    public void buzinar() {
        System.out.println("Bi biiii");
    }

}
