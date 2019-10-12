/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaEDAII;

/**
 *
 * @author use
 */
public class jogador {
   private String nome;
   private String sexo;
  private double altura;
  private int anoNascimento;  

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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public jogador() {
    }

    public jogador(String nome, String sexo, double altura, int anoNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.anoNascimento = anoNascimento;
    }

  

    @Override
    public String toString() {
        return "jogador{" + "nome=" + nome + ", sexo=" + sexo + ", altura=" + altura + ", anoNascimento=" + anoNascimento + '}';
    }
   
  
        
}