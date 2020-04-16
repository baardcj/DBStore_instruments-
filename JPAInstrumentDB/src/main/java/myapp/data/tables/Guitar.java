package myapp.data.tables;

import javax.persistence.CascadeType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import myapp.builders.GBuilder;
import myapp.data.enums.product.apperance.Color;
import myapp.data.enums.product.guitar.brand.GuitarBrand;
import myapp.data.enums.product.guitar.shapes.GuitarBodyShape;
import myapp.data.enums.product.production.Nation;
import myapp.data.tables.timeplace.NationaAndYearStamp;

/*
 * The attributes in this class is ONLY present in the tables of it's subclasses.
 * Some attributes in this class overlap with attributes in it's superclass.
 * 
 * This class defines general attributes of guitars.
 * 
 * This class does not generate a table, i.e. no queries are made against this class
 */

@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true)
@Data
@EqualsAndHashCode(callSuper=false)
@MappedSuperclass
public abstract class Guitar extends StringedInstrument{
	
	private String name; 
	
	private int price; 
	
	@Enumerated(EnumType.STRING)
	private GuitarBrand brand; 
	
	@Enumerated(EnumType.STRING)
	private Color color; 

	
	@OneToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name = "productionDetails_id")
	private NationaAndYearStamp prodDetails;
	
	@Transient	
	private GuitarBodyShape bodyShape; 
	
	/*
	 * Metadata
	 */
	private String listedAt;
	
	
	public void setAttributes(GBuilder builder) {
		this.name = builder.getName();
		this.price = builder.getPrice();
		this.brand = builder.getBrand();
		this.color = builder.getColor();
		this.bodyShape = builder.getBodyShape();
		this.prodDetails = builder.getProdNationAndYear();
		
		this.setGName(this.name);
		this.setGPrice(this.price);
		this.setGBrand(this.brand);
	}

}
