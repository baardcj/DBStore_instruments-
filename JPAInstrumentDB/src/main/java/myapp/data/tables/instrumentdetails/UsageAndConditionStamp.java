package myapp.data.tables.instrumentdetails;



import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Entity
public class UsageAndConditionStamp {

	@Id
	private String name; 
}
