package myapp.data.tables.guitarModels;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Entity
public class ElGuitarDetails {
	
	@Id
	private String name; 
	
}
