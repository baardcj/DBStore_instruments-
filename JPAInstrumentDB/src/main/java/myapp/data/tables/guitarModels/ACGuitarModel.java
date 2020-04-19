package myapp.data.tables.guitarModels;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import myapp.builders.GBuilder;
import myapp.data.enums.product.guitar.shapes.ACGuitarBodyShape;
import myapp.data.tables.GuitarModel;


@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Entity(name="ACGuitar")
public class ACGuitarModel extends GuitarModel{
	

	@Enumerated(EnumType.STRING)
	private ACGuitarBodyShape acShape;	
	
	private boolean cutAway; 
	
	
	public ACGuitarModel(GBuilder builder) {
		super();
		//this.setAttributes(builder);
		this.acShape = ACGuitarBodyShape.valueOf(builder.getBodyShape().toString());
	}
}
