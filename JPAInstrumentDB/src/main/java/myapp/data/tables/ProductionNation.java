package myapp.data.tables;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.mapping.List;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import myapp.data.enums.product.production.Nation;

@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true)
@Data
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"nation", "gitprod"}))
public class ProductionNation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	private List<GuitarProducer> gitprod = new ArrayList<GuitarProducer>(); 
	
	@Column(name= "productionCountry")
	@Enumerated(EnumType.STRING)
	private Nation nation; 
}
