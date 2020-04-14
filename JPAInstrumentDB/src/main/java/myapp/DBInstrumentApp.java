package myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import myapp.builders.GBuilder;
import myapp.data.Guitar;
import myapp.data.enums.guitar.Brand;
import myapp.data.enums.guitar.shapes.GuitarBodyShape;
import myapp.data.enums.product.attributes.Color;
import myapp.data.enums.product.production.Nation;
import myapp.data.enums.product.ranks.Quality;
import myapp.data.repo.GuitarRepository;
import myapp.data.tables.ACGuitar;
import myapp.data.tables.ELGuitar;
import myapp.metadata.enums.RETAILER;


@SpringBootApplication
public class DBInstrumentApp {
	
	public static void main(String[] args) {
		SpringApplication.run(DBInstrumentApp.class, args);
	}
	
	@Bean
	public CommandLineRunner test(GuitarRepository<Guitar> grepo) {
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
	    	
	    	ELGuitar g1 = GBuilder.el()
					.name("Fender std")
					.price(6500)
					.prodAfter(1989)
					.prodBefore(1991)
					.color(Color.THREE_TONE_SB)
					.builtIn(Nation.USA)
					.listedAt("FINN")
					.shape(GuitarBodyShape.STRAT)
					.brand(Brand.FENDER)
					.retailer(RETAILER.PRIVATE)
					.category(Quality.HIGH_RATED)
					.buildELGuitar();  
	    	
	    	ELGuitar g2 = GBuilder.el()
					.name("Gibson SG 76")
					.price(11500)
					.prodAfter(1998)
					.prodBefore(1998)
					.color(Color.BROWN)
					.builtIn(Nation.USA)
					.listedAt("FINN")
					.shape(GuitarBodyShape.LES_PAUL)
					.brand(Brand.GIBSON)
					.buildELGuitar(); 
	    	
	    	ELGuitar g3 = GBuilder.el()
					.name("Fender HighWay")
					.price(5000)
					.prodAfter(2003)
					.prodBefore(2007)
					.color(Color.BLACK)
					.builtIn(Nation.USA)
					.listedAt("FINN")
					.shape(GuitarBodyShape.STRAT)
					.brand(Brand.FENDER)
					.buildELGuitar(); 
	
	    	ACGuitar g4 = GBuilder.el()
					.name("Martin D16")
					.price(8000)
					.prodAfter(2005)
					.prodBefore(2005)
					.color(Color.NATURAL)
					.builtIn(Nation.USA)
					.listedAt("FINN")
					.shape(GuitarBodyShape.DREADNOTE)
					.brand(Brand.MARTIN)
					.buildACGuitar(); 
	
	    
	    	grepo.save(g1);
	    	grepo.save(g2);
	    	grepo.save(g3);
	    	grepo.save(g4);
	 
	    };
	}
	
	
}
