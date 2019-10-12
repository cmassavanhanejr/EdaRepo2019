/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosEDA;

/**
 *
 * @author Jaime
 */
public class Jogador {
     private String nome;
    private char sexo;
    private double altura;
    private int ano_nascimento;


    public Jogador(String nome, char sexo, double altura, int ano_nascimento){
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.ano_nascimento = ano_nascimento;
        
        

    }

    public Jogador() {
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

    public int getAno_nascimento() {
        return ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }


    @Override
    public String toString() {
        return "Nome: "+getNome()
        + "\nSexo: "+getSexo()
        + "\nAltura: "+getAltura()
                +"\nAno de nascimento: "+getAno_nascimento();




    }
    
}
