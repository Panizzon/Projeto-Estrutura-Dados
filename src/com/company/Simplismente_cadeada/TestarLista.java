package com.company.Simplismente_cadeada;

public class TestarLista {

    public static void main(String[] args) {

        Lista lista = new Lista();

        System.out.println(lista.isVazia());
        lista.imprimir();
        lista.inserirNoInicio(new No(5));
        lista.inserirNoFim(new No(1));
        lista.inserirNaPosicao(new No(8),2);
        lista.inserirNoFim(new No(2));
        lista.inserirNoFim(new No(3));
        lista.remover(2);
        lista.imprimir();
        System.out.println("Quantidade: "+lista.getQuantidade());
    }
}
