package myapp.data.tables.producer;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import myapp.data.enums.product.productioninfo.Nation; 


@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true)
@Data
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"INSTRUMENT_PRODUCER", "nation"}))
public class ProductionLocation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id; 
	
	@Enumerated(EnumType.STRING)
	private Nation nation; 

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="INSTRUMENT_PRODUCER")
	private InstrumentProducer instrumentProducer; 
	
}
