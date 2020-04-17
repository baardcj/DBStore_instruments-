package myapp.builders;

import myapp.data.enums.product.apperance.Color;
import myapp.data.enums.product.guitar.brand.GuitarBrand;
import myapp.data.enums.product.guitar.shapes.GuitarBodyShape;
//import myapp.data.enums.product.condition.Usage;
import myapp.data.enums.product.production.Nation;
import myapp.data.enums.product.quality.QualityRank;
import myapp.data.tables.guitartype.ACBass;
import myapp.data.tables.guitartype.ACGuitar;
import myapp.data.tables.guitartype.CLGuitar;
import myapp.data.tables.guitartype.ELBass;
import myapp.data.tables.guitartype.ELGuitar;
import myapp.data.tables.timeplace.NationAndYearStamp;
import myapp.metadata.enums.RETAILER;
import lombok.Data;

import java.time.Year;

import org.springframework.stereotype.Component;

@Data
@Component
public class GBuilder {
		
	private String name; 
	private int price;
	private GuitarBrand brand;
	private Color color; 
	
	
	private RETAILER retailer;
	private QualityRank category;
	private int productRank; 
	
	
	private GuitarBodyShape bodyShape; 
	private String listedAt; 
	
	private NationAndYearStamp prodNationAndYear;
	private Nation builtIn;
	private int prodAfter; 
	private int prodBefore; 

	
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

	
	public GBuilder brand(GuitarBrand brand) {
		this.brand = brand; 
		return this; 
	}
	
	public GBuilder color(Color color) {
		this.color = color; 
		return this; 
	}
	
	
	public GBuilder retailer(RETAILER retailer) {
		this.retailer = retailer; 
		return this; 
	}

	public GBuilder category(QualityRank category) {
		this.category = category; 
		return this; 
	}
	
	/*

	public GBuilder condition(Usage productCondition) {
		this.productCondition = productCondition; 
		return this; 
	}*/
	
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
	
	public GBuilder nationAndProdYear(Nation nat, int aft, int bef) {
		this.prodNationAndYear = new NationAndYearStamp(nat,  aft, bef);
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
