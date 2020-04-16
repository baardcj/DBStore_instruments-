package myapp.data.tables.guitartype;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import myapp.builders.GBuilder;
import myapp.data.enums.product.guitar.shapes.ELGuitarBodyShape;
import myapp.data.tables.Guitar;


@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Entity(name="ELGuitar")
public class ELGuitar extends Guitar{
	

	@Enumerated(EnumType.STRING)
	private ELGuitarBodyShape elShape;	
	
	
	public ELGuitar(GBuilder builder) {
		super();
		this.setAttributes(builder);
		this.elShape = ELGuitarBodyShape.valueOf(builder.getBodyShape().toString());
	}
}

