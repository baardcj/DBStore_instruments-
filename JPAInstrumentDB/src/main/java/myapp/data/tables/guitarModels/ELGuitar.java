package myapp.data.tables.guitarModels;

import javax.persistence.CascadeType;
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
import myapp.data.tables.GuitarModel;


@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Entity(name="ELGuitar")
public class ELGuitar extends Guitar{
	
	
	@ManyToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name = "GitarModel_id")
	private ElGuitarModel gitModel; 
	
	
	@ManyToOne
	@JoinColumn(name = "ElGuitarDetails_id")
	private ElGuitarDetails specs; 
	

	@Enumerated(EnumType.STRING)
	private ELGuitarBodyShape elShape;	
	
	
	
	public ELGuitar(GuitarBuilder builder) {
		super();
		this.elShape = ELGuitarBodyShape.valueOf(builder.getBodyShape().toString());
	}
}

