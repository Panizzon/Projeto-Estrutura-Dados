package com.company.Duplamente_encadeada;

public class Lista {

    private No inicio;
    private No fim;
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    // Criar Lista - Construtor
    public Lista() {
        inicio = fim = null;
        this.quantidade = 0;
    }

    // verificar se a lista está vazia.
    public boolean isVazia(){
        return inicio == null;
    }

    public void InserirNoInicio(No no){
        if(isVazia()){
            inicio = no;
            fim = no;
        }
        else{
            no.setProximo(inicio);
            inicio.setAnterior(no);
            inicio = no;
        }
    quantidade++;
    }

    public void InserirNoFim(No no){
        if(isVazia()){
            inicio = no;
            fim = no;
        }else{
            no.setAnterior(fim);
            fim.setProximo(no);
            fim = no;
        }
        quantidade++;
    }

    public void Inserir(No no, int posicao){
        if (isVazia() || posicao <= 1){
            InserirNoInicio(no);
        }else{
            No aux = inicio;
            for (int i = 1; i < posicao; i++){
                aux = aux.getProximo();
            }
            no.setProximo(aux);
            no.setAnterior(aux.getProximo());
            no.getAnterior().setProximo(no);
            aux.setAnterior(no);
        }
    }

    public void imprimir() {
        if (isVazia()) {
            System.out.println("Lista Vazia!");
        } else {
            No aux = inicio;
            while (aux != null) {
                System.out.println(aux.getElemento());
                aux = aux.getProximo();
                }
            }

        }

    }



