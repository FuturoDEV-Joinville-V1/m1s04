package br.com.futurodev.banco.main;

import br.com.futurodev.banco.models.Cliente;
import br.com.futurodev.banco.models.Conta;

public class TestaConstrutores {
    public static void main(String[] args){
        System.out.println("Quantas contas existem? " + Conta.getTotalContasCriadas());

        Conta c1 = new Conta(10);
        System.out.println("Quantas contas existem? " + Conta.getTotalContasCriadas());

        Conta c2 = new Conta();
        System.out.println("Quantas contas existem? " + Conta.getTotalContasCriadas());

        Conta c3 = new Conta("", "", "", 50);

        System.out.println("Quantas contas existem? " + Conta.getTotalContasCriadas());
        
    }
}
