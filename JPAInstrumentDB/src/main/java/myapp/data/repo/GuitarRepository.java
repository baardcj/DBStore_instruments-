package myapp.data.repo;

import org.springframework.data.repository.CrudRepository;
import myapp.data.Guitar;


public interface GuitarRepository<T extends Guitar> extends CrudRepository<T, Long> {
	
	Guitar findById(long id);
	
	Iterable<T> findAll(); 
}
