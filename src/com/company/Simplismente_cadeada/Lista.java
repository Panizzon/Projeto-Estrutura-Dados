package com.company.Simplismente_cadeada;

public class Lista {

    private No inicio;
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    // Criar Lista - Construtor
    public Lista() {
        this.inicio = null;
        this.quantidade = 0;
    }

    // verificar se a lista está vazia.
    public boolean isVazia() {
        return this.inicio == null;
    }

    public void inserirNoInicio(No no) {
        if (isVazia()) {
            this.inicio = no;
        } else {
            no.setProximo(this.inicio);
            this.inicio = no;
        }
        this.quantidade++;
    }

    public void inserirNoFim(No no) {
        if (isVazia()) {
            this.inicio = no;
        } else {
            No aux = inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(no);
        }
        this.quantidade++;
    }

    public void inserirNaPosicao(No no, int posicao) {
        if (isVazia() || posicao <= 1) {
            inserirNoInicio(no);
        } else if (posicao > quantidade) {
            inserirNoFim(no);
        } else {

            No aux = this.inicio;
            No anterior = null;

            for (int i = 1; i < posicao; i++) {
                anterior = aux;
                aux = aux.getProximo();
            }

            no.setProximo(anterior.getProximo());
            anterior.setProximo(no);
        }
        this.quantidade++;

    }

    public No remover(int posicao) {
        No aux = null;

        if (!isVazia() && posicao >= 1 && posicao <= quantidade) {
            aux = this.inicio;
            No anterior = null;

            if (posicao == 1) {
                this.inicio = aux.getProximo();
                aux.setProximo(null);
            } else {
                for (int i = 1; i < posicao; i++) {
                    anterior = aux;
                    aux = aux.getProximo();
                }
                anterior.setProximo(aux.getProximo());
                aux.setProximo(null);
            }
            this.quantidade--;
        }
        return aux;
    }

    public void imprimir() {
        if (isVazia()) {
            System.out.println("Lista Vazia!");
        } else {
            No aux = inicio;
            int i = aux.getElemento()%2;
            if(i ==0){
                while (aux != null) {
                    System.out.println(aux.getElemento());
                    aux = aux.getProximo();
                }
            }

        }
    }

}
