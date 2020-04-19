package myapp.data.tables;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import myapp.data.tables.GuitarModel;
import myapp.data.enums.product.Color;
import myapp.data.enums.product.QualityRank;
import myapp.data.enums.product.guitar.shapes.GuitarBodyShape;
import myapp.data.tables.instrumentdetails.NationAndYearStamp;
import myapp.data.tables.instrumentdetails.UsageAndConditionStamp;


@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true)
@Data
@EqualsAndHashCode(callSuper=false)
@MappedSuperclass
public abstract class Guitar extends StringedInstrument{
	
	
	//@Column(nullable = false)
	private String name; 	
	
	
	@ManyToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name = "GitarModel_id")
	private GuitarModel gitModel; 
	
	
	@Enumerated(EnumType.STRING)
	private Color color; 
	
	
	@ManyToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name = "NationAndYearStamp_id")
	private NationAndYearStamp prodDetails;

	
	@ManyToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name = "ConditionStamp_id")
	private UsageAndConditionStamp condStamp; 
	
	
	@Enumerated(EnumType.STRING)
	private QualityRank qualityRank; 
	
	
	@Transient
	private GuitarDetails details; 
	
	
	@Transient
	private GuitarBodyShape bodyShape; 
	

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

