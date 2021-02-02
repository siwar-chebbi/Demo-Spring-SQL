package formation.ib.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.ib.backend.entities.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long>{// nom de la classe et Long le type de son ID 

	public List<Formation> findByTitre(String titre);// Spring est capable de lire cette methode comme une requettes SQL et il va regarder dans tt le code et en plus il va connatre titre directement
	public List<Formation> findByDescription(String description);//query methode de JPA

}

