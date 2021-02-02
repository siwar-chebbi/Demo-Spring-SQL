package formation.ib.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.backend.entities.Formation;
import formation.ib.backend.repositories.FormationRepository;

@Service
public class FormationService {
	
	@Autowired
	private FormationRepository repository;// Spring va genere une classe qui contient le code en respectant le contrat de l'interface

	public <S extends Formation> S save(S entity) {
		return repository.save(entity);
	}

	public List<Formation> findAll() {
		return repository.findAll();
	}

	public List<Formation> findByTitre(String titre) {//source , generate delagete et ttes les focntions su'on trouve c'est grace 
		return repository.findByTitre(titre);
	}

	public List<Formation> findByDescription(String description) {
		return repository.findByDescription(description);
	}


	
	public Formation findById(Long id) {//travailler avec Optional ca nous permet de ne pas planter notre application si dans la case y a null
		return repository.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));// orElseThrow est une fonction optionnel 
	}
	



}
