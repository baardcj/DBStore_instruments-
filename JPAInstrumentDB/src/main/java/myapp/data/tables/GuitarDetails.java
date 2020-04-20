package myapp.data.tables;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="INSTRUMENT_TYPE_DETAILS")
@Table(name="GUITAR_DETAILS")
public abstract class GuitarDetails {
	
	@Id
	private Long id; 
	
	private boolean leftHand; 
	
	private String nrOfString; 
	
	private String scale; 
	
	private boolean modified; 
	
}
