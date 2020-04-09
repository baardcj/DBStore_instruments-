package myapp.data;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import myapp.data.enums.Brand;
import myapp.data.enums.Color;
import myapp.data.enums.ELShape;
import myapp.data.enums.Nation;

@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true)
@Data
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="GUITAR_TYPE")
@Table(name="GUITARS")
public abstract class Guitar {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	
	private String gName;	
	private int gPrice;
	
	@Transient
	private int gProdAfter; 
	@Transient
	private int gProdBefore; 
	
	@Enumerated(EnumType.STRING)
	private Color gColor; 
	@Enumerated(EnumType.STRING)
	private Nation gBuiltIn;
	
	private String gListedAt;
		
}
