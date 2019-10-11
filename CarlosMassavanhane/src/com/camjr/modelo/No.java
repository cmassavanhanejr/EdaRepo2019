package com.camjr.modelo;

public class No {

    private No proximo;
    private Object conteudo;
    private No anterior;

    /**
     *
     * @param proximo
     * @param conteudo
     */
    public No(No proximo, Object conteudo) {
        this. proximo = proximo;
        this. conteudo = conteudo;
    }

    /**
     * Construtor do No contendo o conteudo
     * @param conteudo
     */
    public No(Object conteudo) {
        this. conteudo = conteudo;
    }

    /**
     *
     * @param proximo
     */
    public void setProximo(No proximo) {
        this. proximo = proximo;
    }
    public No getProximo() {
        return proximo;
    }

    public Object getConteudo() {
        return conteudo;
    }

    public No getAnterior() {
        return anterior;
    }
    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }




}
