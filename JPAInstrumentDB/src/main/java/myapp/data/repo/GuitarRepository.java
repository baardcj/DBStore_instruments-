package myapp.data.repo;

import org.springframework.data.repository.CrudRepository;

import myapp.data.tables.StringedInstrument;


public interface GuitarRepository<T extends StringedInstrument> extends CrudRepository<T, Long> {
	
	StringedInstrument findById(long id);
	
	Iterable<T> findAll(); 
}
