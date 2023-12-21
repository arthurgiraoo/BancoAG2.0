package br.com.arthur.contas;

import br.com.arthur.usuarios.Clientes;

public class ContaCorrente extends Conta{


    public ContaCorrente(int agencia, int numero, Clientes clientes) {
        super(agencia, numero, clientes);
    }

    public void imprimeInfos(){
        System.out.println("=== Extrato conta corrente ===");
        super.exibeInfos();
    }
}
