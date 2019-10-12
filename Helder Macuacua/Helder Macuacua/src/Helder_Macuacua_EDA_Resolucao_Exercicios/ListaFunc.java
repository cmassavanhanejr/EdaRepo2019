/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helder_Macuacua_EDA_Resolucao_Exercicios;

/**
 *
 * @author Helvi Macuacaua
 */
public class ListaFunc {
    private No primeiro;
    private No ultimo;

    public void inicializarLista(No no){
        primeiro=no;
        ultimo=primeiro;
    }
    
    public void adicionarInicio(No  no){
        if (primeiro==null) {
            inicializarLista(no);
        }else{
           no.setProximo(primeiro);
           primeiro=no;
        }
  
    }
    public void adicionarFim(No  no){
        if (primeiro==null) {
            inicializarLista(no);
        }else{
          ultimo.setProximo(no);
          
           ultimo=no;
        }}
        public void removerInicio(){
        No aux=new No();
        aux.setProximo(primeiro.getProximo());
        primeiro.setProximo(null);
        primeiro=aux.getProximo();
        aux=null;
        }
        public void imprimirLista(){
            No aux=primeiro;
            boolean loop=true;
            while(loop){
                System.out.println(aux.getNome());    
                if (aux.getProximo()!=null) {
                 aux=aux.getProximo();
                } else{
                    return;
                }
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        public int totalItensLista(){
          int total=0;  
            if (primeiro!=null) {
              No aux=primeiro;
              boolean loop=true;
              
                while (loop) {                    
                   total++;
                    if (aux.getProximo()!=null) {
                       aux=aux.getProximo();
                    }
                }
            } else {
                return total;
            }
  
            
            
            
            return total;
        }
        
      public void adicionarporPosicao(int posicao,No novoNo){
            No aux=primeiro;
            if (posicao==0) {
                adicionarInicio(novoNo);}
            else if (posicao==totalItensLista()) {
                adicionarFim(novoNo); 
          }
           else if (posicao<0||posicao>=totalItensLista()) {
                    System.out.println("posicao Invalida");
                    return;
                }     else {
                    posicao--;
                    for (int i = 0; i < totalItensLista(); i++) {
                        if(i==posicao){
                            novoNo.setProximo(aux.getProximo());
                            aux.setProximo(novoNo);
                        }else{
                            aux=aux.getProximo();
                        }
                        
                    }
                }
  
        }  
      
      
      
      public void removerrporPosicao(int posicao){
            No aux=primeiro;
            if (posicao==0) {
                removerInicio();}
            else if (posicao==totalItensLista()) {
               // removerFim();
              
          }
                else if (posicao<0||posicao>=totalItensLista()) {
                        System.out.println("posicao Invalida");
                        return;
}     else {
                posicao--;
                for (int i = 0; i < totalItensLista(); i++) {
                    if(i==posicao){
                      No aux2=aux.getProximo();
                      aux.setProximo(aux.getProximo().getProximo());
                      aux2.setProximo(null);
                      return;
                    }else{
                        aux=aux.getProximo();
                    }
                    
                }
            }
  
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
        
    
}
