package br.com.arthur.contas;

public interface InterfaceConta {
    void sacar(double valor);
    void transferir(Conta contaDestino ,double valor);
    void depositar(double valor);
    void imprimeInfos();
}
