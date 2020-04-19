package myapp.data.tables;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import myapp.data.enums.product.apperance.Color;
import myapp.data.enums.product.guitar.GuitarBrand;
import myapp.data.enums.product.guitar.GuitarSeries;
import myapp.data.enums.product.guitar.shapes.GuitarBodyShape;
import myapp.data.tables.timeplace.NationAndYearStamp;


@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true)
@Data
@EqualsAndHashCode(callSuper=false)
@MappedSuperclass
public abstract class Guitar extends StringedInstrument{
	
	@Column(nullable = false)
	private String name; 
	
	private boolean discontinued = true;  
	
	private int launchedYear; 
	private int discontinuedYear; 
	
	private Guitar replacedBy;  
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private GuitarBrand brand; 
	
	@Enumerated(EnumType.STRING)
	private GuitarSeries guitarSeries; 
	
	@Enumerated(EnumType.STRING)
	private Nation builtInt; 
	
	
	@Transient	
	private GuitarBodyShape bodyShape; 
	
	@Transient
	@Enumerated(EnumType.STRING)
	private Color color; 
	
	@Transient
	private boolean leftHand = false; 
	
	
	/*
	@ManyToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name = "NationAndYearStamp_id")
	//private UsageAndConditionStamp condStamp; 
	
	
	@ManyToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name = "NationAndYearStamp_id")
	private NationAndYearStamp prodDetails;
	
	*/ 

}






/*

public void setAttributes(GBuilder builder) {
	this.name = builder.getName();
	this.brand = builder.getBrand();
	this.color = builder.getColor();
	this.bodyShape = builder.getBodyShape();
	this.prodDetails = builder.getProdNationAndYear();
	this.setGName(this.name);
}*/ 

