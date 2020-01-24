package model.bean;

public class Produto {
	
	private Long numSequencial;
	private String descricao;
	private Integer quantidade;
	private double preco;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getNumSequencial() {
		return numSequencial;
	}
	public void setNumSequencial(Long numSequencial) {
		this.numSequencial = numSequencial;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	

}
