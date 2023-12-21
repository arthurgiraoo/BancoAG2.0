package br.com.arthur.contas;

import br.com.arthur.usuarios.Clientes;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(int agencia, int numero, Clientes clientes) {
        super(agencia, numero, clientes);
    }

    public void imprimeInfos(){
        System.out.println("=== Extrato conta poupança ===");
        super.exibeInfos();
    }
}
