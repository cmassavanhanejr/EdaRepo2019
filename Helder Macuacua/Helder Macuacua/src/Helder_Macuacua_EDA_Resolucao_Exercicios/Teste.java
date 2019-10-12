/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helder_Macuacua_EDA_Resolucao_Exercicios;

/**
 *
 * @author Helvi Macuas LG
 */
public class Teste {
    public static void main(String[] args) {
        ListaFunc lista=new ListaFunc();
        No p=new No();
        p.setNome("Helder Pelembe");
        lista.adicionarFim(p);
        No p2=new No();
         p2.setNome("Domingues");
        lista.adicionarInicio(p2);
        No p3=new No();
         p3.setNome(" Paito");
        lista.adicionarInicio(p3);
        
        
        
        lista.imprimirLista();
       
        
    }
    
}
