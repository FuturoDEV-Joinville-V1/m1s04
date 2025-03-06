package main;

import automoveis.Carro;

public class Main {
    public static void main(String[] args) {
        Carro kwid = new Carro();
        kwid.anoFabricacao = 2024;
        kwid.cor = "prata";
        kwid.anoModelo = 2024;
        kwid.modelo = "Kwid";
        kwid.fabricante = "Renault";
        kwid.qtdPortas = 4;

        Carro unoDeFirma = new Carro();
        unoDeFirma.qtdPortas = 2;
        unoDeFirma.cor = "branco";
        unoDeFirma.fabricante = "Fiat";
        unoDeFirma.modelo = "Uno";
        unoDeFirma.anoFabricacao = 2007;
        unoDeFirma.anoModelo = 2008;
        unoDeFirma.possuiEscada = true;

        System.out.printf("Fabricante do carro: %s, modelo: %s, ano de fabricação: %d.%n",
                kwid.fabricante, kwid.modelo, kwid.anoFabricacao);

        System.out.printf("Outro carro. Fabricante: %s, modelo: %s, ano: %d, possui escada? %b.%n",
                unoDeFirma.fabricante, unoDeFirma.modelo, unoDeFirma.anoModelo, unoDeFirma.possuiEscada);

        System.out.println("Kwid possui escada? " + kwid.possuiEscada);

        Carro fusca = new Carro();
        fusca.fabricante = "Volkswagen";
        fusca.modelo = "Fusca";

        System.out.printf("Fusca -> fabricante: %s, modelo: %s, cor: %s.%n",
                fusca.fabricante, fusca.modelo, fusca.cor);

        kwid.buzinar();

        unoDeFirma.buzinar();

        fusca.buzinar();
  }
}
