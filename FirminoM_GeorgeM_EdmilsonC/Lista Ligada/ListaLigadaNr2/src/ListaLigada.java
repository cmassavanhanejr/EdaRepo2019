public class ListaLigada {

    private No primeiro;
    private No ultimo;
    private int quantNo;


    public ListaLigada() {
        this.primeiro = null;
        this.ultimo = null;
        this.quantNo = 0;
    }

    public No getPrimerio() {
        return primeiro;
    }

    public void setPrimerio(No primerio) {
        this.primeiro = primerio;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public int getQuantNo() {
        return quantNo;
    }

    public void setQuantNo(int quantNo) {
        this.quantNo = quantNo;
    }

    public void inserirPrimeiro(Jogador j) {

        No novoNo = new No(j);

        if (this.quantidade())

            this.ultimo = novoNo;

    }

    public boolean quantidade() {

        return (this.primeiro == null);

    }


    public void inserirUltimo(Jogador jogador) {

        No novoNo = new No(jogador);

        if (quantidade())
            this.primeiro = novoNo;

        else
            this.ultimo.setProximo(novoNo);

        this.ultimo = novoNo;
        this.quantNo++;

    }


    public boolean removerNo(String nome) {
        No actual = this.primeiro;
        No anterior = null;

        if (quantidade()) {
            return false;

        } else {
            while ((actual != null) && (!actual.getJogador().getNome().equals(nome))) {
                anterior = actual;
                actual = actual.getProximo();
            }

            if (actual == this.primeiro) {
                if (this.primeiro == this.ultimo) {
                    this.ultimo = null;
                }

                this.primeiro = this.primeiro.getProximo();
            } else {
                if (actual == this.ultimo) {
                    this.ultimo = anterior;
                    anterior.setProximo(actual.getProximo());
                }
                this.quantNo--;

            }
            return true;

        }
    }

    }

