package myapp.data.tables.guitarModels;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import myapp.data.enums.product.guitar.shapes.ACGuitarBodyShape;
import myapp.data.tables.Guitar;


@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Entity(name="ACGuitar")
public class ACGuitar extends Guitar{
	

	@Enumerated(EnumType.STRING)
	private ACGuitarBodyShape acShape;	
	
	/*
	@SuppressWarnings("unused")
	private boolean cutAway; 
	*/

}
