package model;

public class Conta {

    private int numeroConta;
    private String agencia;
    private String titular;
    private double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirInformacoes() {

        System.out.println("Número da Conta: " + getNumeroConta());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: R$" + getSaldo());

    }

    public double depositar(double valor) {

        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
        return valor;
    }

    public void sacar(double valor) {

        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
