package br.com.arthur.teste;

import br.com.arthur.contas.Conta;
import br.com.arthur.contas.ContaCorrente;
import br.com.arthur.contas.ContaPoupanca;
import br.com.arthur.usuarios.Clientes;

public class Main {
    public static void main(String[] args) {
        Clientes valmir = new Clientes();
        valmir.setNome("Valmir");
        Conta cc = new ContaCorrente(0,0,valmir);
        cc.depositar(1000);
        Conta cp = new ContaPoupanca(0,0,valmir);
        cc.transferir(cp,500);

        cc.imprimeInfos();
        cp.imprimeInfos();


    }
}