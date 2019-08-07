package br.com.solutis.gerenciador.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.solutis.gerenciador.model.Movimentacao;


@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{

}
