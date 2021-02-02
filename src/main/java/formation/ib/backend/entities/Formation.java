package formation.ib.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //une entité (table) dans la base de donnée
@Table(name="formations")
public class Formation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)// generer autaumatiqueemnt
	private Long id;
	
	@Column(name ="titre")
	private String titre;
	
	@Column(name ="description")
	private String description;

	public Long getId() {
		return id;
	}

	public String getTitre() {
		return titre;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
