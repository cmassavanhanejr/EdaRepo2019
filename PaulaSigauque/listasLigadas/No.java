package listasLigadas;

public class No {

	private No proximo;
	private	No anterior;

	private Object conteudo;

	public No (No proximo, Object conteudo) {
		this.proximo = proximo;
		this.conteudo = conteudo;
	}

	public No(Object conteudo) {
		this.conteudo = conteudo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	public void setConteudo(Object conteudo) {
		this.conteudo = conteudo;
	}

	public No getProximo() {
		return proximo;
	}

	public Object getConteudo() {
		return conteudo;
	}
	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}


}


