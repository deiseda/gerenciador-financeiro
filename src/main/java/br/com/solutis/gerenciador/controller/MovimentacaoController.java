package br.com.solutis.gerenciador.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.solutis.gerenciador.model.Movimentacao;
import br.com.solutis.gerenciador.service.MovimentacaoService;

@RestController
@RequestMapping(value="/movimentacoes")
public class MovimentacaoController {
	
	@Autowired
	private MovimentacaoService movimentacaoService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> buscarPeloId(@PathVariable Integer id) {
		Movimentacao obj = movimentacaoService.obterMovimentacao(id);
		return ResponseEntity.ok().body(obj);
	}

}
