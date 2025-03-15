package br.senai.lab365.futurodev.caixaeletronico.repositories;

import br.senai.lab365.futurodev.caixaeletronico.models.Cliente;
import java.util.ArrayList;

public class ClienteRepository {
  private static final ArrayList<Cliente> CLIENTES = new ArrayList<>();

  public Cliente salvar(Cliente novoCliente) {
    novoCliente.setId(CLIENTES.size() + 1);

    CLIENTES.add(novoCliente);

    return novoCliente;
  }

  public Cliente buscar(int id) {
    for (Cliente cliente : CLIENTES) {
      if (id == cliente.getId()) {
        return cliente;
      }
    }
    return null;
  }

  public Cliente buscar(String cpf) {
    for (Cliente cliente : CLIENTES) {
      if (cpf.equalsIgnoreCase(cliente.getCpf())) {
        return cliente;
      }
    }
    return null;
  }
}
