/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helder_Macuacua_EDA_Resolucao_Exercicios;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Helvi Macuas LG
 */
public class ListaLigada {
    public static void main(String[] args) {
        
    
    LinkedList<Jogador> jogadores=new LinkedList<>();
    
    Jogador jogador=new Jogador("Euler", 'M', 1.70, 1980);
    jogadores.addFirst(jogador);
    
    Jogador jogador1=new Jogador("Joel", 'M', 1.72, 1987);
    jogadores.addLast(jogador1);
    
    Jogador jogador2=new Jogador("Artinho", 'M', 1.69, 1989);
    jogadores.add(2, jogador2);
    
    Jogador jogador3=new Jogador("Domingues", 'M', 1.90, 1986);
    jogadores.add(jogador3);
    
    
    Jogador jogador4=new Jogador("Zidane", 'M', 1.78, 1985);
    jogadores.add(4, jogador4);
    
    Jogador jogador5=new Jogador("Postiga", 'M', 1.67, 1984);
    jogadores.add(3, jogador5);
    
    jogadores.removeFirst();
    jogadores.removeLast();
    jogadores.remove(0);
    jogadores.remove(jogador1);
    jogadores.removeFirstOccurrence(jogador5);
    jogadores.removeLastOccurrence(jogador3);
    
   
    
    
}
}