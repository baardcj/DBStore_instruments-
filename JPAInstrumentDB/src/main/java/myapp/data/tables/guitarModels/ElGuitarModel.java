package myapp.data.tables.guitarModels;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Entity

@Table(uniqueConstraints = @UniqueConstraint(columnNames = {
		"brand", 
		"guitarSeries", 
		"bodyShape"}))
public class ElGuitarModel {
	
	@Id
	private String name; 

}
