package formation.ib.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formation.ib.backend.entities.Formation;
import formation.ib.backend.services.FormationService;

@RestController
@RequestMapping("formations")
@CrossOrigin //pour eviter des pb
public class FormationController {
	
	@Autowired// permet de dire a Sring de chercher une instance de cette classe //j'ai besoin d'un sservice
	private FormationService service;
	
	
	@GetMapping
	public List<Formation> findAll(){
		return this.service.findAll();
	}
	
	@PostMapping
	public Formation save (@RequestBody Formation entity) {
		return this.service.save(entity);
	}
	
	@GetMapping("titre/{titre}")
	public List<Formation> findByTitre(@PathVariable String titre) {
		return service.findByTitre(titre);
	}
	@GetMapping("{id}")// pas besoin de mettre id/{id}
	public Formation findById(@PathVariable Long id) {
		return service.findById(id);
	}
	@GetMapping("description/{description}")
	public List<Formation> findByDescription(@PathVariable String description) {
		return service.findByDescription(description);
	}
	
	
	
	

}
