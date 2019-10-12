/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_3.Exercicio2;

/**
 *
 * @author FST
 */
public class listaSimples {

    private NO primeiro;
    private NO ultimo;
    private NO penultimo;
    private int quantidade;

    public listaSimples() {
        this.primeiro = null;
        this.ultimo = null;
        this.quantidade = 0;
    }

    public NO getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NO primeiro) {
        this.primeiro = primeiro;
    }

    public NO getUltimo() {
        return ultimo;
    }

    public void setUltimo(NO ultimo) {
        this.ultimo = ultimo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public NO getPenultimo() {
        return penultimo;
    }

    public void setPenultimo(NO penultimo) {
        this.penultimo = penultimo;
    }

    public NO pegarNO(int pos) {
        NO atual = primeiro;
        for (int i = 0; i < pos; i++) {
            atual = atual.getProx();
        }
        return atual;
    }

    public Object procurarObjecto(int posicao) {
        return this.pegarNO(posicao).getObjecto();
    }

    public void inserirPrimeiro(Object objecto) {
        NO newNO = new NO(objecto);
        if (primeiro == null) {
            ultimo = newNO;
        }
        newNO.setProx(primeiro);
        primeiro = newNO;
        quantidade++;

    }

    public void inserirUltimo(Object objecto) {
        NO newNO = new NO(objecto);
        if (primeiro == null) {
            primeiro = newNO;
        } else {
            ultimo.setProx(newNO);
        }
        ultimo = newNO;
        quantidade++;

    }

    public void inserir(int pos, Object objecto) {
        NO newNO = new NO(objecto);
        if (pos == 0) {
            inserirPrimeiro(objecto);
        } else if (pos == quantidade) {
            inserirUltimo(objecto);
        } else {
            ultimo.setProx(newNO);
            ultimo = newNO;
            quantidade++;
        }

    }

    public void removerPrimeiro() {
        primeiro = primeiro.getProx();
        quantidade--;
        if (this.quantidade == 0) {
            this.ultimo = null;
        }
    }

    public void removerUltimo() {
        if (quantidade == 1) {
            removerPrimeiro();
        } else {
            NO penultimo = ultimo.getAnterior();
            penultimo.setProx(null);
            ultimo = penultimo;
            quantidade--;
        }
    }

    public void removerPos(int pos) {
        if (pos == 0) {
            removerPrimeiro();
        } else if (pos == quantidade - 1) {
            removerUltimo();
        } else {
            NO anterior = pegarNO(pos - 1);
            NO atual = anterior.getProx();
            NO proximo = atual.getProx();
            anterior.setProx(proximo);
            proximo.setAnterior(anterior);
            quantidade--;
        }
    }

}
