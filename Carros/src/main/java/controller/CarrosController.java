package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import model.CarrosEntity;
import model.CarrosRepository;


@RestController
@RequestMapping("/api/carros")
public class CarrosController {
	
	
	@Autowired
	private CarrosRepository injecao;
	
	//consulta
	@GetMapping
	public List<CarrosEntity> getCarros(){
		return injecao.findAll();
	}
	
	//inserção
	@PostMapping
	public CarrosEntity addCarro(@RequestBody CarrosEntity carros) {
		return injecao.save(carros);
	}
	
	// remoção
	@DeleteMapping("/{id}")
	public String removeCarro(@PathVariable Long id) {
		
		injecao.deleteById(id); // comando sql delete ... 
		
		return "Remoção realizada com sucesso";
	}
	
	// atualização
	@PutMapping
	public CarrosEntity updateCarro(@RequestBody 
			CarrosEntity carros) {
		
		return injecao.save(carros);
	}
}
