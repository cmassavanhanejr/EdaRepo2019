/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaEDAII;

/**
 *
 * @Ana Margarida
 */
public class No {
    private No proximo;
    private Object conteeudo;
    private No primeiro;

    public No(No proximo, Object conteeudo/*, No primeiro*/) {
        this.proximo = proximo;
        this.conteeudo = conteeudo;
//        this.primeiro = primeiro;=
    }

    public No(Object conteeudo) {
        this.conteeudo = conteeudo;
    }

    
    
    
    
    
    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public Object getConteeudo() {
        return conteeudo;
    }

    public void setConteeudo(Object conteeudo) {
        this.conteeudo = conteeudo;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    
    }
 
    
     


//}