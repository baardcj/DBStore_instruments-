package myapp.data.tables.timeplace;

import java.time.Year;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import myapp.data.enums.product.productioninfo.Nation;


@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true)
@Data
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {
			"builtInNation", 
			"producedInOrAfterYear", 
			"producedInOrBeforeYear"}))

public class NationAndYearStamp {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	
	@Enumerated(EnumType.STRING)
	private Nation builtInNation; 

	private int producedInOrAfterYear; 
	
	private int producedInOrBeforeYear; 
	
	public NationAndYearStamp(Nation nat, int aft, int bef) {
		this.builtInNation = nat; 
		this.producedInOrAfterYear = aft;
		this.producedInOrBeforeYear = bef;
	}
	
}
