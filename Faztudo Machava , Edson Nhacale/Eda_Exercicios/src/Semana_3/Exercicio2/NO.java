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
public class NO {

    private Object objecto;
    private NO prox;
    private NO anterior;

    public NO(Object objecto) {
        this.objecto = objecto;
        this.prox = null;
    }

    public NO(Object objecto, NO prox) {
        this.objecto = objecto;
        this.prox = prox;
    }

    public Object getJogador() {
        return getObjecto();
    }

    public void setJogador(Object objecto) {
        this.setObjecto(objecto);
    }

    public NO getProx() {
        return prox;
    }

    public void setProx(NO prox) {
        this.prox = prox;
    }

    /**
     * @return the objecto
     */
    public Object getObjecto() {
        return objecto;
    }

    /**
     * @param objecto the objecto to set
     */
    public void setObjecto(Object objecto) {
        this.objecto = objecto;
    }

    /**
     * @return the anterior
     */
    public NO getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NO anterior) {
        this.anterior = anterior;
    }

}
