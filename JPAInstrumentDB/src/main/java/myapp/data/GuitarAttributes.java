package myapp.data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import myapp.data.builders.GBuilder;
import myapp.data.enums.Brand;
import myapp.data.enums.Color;
import myapp.data.enums.GBodyShape;
import myapp.data.enums.Nation;

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
public abstract class GuitarAttributes extends Guitar{
	
	private String name; 
	
	private int price; 
	
	private int prodAfter; 

	private int prodBefore; 
	
	@Enumerated(EnumType.STRING)
	private Brand brand; 
	
	@Enumerated(EnumType.STRING)
	private Color color; 

	@Enumerated(EnumType.STRING)
	private Nation builtIn;
	
	@Transient	
	private GBodyShape bodyShape; 
	
	/*
	 * Metadata
	 */
	private String listedAt;
	
	
	public void setAttributes(GBuilder builder) {
		this.name = builder.getName();
		this.price = builder.getPrice();
		this.prodAfter = builder.getProdAfter();
		this.prodBefore = builder.getProdBefore();
		this.brand = builder.getBrand();
		this.color = builder.getColor();
		this.builtIn = builder.getBuiltIn();
		this.bodyShape = builder.getBodyShape();
		
		this.setGName(this.name);
		this.setGPrice(this.price);
		this.setGBrand(this.brand);
		this.setGColor(this.color);
		this.setGBuiltIn(this.builtIn);
	}

}
