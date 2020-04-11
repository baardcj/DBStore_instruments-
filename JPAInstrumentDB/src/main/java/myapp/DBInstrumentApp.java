package myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import myapp.data.Guitar;
import myapp.data.builders.GBuilder;
import myapp.data.enums.Brand;
import myapp.data.enums.Color;
import myapp.data.enums.Nation;
import myapp.data.gitartypes.ELGuitar;
import myapp.data.gitartypes.ACGuitar;
import myapp.data.enums.GBodyShape;
import myapp.data.repo.GuitarRepository;


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
					.shape(GBodyShape.STRAT)
					.brand(Brand.FENDER)
					.buildELGuitar();  
	    	
	    	ELGuitar g2 = GBuilder.el()
					.name("Gibson SG 76")
					.price(11500)
					.prodAfter(1998)
					.prodBefore(1998)
					.color(Color.BROWN)
					.builtIn(Nation.USA)
					.listedAt("FINN")
					.shape(GBodyShape.LES_PAUL)
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
					.shape(GBodyShape.STRAT)
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
					.shape(GBodyShape.DREADNOTE)
					.brand(Brand.MARTIN)
					.buildACGuitar(); 
	
	    
	    	grepo.save(g1);
	    	grepo.save(g2);
	    	grepo.save(g3);
	    	grepo.save(g4);
	 
	    };
	}
	
	
}
