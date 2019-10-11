package com.camjr.controller;

import com.camjr.modelo.No;

public class LinkedListManual {

    private No primeiro;
    private No ultimo;

    private int totalConteudos;

    private boolean posicaoPreenchida(int pos){
        return pos>= 0 && pos<totalConteudos;
    }

    private No acharNo(int pos){
        if(!this.posicaoPreenchida(pos)){
            throw new IllegalArgumentException("Posicao nao existe");
        }

        No actual = primeiro;
        for(int i=0; i<pos;i++){
            actual=actual.getProximo();
        }
        return actual;
    }

    public void adicionaNoInicio(Object conteudo){
        No node= new No(this.primeiro, conteudo);
        //apontar o node como next

        this.primeiro=node;

        if(this.totalConteudos==0){
            this.ultimo=this.primeiro;
        }
        this.totalConteudos++;
    }

    public void adicionaNoFim(Object conteudo){
        if(this.totalConteudos==0){
            this.adicionaNoInicio(conteudo);
        }
        else{
            No node= new No(conteudo);
            this.ultimo.setProximo(node);
            this.ultimo=node;
            this.totalConteudos++;
        }
    }


    public void adicionaPos(int pos, Object conteudo){
        if(pos == 0){ // No começo.
            this.adicionaNoInicio(conteudo);
        } else if(pos == this.totalConteudos){ // No fim.
            this.adicionaNoFim(conteudo);
        } else {
            No anterior = this.acharNo( pos- 1);
            No novo = new No(anterior.getProximo(), conteudo);
            anterior.setProximo(novo);
            this.totalConteudos++;
        }
    }

    public void removerInicio(){
        if (!this.posicaoPreenchida(0)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        this.primeiro = this.primeiro.getProximo();
        this.totalConteudos--;
        if (this.totalConteudos == 0) {
            this.ultimo = null;
        }
    }

    public void removerUltimo(){
        if (!this.posicaoPreenchida(this.totalConteudos - 1)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        if (this.totalConteudos == 1) {
            this.removerInicio();
        } else {
            No penultima = this.ultimo.getAnterior();
            penultima.setProximo(null);
            this.ultimo = penultima;
            this.totalConteudos--;
        }
    }

    public void removerPos(int pos){
        if (!posicaoPreenchida(pos)){
            throw new IllegalArgumentException("Posicao nao existe");
        }

        if(pos==0){
            this.removerInicio();
        } else if(pos == this.totalConteudos -1){
            this.removerUltimo();
        } else {
            No anterior = this.acharNo(pos - 1);
            No actual = anterior.getProximo();
            No proxima = actual.getProximo();
            anterior.setProximo(proxima);
            proxima.setAnterior(anterior);
            this.totalConteudos--;
        }
    }

    public Object pega(int posicao) {
        return this.acharNo(posicao).getConteudo();
    }
}
