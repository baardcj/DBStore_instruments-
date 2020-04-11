package myapp.data.gitartypes;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import myapp.data.GuitarAttributes;
import myapp.data.builders.GBuilder;
import myapp.data.enums.el.ELGuitarBodyShape;


@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Entity(name="ELGuitar")
public class ELGuitar extends GuitarAttributes{
	

	@Enumerated(EnumType.STRING)
	private ELGuitarBodyShape elShape;	
	
	
	public ELGuitar(GBuilder builder) {
		super();
		this.setAttributes(builder);
		this.elShape = ELGuitarBodyShape.valueOf(builder.getBodyShape().toString());
	}
}

