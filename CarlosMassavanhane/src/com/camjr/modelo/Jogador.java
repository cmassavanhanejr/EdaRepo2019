package com.camjr.modelo;

public class Jogador {
    private String nome;
    private boolean sexo;
    private double altura;
    private int ano_nascimento;

    public Jogador(String nome, boolean sexo, double altura, int ano_nascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.ano_nascimento = ano_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", altura=" + altura +
                ", ano_nascimento=" + ano_nascimento +
                '}';
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getAno_nascimento() {
        return ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }


}
