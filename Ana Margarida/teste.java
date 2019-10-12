/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaEDAII;

import java.util.LinkedList;

/**
 *
 * @author use
 */
public class teste {

    public static void main(String[] args) {
        LinkedList<jogador> lista = new LinkedList<jogador>();
        jogador j1 = new jogador("jose", "M", 1.65, 1996);
        jogador j2 = new jogador("Mary", "F", 1.65, 1995);
        jogador j3 = new jogador("dany", "M", 1.65, 1994);
        lista.addFirst(j1);
        lista.add(j2);
        lista.addLast(j3);
            System.out.println(lista);
                   System.out.println("");
        lista.addFirst(j3);
//        lista.addFirst(j1);
        lista.add(j2);
        System.out.println(lista);
        //lista.removeFirst(j1);
       //lista.removeLast(j1);
        lista.remove(j2);
       // lista.removeFirst(j1);

    }

}
