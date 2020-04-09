package myapp.data.builders;

import myapp.data.enums.Brand;
import myapp.data.enums.Color;
import myapp.data.enums.ELShape;
import myapp.data.enums.Nation;
import lombok.Data;
import myapp.data.ELGuitar;

import org.springframework.stereotype.Component;

@Data
@Component
public class EGBuilder {
	
	
	private String name; 
	private int price;
	private int prodAfter; 
	private int prodBefore; 

	private Color color; 
	private Nation builtIn;
	
	//particular for G
	private String listedAt; 
	
	//particular for EL
	private ELShape shape;
	private Brand brand;

	public static EGBuilder el() {
		return new EGBuilder(); 
	}
	
	public EGBuilder name(String name) {
		this.name = name; 
		return this; 
	}
	
	public EGBuilder price(int price) {
		this.price = price; 
		return this; 
	}
	
	public EGBuilder prodAfter(int prodAfter) {
		this.prodAfter = prodAfter; 
		return this; 
	}
	
	public EGBuilder prodBefore(int prodBefore) {
		this.prodBefore = prodBefore; 
		return this; 
	}
	
	public EGBuilder color(Color color) {
		this.color = color; 
		return this; 
	}
	
	public EGBuilder builtIn(Nation nation) {
		this.builtIn = nation; 
		return this; 
	}
	
	public EGBuilder listedAt(String listedAt) {
		this.listedAt = listedAt; 
		return this; 
	}
	
	public EGBuilder shape(ELShape shape) {
		this.shape = shape; 
		return this; 
	}
	
	public EGBuilder brand(Brand brand) {
		this.brand = brand; 
		return this; 
	}
	
	public ELGuitar build() {
		return new ELGuitar(this);
	}

}
