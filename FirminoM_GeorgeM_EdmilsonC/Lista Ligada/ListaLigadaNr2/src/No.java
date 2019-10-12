public class No {

    private No proximo;
    private Jogador jogador;

    public No(No proximo, Jogador jogador){
        this.proximo = proximo;
        this.jogador = jogador;
    }

    public No(Jogador jogador){
        this.proximo = proximo;
        this.jogador = jogador;
    }


    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
}
