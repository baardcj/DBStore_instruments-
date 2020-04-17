package myapp.data.tables;

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

import myapp.data.enums.product.production.Nation;
import myapp.data.tables.GuitarProducer; 


@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true)
@Data
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"GUITAR_PRODUCER", "nation"}))
public class ProductionLocation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id; 
	
	@Enumerated(EnumType.STRING)
	private Nation nation; 

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="GUITAR_PRODUCER")
	private GuitarProducer gitarProducer; 
	
}
