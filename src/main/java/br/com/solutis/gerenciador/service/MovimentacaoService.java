package br.com.solutis.gerenciador.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.event.spi.PostCollectionRecreateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.com.solutis.gerenciador.dao.MovimentacaoRepository;
import br.com.solutis.gerenciador.model.Movimentacao;

@Service
public class MovimentacaoService {

	@Autowired
	private MovimentacaoRepository movimentacaoRepository;
	
	public Movimentacao obterMovimentacao(Integer idMovimentacao) {
		Optional<Movimentacao> mov = movimentacaoRepository.findById(idMovimentacao);
		return mov.orElse(null);
	}
	
	public List<Movimentacao> obterTodos() {
		
		return movimentacaoRepository.findAll();
	}
	
	/*public Movimentacao alterar(Integer idMovimentacao) {
		
		return movimentacaoRepository.saveAndFlush(idMovimentacao);
		
	}*/
	
	public void delete(Integer idMovimentacao) {
		 movimentacaoRepository.deleteById(idMovimentacao);
	}
	
	public Movimentacao alterar(Movimentacao obj, Integer id) {
		Movimentacao movimentacao = this.obterMovimentacao(id);
		if(obj.getCiclo() != null) {
			movimentacao.setCiclo(obj.getCiclo());
		}
		if(obj.getDescricao() != null) {
			movimentacao.setDescricao(obj.getDescricao());
		}
		if(obj.getData() != null) {
			movimentacao.setData(obj.getData());
		}
		
		return movimentacaoRepository.save(movimentacao);
	}
	
	public Movimentacao salvar(Movimentacao obj) {
		return movimentacaoRepository.save(obj);
	}

}
