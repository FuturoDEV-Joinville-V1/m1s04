package br.senai.lab365.futurodev.caixaeletronico.models;

public class Cliente {
  private int id;
  private String nome;
  private String sobrenome;
  private String cpf;

  public Cliente(String nome, String sobrenome, String cpf) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.cpf = cpf;
  }

  public Cliente() {}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
