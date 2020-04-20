package myapp.data.tables.guitarModels;

import javax.persistence.Entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import myapp.data.tables.GuitarDetails;


@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true) 
@Data
@Entity
public class ElGuitarDetails extends GuitarDetails {


	/*
	 * SOME OF THESE FIELDS SHOULD BE PUT IN GUITAR MODEL
	 * 
	 */
	private String bodyWood; 
	
	private String bodyTopWood; 
	
	private String neckWood; 
	
	private String fretBoardWood; 
	
	private String neckStyle; 
	
	private String bridgeType; 
	
	
	private String tunerType; 
	
	private String picupConfiguration; 
	
	private String electrnoicSetup; 
	
	
}
