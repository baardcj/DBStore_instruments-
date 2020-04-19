package myapp;

import myapp.data.enums.product.Color;
import myapp.data.enums.product.Nation;
import myapp.data.enums.product.QualityRank;
import myapp.data.enums.product.RetailerType;
import myapp.data.enums.product.guitar.GuitarBrand;
import myapp.data.enums.product.guitar.shapes.GuitarBodyShape;
import myapp.data.tables.guitarModels.ACBass;
import myapp.data.tables.guitarModels.ACGuitar;
import myapp.data.tables.guitarModels.CLGuitar;
import myapp.data.tables.guitarModels.ELBass;
import myapp.data.tables.guitarModels.ELGuitar;
import myapp.data.tables.instrumentdetails.NationAndYearStamp;
import lombok.Data;

import java.time.Year;

import org.springframework.stereotype.Component;

@Data
@Component
public class GuitarBuilder {
		
	private String name; 
	private int price;
	private GuitarBrand brand;
	private Color color; 
	
	
	private RetailerType retailer;
	private QualityRank category;
	private int productRank; 
	
	
	private GuitarBodyShape bodyShape; 
	private String listedAt; 
	
	private NationAndYearStamp prodNationAndYear;
	private Nation builtIn;
	private int prodAfter; 
	private int prodBefore; 

	
	public static GuitarBuilder el() {
		return new GuitarBuilder(); 
	}
	
	public GuitarBuilder name(String name) {
		this.name = name; 
		return this; 
	}
	
	public GuitarBuilder price(int price) {
		this.price = price; 
		return this; 
	}

	
	public GuitarBuilder brand(GuitarBrand brand) {
		this.brand = brand; 
		return this; 
	}
	
	public GuitarBuilder color(Color color) {
		this.color = color; 
		return this; 
	}
	
	
	public GuitarBuilder retailer(RetailerType retailer) {
		this.retailer = retailer; 
		return this; 
	}

	public GuitarBuilder category(QualityRank category) {
		this.category = category; 
		return this; 
	}
	
	/*

	public GBuilder condition(Usage productCondition) {
		this.productCondition = productCondition; 
		return this; 
	}*/
	
	public GuitarBuilder rank(int productRank) {
		this.productRank = productRank; 
		return this; 
	}

	public GuitarBuilder shape(GuitarBodyShape bodyShape) {
		this.bodyShape = bodyShape; 
		return this; 
	}
	
	public GuitarBuilder listedAt(String listedAt) {
		this.listedAt = listedAt; 
		return this; 
	}
	
	public GuitarBuilder nationAndProdYear(Nation nat, int aft, int bef) {
		this.prodNationAndYear = new NationAndYearStamp(nat,  aft, bef);
		return this; 
	}

	
	public ELGuitar buildELGuitar() {
		return new ELGuitar(this);
	}
	/*
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
	*/

}
