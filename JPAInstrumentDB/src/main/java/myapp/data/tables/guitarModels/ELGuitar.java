package myapp.data.tables.guitarModels;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import myapp.GuitarBuilder;
import myapp.data.enums.product.guitar.shapes.ELGuitarBodyShape;
import myapp.data.tables.Guitar;


@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Entity(name="ELGuitar")
public class ELGuitar extends Guitar{
	

	@Enumerated(EnumType.STRING)
	private ELGuitarBodyShape elShape;	
	
	@ManyToOne
	@JoinColumn(name = "ElGuitarDetails_id")
	private ElGuitarDetails specs; 
	
	
	
	
	public ELGuitar(GuitarBuilder builder) {
		super();
		
		this.elShape = ELGuitarBodyShape.valueOf(builder.getBodyShape().toString());
	}
}

