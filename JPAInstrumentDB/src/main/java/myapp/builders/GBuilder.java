package myapp.builders;

import myapp.data.enums.guitar.Brand;
import myapp.data.enums.guitar.shapes.GuitarBodyShape;
import myapp.data.enums.product.attributes.Color;
import myapp.data.enums.product.production.Nation;
import myapp.data.enums.product.ranks.Quality;
import myapp.data.enums.product.ranks.Usage;
import myapp.data.tables.ACBass;
import myapp.data.tables.ACGuitar;
import myapp.data.tables.CLGuitar;
import myapp.data.tables.ELBass;
import myapp.data.tables.ELGuitar;
import myapp.metadata.enums.RETAILER;
import lombok.Data;

import org.springframework.stereotype.Component;

@Data
@Component
public class GBuilder {
		
	private String name; 
	private int price;
	private int prodAfter; 
	private int prodBefore; 

	private Brand brand;
	private Color color; 
	private Nation builtIn;
	
	// attributes for class Guitar 
	private RETAILER retailer;
	private Quality category;
	private Usage productCondition;
	private int productRank; 
	
	// attributes for GuitarAttribute class 
	
	private GuitarBodyShape bodyShape; 
	private String listedAt; // -> metadata 

	
	public static GBuilder el() {
		return new GBuilder(); 
	}
	
	public GBuilder name(String name) {
		this.name = name; 
		return this; 
	}
	
	public GBuilder price(int price) {
		this.price = price; 
		return this; 
	}
	
	public GBuilder prodAfter(int prodAfter) {
		this.prodAfter = prodAfter; 
		return this; 
	}
	
	public GBuilder prodBefore(int prodBefore) {
		this.prodBefore = prodBefore; 
		return this; 
	}
	
	public GBuilder brand(Brand brand) {
		this.brand = brand; 
		return this; 
	}
	
	public GBuilder color(Color color) {
		this.color = color; 
		return this; 
	}
	
	public GBuilder builtIn(Nation nation) {
		this.builtIn = nation; 
		return this; 
	}
	
	public GBuilder retailer(RETAILER retailer) {
		this.retailer = retailer; 
		return this; 
	}

	public GBuilder category(Quality category) {
		this.category = category; 
		return this; 
	}

	public GBuilder condition(Usage productCondition) {
		this.productCondition = productCondition; 
		return this; 
	}
	
	public GBuilder rank(int productRank) {
		this.productRank = productRank; 
		return this; 
	}

	public GBuilder shape(GuitarBodyShape bodyShape) {
		this.bodyShape = bodyShape; 
		return this; 
	}
	
	public GBuilder listedAt(String listedAt) {
		this.listedAt = listedAt; 
		return this; 
	}


	public ELGuitar buildELGuitar() {
		return new ELGuitar(this);
	}
	
	public ACGuitar buildACGuitar() {
		return new ACGuitar(this); 
	}
	
	public CLGuitar buildCLGuitar() {
		return new CLGuitar(this);
	}
	
	public ELBass buildELBass() {
		return new ELBass(this); 
	}
	
	public ACBass buildACBass() {
		return new ACBass(this);
	}

}
