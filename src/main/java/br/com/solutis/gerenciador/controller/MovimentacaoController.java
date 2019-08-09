package br.com.solutis.gerenciador.controller;


import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.solutis.gerenciador.dao.MovimentacaoRepository;
import br.com.solutis.gerenciador.model.Movimentacao;
import br.com.solutis.gerenciador.service.MovimentacaoService;

@RestController
@RequestMapping(value="/movimentacoes")
public class MovimentacaoController {
	
	@Autowired
	private MovimentacaoService movimentacaoService;
	@Autowired
	private MovimentacaoRepository MovimentacaoRepository;
	
	//Busca pelo Id
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> buscarPeloId(@PathVariable Integer id) {
		Movimentacao obj = movimentacaoService.obterMovimentacao(id);
		return ResponseEntity.ok().body(obj);
	}
	
	//Obter todos
	@GetMapping("/")
	public ModelAndView obterTodos() {
		ModelAndView obj = new ModelAndView("/post");
			obj.addObject("post", movimentacaoService.obterTodos());
			return obj;
	}
	
	/*@PutMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("idMovimentacao") Integer idMovimentacao) {
		
		return add(movimentacaoService.alterar(idMovimentacao));
	}*/
	
	
	//Delete 
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		 movimentacaoService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	//Altera não funciona a
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void>	alterar(@RequestBody Movimentacao obj, @PathVariable Integer id){
		obj.setIdMovimentacao(id);
		obj = movimentacaoService.alterar(obj, id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> salvar(@RequestBody Movimentacao obj){
		obj = movimentacaoService.salvar(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId_movimentacao()).toUri();
		return ResponseEntity.created(uri).build();
	}

}
