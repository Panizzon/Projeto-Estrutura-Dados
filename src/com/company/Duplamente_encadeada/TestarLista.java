package com.company.Duplamente_encadeada;

public class TestarLista {

    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.imprimir();

        lista.InserirNoInicio(new No(3));
        lista.InserirNoInicio(new No(22));
        lista.InserirNoFim(new No(1));
        lista.Inserir(new No(21),2);

        lista.imprimir();
    }
}
