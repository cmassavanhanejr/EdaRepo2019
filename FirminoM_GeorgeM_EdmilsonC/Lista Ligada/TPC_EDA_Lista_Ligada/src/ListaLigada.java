import java.util.LinkedList;
import java.util.Scanner;

public class ListaLigada {


    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("José", 'M', 1.6, 1999);
        Jogador jogador2 = new Jogador("Pedro", 'M', 1.6, 1996);
        Jogador jogador3 = new Jogador("Joana", 'F', 1.7, 1998);


        LinkedList<Jogador> jogadores = new LinkedList();

        Scanner scan = new Scanner(System.in);


        jogadores.add(jogador1);
        jogadores.add(jogador2);
        jogadores.add(jogador3);


        System.out.println("Seleccione uma opção");
        System.out.println("1.  i");
        System.out.println("2.  ii");
        System.out.println("3.  iii");
        System.out.println("4.  iv");
        System.out.println("5.  v");
        System.out.println("6.  vi");
        System.out.println();
        int opcao = scan.nextInt();


        switch (opcao) {

            case 1:
                    jogadores.addLast(new Jogador("Edson", 'M', 1.6, 1997));


                    for (Jogador jog : jogadores) {
                        System.out.println(jog); System.out.println("------------------------------");
            }

                    break;

            case 2:
                    //ii
                    jogadores.addFirst(new Jogador("Edson", 'M', 1.6, 1997));


                    for (Jogador jog : jogadores) {
                         System.out.println(jog); System.out.println("------------------------------");
            }

                    break;

            case 3:
                     //iii
                    System.out.println("Introduza o índice");
                    int scn = scan.nextInt();

                    Jogador jogador5 = new Jogador("Nélio", 'M', 1.7, 1999);

                    jogadores.add(scn, jogador5);


                    for (Jogador jog : jogadores) {
                        System.out.println(jog); System.out.println("------------------------------");
                }


                break;


            case 4:
                        //iv
                        jogadores.removeLast();


                        for (Jogador jog : jogadores) {
                             System.out.println(jog); System.out.println("------------------------------");
            }

                break;

            case 5:
                        //v
                    jogadores.remove(2);


                    for (Jogador jog : jogadores) {
                         System.out.println(jog); System.out.println("------------------------------");
            }

                    break;

            case 6:
                        //vi
                         jogadores.removeFirst();


                        jogadores.addLast(new Jogador("Edson", 'M', 1.6, 1997));


                        for (Jogador jog : jogadores) {
                            System.out.println(jog); System.out.println("------------------------------");
            }


                    break;

        }

    }
}
