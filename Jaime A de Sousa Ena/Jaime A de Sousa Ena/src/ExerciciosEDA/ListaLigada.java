/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosEDA;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Jaime
 */
public class ListaLigada {
     public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Jaime",'M',1.6,1994);
        Jogador jogador2 = new Jogador("Lino", 'M', 1.4,1992);
        Jogador jogador3 = new Jogador("Yeheskiel",'M', 1.7,1991);


        LinkedList<Jogador> jogadores = new LinkedList();
        Jogador jogador = new Jogador();
        Scanner scan = new Scanner(System.in);


        jogadores.add(jogador1);
        jogadores.add(jogador2);
        jogadores.add(jogador3);


        //a)
         jogadores.addLast(new Jogador("Amos", 'M', 1.6,1991));


        for (Jogador jog: jogadores) {
            System.out.println(jog);
            System.out.println("------------------------------");
        }

        //B)
        jogadores.addFirst(new Jogador("Amos", 'M', 1.6,1991));


        for (Jogador jog: jogadores) {
            System.out.println(jog);
            System.out.println("------------------------------");
        }

        // C)
        System.out.println("Introduza o nome: "); jogador.setNome(scan.nextLine());
        System.out.println("Introduza o nome: "); jogador.setNome(scan.nextLine());
        System.out.println("Introduza o nome: "); jogador.setNome(scan.nextLine());
        System.out.println("Introduza o nome: "); jogador.setNome(scan.nextLine());

        jogadores.addLast(new Jogador("Amos", 'M', 1.6,1991));


        for (Jogador jog: jogadores) {
            System.out.println(jog);
            System.out.println("------------------------------");
        }



        //
        jogadores.remove();

    }
    
}
