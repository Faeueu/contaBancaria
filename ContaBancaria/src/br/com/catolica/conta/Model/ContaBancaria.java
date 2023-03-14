package br.com.catolica.conta.Model;

public class ContaBancaria {
    public String instituicaoFinanceira;
    public String titularDaConta;
    public int agencia;
    public int conta;
    public long cpf;
    public double valorEmConta = 1000;
    public ContaBancaria(String instituicao, String titularDaConta, int agencia, int conta, long cpf){
        this.instituicaoFinanceira = instituicao;
        this.titularDaConta = titularDaConta;
        this.agencia = agencia;
        this.conta = conta;
        this.cpf = cpf;
    }
    public void depositar(double valor) {this.valorEmConta += valor;}
    public void retirar(double valor) {this.valorEmConta -= valor;}
}