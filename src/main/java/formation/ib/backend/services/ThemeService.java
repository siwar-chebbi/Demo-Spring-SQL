package formation.ib.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.backend.entities.Theme;
import formation.ib.backend.repositories.ThemeRepository;

@Service
public class ThemeService {
	
	@Autowired
	private ThemeRepository themerepository;

	public <S extends Theme> S save(S entity) {
		return themerepository.save(entity);
	}

	public List<Theme> findAll() {
		return themerepository.findAll();
	}

	public Theme findById(Long id) {
		return themerepository.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}


}
