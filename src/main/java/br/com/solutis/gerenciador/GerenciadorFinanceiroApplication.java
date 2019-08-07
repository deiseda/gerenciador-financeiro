package br.com.solutis.gerenciador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.aspectj.apache.bcel.classfile.annotation.EnumElementValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.solutis.gerenciador.dao.MovimentacaoRepository;
import br.com.solutis.gerenciador.enums.EnumTipoMovimentacao;
import br.com.solutis.gerenciador.model.Movimentacao;

@SpringBootApplication
public class GerenciadorFinanceiroApplication implements CommandLineRunner{
 
	@Autowired
	private MovimentacaoRepository movimentacaoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(GerenciadorFinanceiroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		try {
		Movimentacao mov1 = new Movimentacao(null, "teste deise", new Date(), EnumTipoMovimentacao.DESPESA, 2, 10D,null,null);

		//movimentacaoRepository.save(mov1);
		}catch (Exception e){
			System.out.println(e);
		}
	}
	

}
