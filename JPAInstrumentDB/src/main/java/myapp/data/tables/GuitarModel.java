package myapp.data.tables;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import myapp.data.enums.product.guitar.GuitarBrand;
import myapp.data.enums.product.guitar.GuitarSeries;
import myapp.data.enums.product.guitar.shapes.GuitarBodyShape;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@MappedSuperclass
public abstract class GuitarModel {
	
	@Id
	private String id; 
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private GuitarBrand brand; 
	
	@Enumerated(EnumType.STRING)
	private GuitarSeries guitarSeries; 
	
	@Enumerated(EnumType.STRING)
	private GuitarBodyShape bodyShape; 

}
