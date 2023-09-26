package br.com.fiap.beans;

public class Livro {
	
	private int codigo;
	private String titulo;
	private double valor;
	
	
	
	public Livro() {
		super();
	}
	
	
	
	public Livro(int codigo, String titulo, double valor) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.valor = valor;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
