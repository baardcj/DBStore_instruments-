package myapp.data.tables.producer;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import myapp.data.enums.product.ProducerType;


@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true)
@Data
@Entity
public class InstrumentProducer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="INSTRUMENT_PROD_ID")
	private Long id; 
	
	@Column(unique = true)
	private String name; 
	
	@Enumerated(EnumType.STRING)
	private ProducerType prodType; 
	
	private int established; 
	
	private int terminated; 
	
	private boolean operative = true; 
	
	@OneToMany(mappedBy="instrumentProducer")
	private List<ProductionLocation> productionLocation;
	
}
