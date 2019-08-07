package br.com.solutis.gerenciador.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	
}
