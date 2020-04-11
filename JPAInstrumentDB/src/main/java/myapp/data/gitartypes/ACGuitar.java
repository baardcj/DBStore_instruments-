package myapp.data.gitartypes;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import myapp.data.GuitarAttributes;
import myapp.data.builders.GBuilder;
import myapp.data.enums.ac.ACGuitarBodyShape;


@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Entity(name="ACGuitar")
public class ACGuitar extends GuitarAttributes{
	

	@Enumerated(EnumType.STRING)
	private ACGuitarBodyShape acShape;	
	
	
	public ACGuitar(GBuilder builder) {
		super();
		this.setAttributes(builder);
		this.acShape = ACGuitarBodyShape.valueOf(builder.getBodyShape().toString());
	}
}
