package myapp.data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Transient;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import myapp.data.builders.EGBuilder;
import myapp.data.enums.Brand;
import myapp.data.enums.Color;
import myapp.data.enums.ELShape;
import myapp.data.enums.Nation;

@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true)
@Entity(name="ELGuitar")
public class ELGuitar extends Guitar{
	
	@Transient
	private String elName; 
	
	@SuppressWarnings("unused")
	private int elPrice;
	
	@SuppressWarnings("unused")
	private int elProdAfter; 
	
	@SuppressWarnings("unused")
	private int elProdBefore; 
	
	@Enumerated(EnumType.STRING)
	private Color elColor; 
	
	@Enumerated(EnumType.STRING)
	private Nation elBuiltIn;
	
	// particular for subclass 
	@Enumerated(EnumType.STRING)
	private ELShape elShape;
	
	// particular for subclass 
	@Enumerated(EnumType.STRING)
	private Brand elBrand;
	
	public ELGuitar(EGBuilder builder) {
		super();
		this.setGName(builder.getName());
		this.elName = builder.getName();
		this.setGPrice(builder.getPrice());
		this.elPrice = builder.getPrice(); 
		this.setGProdAfter(builder.getProdAfter());
		this.elProdAfter = builder.getProdAfter();
		this.setGProdBefore(builder.getProdBefore());
		this.elProdBefore = builder.getProdBefore();
		this.setGColor(builder.getColor());
		this.elColor = builder.getColor();
		this.setGBuiltIn(builder.getBuiltIn());
		this.elBuiltIn = builder.getBuiltIn();
		this.setGListedAt(builder.getListedAt());
		
		this.elShape = builder.getShape();
		this.elBrand = builder.getBrand();
	}
}
