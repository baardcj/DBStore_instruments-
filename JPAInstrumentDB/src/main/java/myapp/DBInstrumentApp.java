package myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import myapp.builders.GBuilder;
import myapp.data.enums.product.apperance.Color;
import myapp.data.enums.product.guitar.brand.GuitarBrand;
import myapp.data.enums.product.guitar.shapes.GuitarBodyShape;
import myapp.data.enums.product.production.Nation;
import myapp.data.enums.product.quality.QualityRank;
import myapp.data.repo.GuitarRepository;
import myapp.data.tables.StringedInstrument;
import myapp.data.tables.guitartype.ACGuitar;
import myapp.data.tables.guitartype.ELGuitar;
import myapp.metadata.enums.RETAILER;


@SpringBootApplication
public class DBInstrumentApp {
	
	public static void main(String[] args) {
		SpringApplication.run(DBInstrumentApp.class, args);
	}
	
	@Bean
	public CommandLineRunner test(GuitarRepository<StringedInstrument> grepo) {
	    return (args) -> {
	    	
	    	/*
	    	 * private String name; 
	 		 * private int price;
			 * private int prodAfter; 
			 * private int prodBefore; 
 			 *
			 * private Color color; 
			 * private Nation builtIn;
			 *
			 * //particular for G
			 * private String listedAt; 
			 *
			 * //particular for EL
	 		 * private ELShape shape;
			 * private Brand brand;
			 *  
	    	 */
	    	
	    	/*
	    	ELGuitar g1 = GBuilder.el()
					.name("Fender std")
					.price(6500)
					.nationAndProdYear(Nation.USA, 1989, 1991)
					.color(Color.THREE_TONE_SB)
					.listedAt("FINN")
					.shape(GuitarBodyShape.STRAT)
					.brand(GuitarBrand.FENDER)
					.retailer(RETAILER.PRIVATE)
					.category(QualityRank.HIGH_RATED)
					.buildELGuitar();  
	    	
	    	*/
	    	
	    	ELGuitar g2 = GBuilder.el()
					.name("Gibson SG 76")
					.price(11500)
					.color(Color.BROWN)
					.listedAt("FINN")
					.shape(GuitarBodyShape.LES_PAUL)
					.brand(GuitarBrand.GIBSON)
					.buildELGuitar(); 
	    	
	    	ELGuitar g3 = GBuilder.el()
					.name("Fender HighWay")
					.price(5000)
					.color(Color.BLACK)
					.listedAt("FINN")
					.shape(GuitarBodyShape.STRAT)
					.brand(GuitarBrand.FENDER)
					.buildELGuitar(); 
	
	    	ACGuitar g4 = GBuilder.el()
					.name("Martin D16")
					.price(8000)
					.color(Color.NATURAL)
					.listedAt("FINN")
					.shape(GuitarBodyShape.DREADNOTE)
					.brand(GuitarBrand.MARTIN)
					.buildACGuitar(); 
	
	    
	    	//grepo.save(g1);
	    	grepo.save(g2);
	    	grepo.save(g3);
	    	grepo.save(g4);
	 
	    };
	}
	
	
}
