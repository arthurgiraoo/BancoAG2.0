package br.com.arthur.contas;

import br.com.arthur.usuarios.Clientes;

public abstract class Conta implements InterfaceConta{

    private static final int AGENCIA_PADRAO = 0001 ;
    private static int SEQUENCIAL = 1;
    protected double saldo;
    protected int agencia;
    protected int numero;
    private Clientes clientes;

    public Conta(int agencia, int numero,Clientes clientes) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.clientes = clientes;

    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }


    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
    protected void exibeInfos(){
        System.out.println(String.format("Titular %s",this.clientes.getNome()));
        System.out.println(String.format("Agência: %d",this.agencia));
        System.out.println(String.format("Numero: %d",this.numero));
        System.out.println(String.format("Agência: %.2f",this.saldo));
    }
}
