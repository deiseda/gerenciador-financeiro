package br.com.solutis.gerenciador.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "movimentacao_detalhe")
public class MovimentacaoDetalhe implements Serializable {
	
	private static final long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idMovDetalhe;
	
	@Column(name = "id_mov_detalhe")
	private Long idMovimentacao;
	
	@Column(name = "valor")
	private BigDecimal valor;
	
	@Column(name = "data")
	private Date data;
	
	@Column(name = "data_vencimento")
	private Date dataVencimento;
	
	@Column(name = "pago")
	private String pago;
	
	@Column(name = "parcela")
	private int parcela;

	public Long getIdMovDetalhe() {
		return idMovDetalhe;
	}

	public void setIdMovDetalhe(Long idMovDetalhe) {
		this.idMovDetalhe = idMovDetalhe;
	}

	public Long getIdMovimentacao() {
		return idMovimentacao;
	}

	public void setIdMovimentacao(Long idMovimentacao) {
		this.idMovimentacao = idMovimentacao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getPago() {
		return pago;
	}

	public void setPago(String pago) {
		this.pago = pago;
	}

	public int getParcela() {
		return parcela;
	}

	public void setParcela(int parcela) {
		this.parcela = parcela;
	}
	
	
	
	
	
	
	
	
	

}
