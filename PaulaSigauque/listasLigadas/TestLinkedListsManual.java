package listasLigadas;

import java.util.Vector;

public class TestLinkedListsManual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Jogador> jogador = new Vector<Jogador>();
		
		for(int i=15; i<20; i++) {
			jogador.set(i, new Jogador(("Jogador "+ (i-15)), "Masc", i, (1990+i)));
		}
		
		//No noJogadores
	}

}
