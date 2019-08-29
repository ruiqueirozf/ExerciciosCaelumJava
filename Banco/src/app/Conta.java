//Ela deve ter o nome do titular (String),
// o número (int),
// a agência (String),
// o saldo (double)
// e uma data de abertura (String).
// Além disso, ela deve fazer as seguintes ações:
// saca, para retirar um valor do saldo;
// deposita, para adicionar um valor ao saldo;
// calculaRendimento, para devolver o rendimento
// mensal dessa conta
package app;

public class Conta {
  private String titular;
  private Integer numero;
  private String agencia;
  private Double saldo;
  private String data;

  public Conta(String _titular, Integer _numero, String _agencia, Double _saldo, String _data) {
    this.titular = _titular;
    this.numero = _numero;
    this.agencia = _agencia;
    this.saldo = _saldo;
    this.data = _data;
  }

  public String getTitular() {
    return this.titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public Integer getNumero() {
    return this.numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public String getAgencia() {
    return this.agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public Double getSaldo() {
    return this.saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  public String getData() {
    return this.data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public void saca(Double valor) {
    if (possuiSaldoParaSaque(valor)) {
      this.saldo -= valor;
      System.out.println("Saque realizado com sucesso. Seu saldo é: " + saldo);
    } else {
      System.out.println("Saldo insuficiente. Seu saldo é: " + saldo);
    }
  }

  public void deposita(Double valor) {
    this.saldo += valor;
    System.out.println("Deposito realizado com sucesso. Seu saldo é: " + saldo);
  }

  // lculaRendimento
  // que não recebe parâmetro algum e devolve o valor d
  // o saldo multiplicado
  // por 0.1
  public Double calculaRendimento() {
    return saldo += (saldo * 0.1);
  }

  public boolean possuiSaldoParaSaque(Double valor) {
    if (!(saldo >= valor)) {
      return false;
    }
    return true;
  }

  // recuperaDadosParaImpressao()
  // , que não recebe parâmetro mas devolve o texto
  // com todas as informações da nossa conta para efetua
  // rmos a impressão.
  public String recuperaDadosParaImpressao() {

    String dados = "   Titular: " + this.titular;
    dados += "\n Número: " + this.numero;
    dados += "\n Agencia: " + this.agencia;
    dados += "\n Saldo: " + this.saldo;
    dados += "\n Data: " + this.data;

    System.out.println(dados);

    return dados;
  }

}