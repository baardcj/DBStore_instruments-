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
import myapp.data.enums.product.QualityRank;


@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true)
@Data
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="INSTRUMENT_TYPE")
@Table(name="MUSICAL_INSTRUMENTS")
public abstract class StringedInstrument {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	
	//@Column(nullable = false)
	private String gName;
	
	
	private int gPrice; 
	
	
	@Enumerated(EnumType.STRING)
	private QualityRank gQualityClass;
	
	
	/*
	 *  Something that specifies instrument type, i.e. modern, traditional, electronical etc. 
	 *  
	 *  @Enumerated(EnumType.STRING)
	 *  private StringInstrumentTradition instrTrad
	 *  
	 */
	
}


