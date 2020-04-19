package myapp.data.tables.guitarModels;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import myapp.builders.GBuilder;
import myapp.data.enums.product.guitar.shapes.ACBassBodyShape;
import myapp.data.tables.GuitarModel;


@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Entity(name="ACBass")
public class ACBassModel extends GuitarModel{
	

	@Enumerated(EnumType.STRING)
	private ACBassBodyShape ACBShape;	
	
	
	public ACBassModel(GBuilder builder) {
		super();
		this.setAttributes(builder);
		this.ACBShape = ACBShape.valueOf(builder.getBodyShape().toString());
	}
}