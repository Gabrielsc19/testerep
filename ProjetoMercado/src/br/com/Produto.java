package br.com;

public class Produto {
	
	private long codigo;
	private String descricao;
	private int quantidade;
	private double valor;
	

	public Produto() {}
	
	public Produto (long codigo, String descri��o, int quantidade, double valor) {
	this.codigo = codigo;
	this.descricao = descri��o;
	this.quantidade = quantidade;
	this.valor = valor;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String consultar(int codigo) {
		String consulta = "";
		
		consulta += "\n ----------------------";
		consulta += "\n C�digo: "+ this.codigo;
	    consulta += "\n Descri��o: "+ this.descricao;
		consulta += "\n Quantidade: "+ this.quantidade;
	    consulta += "\n Valor: "+ this.valor;
		consulta += "\n----------------------";
		return consulta;
	}
}
