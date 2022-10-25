package br.edu.fatecfranca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.model.CandidatoEntity;
import br.edu.fatecfranca.model.CandidatoRepository;

@RestController //Dizer que isso é um controller rest
@RequestMapping("/api/candidato")//responde nessa rota
public class CandidatoController {
	//O Java Spring tem como principal caracteristica
	//a injeção de dependencia, que permite que um objeto
	//possa executar metodos sem ser instanciado
	@Autowired
	private CandidatoRepository injecao;
	//consulta
	@GetMapping
	public List<CandidatoEntity> getCandidatos(){
		return injecao.findAll();
	} 
	//inserção
	@PostMapping
	public CandidatoEntity addCandidato(@RequestBody CandidatoEntity candidato) {
		//Insere no banco e retorna o objeto criado
		return injecao.save(candidato); //Faz o insert
	}
	//remoção
	//atualização
	
}
 