/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_3.Exercicio1;

import Semana_3.Jogador;
import java.util.LinkedList;

/**
 *
 * @author FST
 */
public class ListaLigada {
   static LinkedList<Jogador> lista = new LinkedList<>();
    
    public static void adicionarJogadorFirst(Jogador jog){
        lista.addFirst(jog);
    }
    
    public static void adicionarJogadorLast(Jogador jog){
        lista.addLast(jog);
    }
    public static void adicionarJogadorPos(Jogador jog , int pos){
        lista.add(pos , jog);
    }
    public static void removerJogadorPos( int pos){
        lista.remove(pos);
    }
    public static void removerJogadorFirst(){
        lista.removeFirst();
    }
    public static void removerJogadorLast(){
        lista.removeLast();
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        
        
    }
    
}
