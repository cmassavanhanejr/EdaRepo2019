package listasLigadas;



public class LinkedListsManualMethods {

	private No primeiro;
	private	No ultimo;
	private int numeroDeNos;



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

	public int getNumeroDeNos() {
		return numeroDeNos;
	}

	public void setNumeroDeNos(int numeroDeNos) {
		this.numeroDeNos = numeroDeNos;
	}






	public LinkedListsManualMethods() {
	}

	public void adicionaNoInicio(Object conteudo) {
		No node = new No(this.primeiro, conteudo);
		this.primeiro = node;

		if (this.numeroDeNos==0) {
			this.ultimo =primeiro;
		}
		this.numeroDeNos++;

	}
	public void adicionaNoFim(Object conteudo) {

		if (this.numeroDeNos == 0) {
			this.adicionaNoInicio(conteudo);
		} 
		else {
			No node = new No (conteudo);
			this.ultimo.setProximo(node);
			this.ultimo = node;
			this.numeroDeNos++;
		}
	}

	public No acharNo(int posicao) {

		if(posicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição não existe");
		}
		No actual = new No(this.primeiro.getConteudo());
		for (int i = 0; i < posicao; i++) {
			actual = actual.getProximo();
		}
		return actual;
	}


	public void adicionaNaPosicao(int posicao, Object conteudo) {
		if(posicao == 0){
			this.adicionaNoInicio(conteudo);
		} else 
			if(posicao == this.numeroDeNos){
				this.adicionaNoFim(conteudo);
			}
			else {
				No anterior = this.acharNo(posicao - 1);
				No node = new No(anterior.getProximo(), conteudo);
				anterior.setProximo(node);
				this.numeroDeNos++;
			}

	}

	private boolean posicaoOcupada(int posicao){
		return posicao >= 0 && posicao < this.numeroDeNos;
	}

	public void removeNoFim() {
		if (posicaoOcupada(numeroDeNos-1)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		if (this.numeroDeNos == 1) {
			this.removeNoInicio();
		} else {
			No penultimo = this.ultimo.getAnterior();
			penultimo.setProximo(null);
			this.ultimo = penultimo;
			this.numeroDeNos--;
		}	

	}

	public void removeNaPosicao(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		if (posicao == 0) {
			this.removeNoInicio();
		} else if (posicao == this.numeroDeNos - 1) {
			this.removeNoFim();
		} else {
			No anterior = this.acharNo(posicao - 1);
			No atual = anterior.getProximo();
			No proximo = atual.getProximo();
			anterior.setProximo(proximo);
			proximo.setAnterior(anterior);
			this.numeroDeNos--;
		}
	}

	public void removeNoInicio() {
		// TODO Auto-generated method stub
		if (!this.posicaoOcupada(0)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		this.primeiro = this.primeiro.getProximo();
		this.numeroDeNos--;
		if (this.numeroDeNos == 0) {
			this.ultimo = null;
		}
	}
}


	
	


