package myapp.data.builders;

import myapp.data.enums.Brand;
import myapp.data.enums.Color;
import myapp.data.enums.GBodyShape;
import myapp.data.enums.Nation;
import myapp.data.gitartypes.ACBass;
import myapp.data.gitartypes.ACGuitar;
import myapp.data.gitartypes.CLGuitar;
import myapp.data.gitartypes.ELBass;
import myapp.data.gitartypes.ELGuitar;
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
	private GBodyShape bodyShape; 

	// metadata: 
	private String listedAt; 

	
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
	
	public GBuilder color(Color color) {
		this.color = color; 
		return this; 
	}
	
	public GBuilder builtIn(Nation nation) {
		this.builtIn = nation; 
		return this; 
	}
	
	public GBuilder listedAt(String listedAt) {
		this.listedAt = listedAt; 
		return this; 
	}
	
	public GBuilder shape(GBodyShape bodyShape) {
		this.bodyShape = bodyShape; 
		return this; 
	}
	
	public GBuilder brand(Brand brand) {
		this.brand = brand; 
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
