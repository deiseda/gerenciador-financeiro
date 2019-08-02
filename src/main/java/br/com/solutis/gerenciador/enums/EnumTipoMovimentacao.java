package br.com.solutis.gerenciador.enums;

public enum EnumTipoMovimentacao {

	RECEITA("C", "CREDITO"),DESPESA("D", "DESPESA");
	
	private String codigo;
	private String descricao;
	
	private EnumTipoMovimentacao(String codigo, String descricao) {
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
