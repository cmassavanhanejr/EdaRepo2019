package listasLigadas;

import java.util.LinkedList;

public class JogadorLinkedList{

	private static Object conteudo = new Object();
	static LinkedList<Object> jogadores = new LinkedList<>();


	public static void adicionaNoFim(Object conteudo) {
		jogadores.addLast(conteudo); 
	}
	public static void adicionaNoInicio(Object conteudo) {
		jogadores.addFirst(conteudo);
	}
	public void adicionaNaPosicao(int posicao,Object conteudo) {
		jogadores.add(posicao, conteudo);
	}
	public void removeNoFim() {
		jogadores.removeLast();
	}
	public void removeNoInicio() {
		jogadores.removeFirst();
	}
	public void removeNaPosicao(int posicao) {
		jogadores.remove(posicao);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Jogador j = new Jogador("Joao", "masculino", 1.50, 1998);
		conteudo = j;
		adicionaNoFim(conteudo);
		adicionaNoInicio(conteudo);
		j.setNome("Paulo");
		j.setSexo("Masculino");
		j.setAltura(1.78);
		j.setDataNascimento(2002);

		System.out.println(jogadores);


	}

}
