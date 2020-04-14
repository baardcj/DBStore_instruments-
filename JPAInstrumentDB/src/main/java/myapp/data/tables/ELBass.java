package myapp.data.tables;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import myapp.builders.GBuilder;
import myapp.data.GuitarAttributes;
import myapp.data.enums.guitar.shapes.ELGuitarBodyShape;


@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Entity(name="ELBass")
public class ELBass extends GuitarAttributes{
	

	@Enumerated(EnumType.STRING)
	private ELGuitarBodyShape elShape;	
	
	// need to be fixed
	public ELBass(GBuilder builder) {
		super();
		this.setAttributes(builder);
		this.elShape = ELGuitarBodyShape.valueOf(builder.getBodyShape().toString());
	}
}