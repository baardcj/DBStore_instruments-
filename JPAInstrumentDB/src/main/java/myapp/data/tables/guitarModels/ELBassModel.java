package myapp.data.tables.guitarModels;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import myapp.builders.GBuilder;
import myapp.data.enums.product.guitar.shapes.ELGuitarBodyShape;
import myapp.data.tables.GuitarModel;


@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Entity(name="ELBass")
public class ELBassModel extends GuitarModel{
	

	@Enumerated(EnumType.STRING)
	private ELGuitarBodyShape elShape;	
	
	// need to be fixed
	public ELBassModel(GBuilder builder) {
		super();
		this.setAttributes(builder);
		this.elShape = ELGuitarBodyShape.valueOf(builder.getBodyShape().toString());
	}
}