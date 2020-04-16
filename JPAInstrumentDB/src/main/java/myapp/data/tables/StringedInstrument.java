package myapp.data.tables;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import myapp.data.enums.product.guitar.brand.GuitarBrand;
//import myapp.data.enums.product.condition.Usage;
import myapp.data.enums.product.production.Nation;
import myapp.data.enums.product.quality.QualityRank;
import myapp.metadata.enums.RETAILER;


/*
 * The attributes in this class is NOT present in the tables of its subclasses.
 * Some attributes overlap with attributes in the subclasses of this class.
 * 
 * This class defines some generic attributes of guitars. 
 * 
 * Non advanced queries are the intended use cases for this table.
 * Its tables represent a subset of the data in the tables of all its subclasses.  
 */


@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true)
@Data
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="GUITAR_TYPE")
@Table(name="GUITARS")
public abstract class StringedInstrument {
	
	/*
	 *  This class should model more product-info
	 *  that is not particular for guitars 
	 */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	
	private String gName;	
	private int gPrice;
	
	/*
	 * General info about products
	 */
	
	@Enumerated(EnumType.STRING)
	private GuitarBrand gBrand; 
	
	@Enumerated(EnumType.STRING)
	private RETAILER retailer; 
	
	@Enumerated(EnumType.STRING)
	private QualityRank gQualityClass;
	
	private int productRank; 
	
}


