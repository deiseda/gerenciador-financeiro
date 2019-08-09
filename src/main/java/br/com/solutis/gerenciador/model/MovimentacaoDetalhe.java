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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.solutis.gerenciador.enums.EnumCiclo;
import br.com.solutis.gerenciador.enums.EnumTipoMovimentacao;
import javassist.SerialVersionUID;

@Entity
@Table(name = "movimentacao_detalhe")
public class MovimentacaoDetalhe implements Serializable{
	
	//private static final Long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "id_mov_detalhe")
	private Integer idMovDetalhe;
	
	@ManyToOne
	@JoinColumn(name = "id_movimentacao")
	private Movimentacao idMovimentacao;
	
	@Column(name = "data")
	@DateTimeFormat(pattern= "dd-MM-yyyy")
	private Date data;
	
	@Column(name = "data_vencimento")
	@DateTimeFormat(pattern= "dd-MM-yyyy")
	private Date dataVencimaneto;
	
	@Column(name = "parcela")
	private int parcela;
	
	@Column(name = "valor")
	private Double valor;
	
	
	
	public MovimentacaoDetalhe() {
		
	}



	public Integer getIdMovDetalhe() {
		return idMovDetalhe;
	}



	public void setIdMovDetalhe(Integer idMovDetalhe) {
		this.idMovDetalhe = idMovDetalhe;
	}



	public Movimentacao getIdMovimentacao() {
		return idMovimentacao;
	}



	public void setIdMovimentacao(Movimentacao idMovimentacao) {
		this.idMovimentacao = idMovimentacao;
	}



	public Date getData() {
		return data;
	}



	public void setData(Date data) {
		this.data = data;
	}



	public Date getDataVencimaneto() {
		return dataVencimaneto;
	}



	public void setDataVencimaneto(Date dataVencimaneto) {
		this.dataVencimaneto = dataVencimaneto;
	}



	public int getParcela() {
		return parcela;
	}



	public void setParcela(int parcela) {
		this.parcela = parcela;
	}



	public Double getValor() {
		return valor;
	}



	public void setValor(Double valor) {
		this.valor = valor;
	}



	
}
