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

import org.springframework.format.annotation.DateTimeFormat;

import br.com.solutis.gerenciador.enums.EnumCiclo;
import br.com.solutis.gerenciador.enums.EnumTipoMovimentacao;
import javassist.SerialVersionUID;

@Entity
@Table(name = "movimentacao")
public class Movimentacao implements Serializable{
	
	//private static final Long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_movimentacao;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "data")
	@DateTimeFormat(pattern= "dd-MM-yyyy")
	private Date data;
	
	@Column(name = "tipo_movimentacao")
	@Enumerated(EnumType.STRING)
	private EnumTipoMovimentacao tipoMovimentacao;
	
	@Column(name = "qtd_parcela")
	private int qtdParcela;
	
	@Column(name = "valor")
	private Double valor;
	
	@Column(name = "ciclo")
	@Enumerated(EnumType.STRING)
	private EnumCiclo ciclo;
	
	@Column(name = "id_movimentacao_pai")
	private Integer idMovimentacaoPai;
	
	public Movimentacao() {
		
	}

	public Movimentacao(Integer id_movimentacao, String descricao, Date data, EnumTipoMovimentacao tipoMovimentacao,
			int qtdParcela, Double valor, EnumCiclo ciclo, Integer idMovimentacaoPai) {
		super();
		this.id_movimentacao = id_movimentacao;
		this.descricao = descricao;
		this.data = data;
		this.tipoMovimentacao = tipoMovimentacao;
		this.qtdParcela = qtdParcela;
		this.valor = valor;
		this.ciclo = ciclo;
		this.idMovimentacaoPai = idMovimentacaoPai;
	}

	public Integer getId_movimentacao() {
		return id_movimentacao;
	}

	public void setId_movimentacao(Integer id_movimentacao) {
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}


	public EnumCiclo getCiclo() {
		return ciclo;
	}

	public void setCiclo(EnumCiclo ciclo) {
		this.ciclo = ciclo;
	}

	public Integer getIdMovimentacaoPai() {
		return idMovimentacaoPai;
	}

	public void setIdMovimentacaoPai(Integer idMovimentacaoPai) {
		this.idMovimentacaoPai = idMovimentacaoPai;
	}

	
	
}
