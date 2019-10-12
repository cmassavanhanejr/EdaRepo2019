/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_3;

/**
 *
 * @author FST
 */
public class Jogador {
    private String nome;
    private String sexo;
    private String anoNascimento;
    private float altura;

    public Jogador(String nome, String sexo, String anoNascimento, float altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(String anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
