/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helder_Macuacua_EDA_Resolucao_Exercicios;

/**
 *
 * @author Helvi Macuas LG
 */
public class Jogador {
   
    private String nome;
    private char sexo;
    private double altura;
    private int anoDeNascimento;

    public Jogador() {
    }

    public Jogador(String nome, char sexo, double altura, int anoDeNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.anoDeNascimento = anoDeNascimento;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
