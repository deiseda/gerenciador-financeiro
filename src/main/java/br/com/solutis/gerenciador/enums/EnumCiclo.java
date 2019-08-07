package br.com.solutis.gerenciador.enums;

public enum EnumCiclo {

	RECEITA("PA", "PARCELA"),DESPESA("PE", "PERMANENTE");
	
	private String codigo;
	private String descricao;
	
	private EnumCiclo(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
