package br.senai.lab365.futurodev.caixaeletronico.repositories;

import br.senai.lab365.futurodev.caixaeletronico.models.Conta;
import java.util.ArrayList;
import java.util.List;

public class ContaRepository {
  private static final List<Conta> CONTAS = new ArrayList<>();

  public void salvar(Conta novaConta) {
    novaConta.setNumeroConta(CONTAS.size() + 1);
    CONTAS.add(novaConta);
  }

  public Conta buscar(int numeroConta) {
    for (Conta conta : CONTAS) {
      if (numeroConta == conta.getNumeroConta()) {
        return conta;
      }
    }

    return null;
  }
}
