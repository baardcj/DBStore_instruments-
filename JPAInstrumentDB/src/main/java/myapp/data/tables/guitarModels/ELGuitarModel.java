package myapp.data.tables.guitarModels;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import myapp.builders.GBuilder;
import myapp.data.enums.product.guitar.shapes.ELGuitarBodyShape;
import myapp.data.tables.GuitarModel;


@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Entity(name="ELGuitar")
public class ELGuitarModel extends GuitarModel{
	

	@Enumerated(EnumType.STRING)
	private ELGuitarBodyShape elShape;	
	
	private int nrOfString; 
	
	private boolean leftHand = false; 
	
	@ManyToOne
	private ElGuitarSpecs specs; 
	
	
	
	
	public ELGuitarModel(GBuilder builder) {
		super();
		
		this.elShape = ELGuitarBodyShape.valueOf(builder.getBodyShape().toString());
	}
}

