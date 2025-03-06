package banco;

public class Conta {
  public Cliente titular = new Cliente();
  public double saldo = 5;

  public void sacar(double valorSaque) {
    if (valorSaque <= this.saldo) {
      // saldo = saldo - valorSaque;
      this.saldo -= valorSaque;
      System.out.println("Saque realizado com sucesso!");
    } else {
      System.out.println("Saldo insuficiente.");
    }
  }

  public void depositar(double valorDeposito) {
    this.saldo += valorDeposito;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void transferePara(Conta destino, double valor) {
    this.sacar(valor);
    destino.depositar(valor);
  }
}
