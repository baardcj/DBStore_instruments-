package myapp.data.tables;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import myapp.builders.GBuilder;
import myapp.data.GuitarAttributes;
import myapp.data.enums.guitar.shapes.ACBassBodyShape;


@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Entity(name="ACBass")
public class ACBass extends GuitarAttributes{
	

	@Enumerated(EnumType.STRING)
	private ACBassBodyShape ACBShape;	
	
	
	public ACBass(GBuilder builder) {
		super();
		this.setAttributes(builder);
		this.ACBShape = ACBShape.valueOf(builder.getBodyShape().toString());
	}
}