package br.com.solutis.gerenciador.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.solutis.gerenciador.enums.EnumTipoMovimentacao;
import javassist.SerialVersionUID;

@Entity
@Table(name = "movimentacao")
public class Movimentacao implements Serializable{
	
	private static final long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_movimentacao;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "data")
	private Date data;
	
	@Column(name = "tipo_movimentacao")
	@Enumerated(EnumType.STRING)
	private EnumTipoMovimentacao tipoMovimentacao;
	
	@Column(name = "qtd_parcela")
	private int qtdParcela;
	
	

	public Long getId_movimentacao() {
		return id_movimentacao;
	}

	public void setId_movimentacao(Long id_movimentacao) {
		this.id_movimentacao = id_movimentacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public EnumTipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(EnumTipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}

	public int getQtdParcela() {
		return qtdParcela;
	}

	public void setQtdParcela(int qtdParcela) {
		this.qtdParcela = qtdParcela;
	}

	
	
}
