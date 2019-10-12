/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaEDAII;

/**
 *
 * @author use
 */
public class teste_No {
    public static void main(String args[]){
    private No primeiro;
    private No ultimo;
    private int totalDeElementos;

    public void adiciona(Object elemento) {

        if (this.totalDeElementos == 0) {
            this.adicionaComeco(elemento);
        } else {
            No novo = new No(elemento);
            this.ultimo.setProximo(novo);
            novo.setAnterior(this.ultimo);
            this.ultimo = novo;
            this.totalDeElementos++;
        }

    }

    public void adicionaComeco(Object elemento) {
     
        if (this.totalDeElementos == 0) {
            No novo = new No(elemento);
            this.primeiro = novo;
            this.ultimo = novo;
        } else {
           No novo = new No(this.primeiro, elemento);
            this.primeiro.setAnterior(novo);
            this.primeiro = novo;
        }
        this.totalDeElementos++;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    private No pegaNo(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        No atual = primeiro;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public void adiciona(int posicao, Object elemento) {

        if (posicao == 0) { // No começo.
            this.adicionaComeco(elemento);
        } else if (posicao == this.totalDeElementos) { // No fim.
            this.adiciona(elemento);
        } else {
            No anterior = this.pegaNo(posicao - 1);
            No proximo = anterior.getProximo();
           No novo = new No(anterior.getProximo(), elemento); 
           novo.setAnterior(anterior);
            anterior.setProximo(novo);   
            proximo.setAnterior(novo);
            this.totalDeElementos++;
        }
    }

    public Object pega(int posicao) {
        return this.pegaNo(posicao).getElemento();
    }

    public void removeDoComeco() {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        this.primeiro = this.primeiro.getProximo();
        this.totalDeElementos--;
        if (this.totalDeElementos == 0) {
            this.ultimo = null;
        }
    }

    public void removeDoFim() {
        if (!this.posicaoOcupada(this.totalDeElementos - 1)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        if (this.totalDeElementos == 1) {
            this.removeDoComeco();
        } else {
            No penultimo = this.ultimo.getAnterior();
            penultimo.setProximo(null);
            this.ultimo = penultimo;
            this.totalDeElementos--;
        }
    }

    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        if (posicao == 0) {
            this.removeDoComeco();
        } else if (posicao == this.totalDeElementos - 1) {
            this.removeDoFim();
        } else {
         No anterior = this.pegaNo(posicao - 1);
            No atual = anterior.getProximo();
            No proximo = atual.getProximo();
            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);
            this.totalDeElementos--;
        }
    }

    public boolean contem(Object elemento) {
       No atual = this.primeiro;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    @Override
    public String toString() {

        // Verificando se a Lista está vazia
        if (this.totalDeElementos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        No atual = primeiro;
        // Percorrendo até o penúltimo elemento.
        for (int i = 0; i < this.totalDeElementos - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProximo();
        }
        // último elemento
        builder.append(atual.getElemento());
        builder.append("]");
        return builder.toString();
    }
    
}
}