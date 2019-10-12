package listasLigadas;

import java.util.LinkedList;

public class Jogador {
	
	private String nome;
	private String sexo;
	private double altura;
	private int dataNascimento;
	
	public Jogador() {
		
	}
	
	public Jogador(String nome, String sexo, double altura, int dataNascimento) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.altura = altura;
		this.dataNascimento = dataNascimento;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Jogador " + nome + ", sexo: " + sexo + ", altura:" + altura + ", Nascimento=" + dataNascimento;
	}
	
	
	

}
