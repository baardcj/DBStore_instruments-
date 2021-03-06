package myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import myapp.data.enums.product.Color;
import myapp.data.enums.product.Nation;
import myapp.data.enums.product.QualityRank;
import myapp.data.enums.product.RetailerType;
import myapp.data.enums.product.guitar.GuitarBrand;
import myapp.data.enums.product.guitar.shapes.GuitarBodyShape;
import myapp.data.repo.GuitarRepository;
import myapp.data.tables.StringedInstrument;
import myapp.data.tables.guitarModels.ELGuitar;


@SpringBootApplication
public class DBInstrumentApp {
	
	public static void main(String[] args) {
		SpringApplication.run(DBInstrumentApp.class, args);
	}
	
	@Bean
	public CommandLineRunner test(GuitarRepository<StringedInstrument> grepo) {
	    return (args) -> {
	    	
	    	ELGuitar g1 = GuitarBuilder.el()
					.name("Fender std")
					.price(6500)
					.nationAndProdYear(Nation.USA, 1989, 1991)
					.color(Color.THREE_TONE_SB)
					.listedAt("FINN")
					.shape(GuitarBodyShape.STRAT)
					.brand(GuitarBrand.FENDER)
					.retailer(RetailerType.PRIVATE)
					.category(QualityRank.HIGH_RATED)
					.buildELGuitar();  
	    	
	    	
	    	ELGuitar g2 = GuitarBuilder.el()
					.name("Gibson SG 76")
					.price(11500)
					.color(Color.BROWN)
					.listedAt("FINN")
					.shape(GuitarBodyShape.LES_PAUL)
					.brand(GuitarBrand.GIBSON)
					.buildELGuitar(); 
	    	
	    	ELGuitar g3 = GuitarBuilder.el()
					.name("Fender HighWay")
					.price(5000)
					.color(Color.BLACK)
					.listedAt("FINN")
					.shape(GuitarBodyShape.STRAT)
					.brand(GuitarBrand.FENDER)
					.buildELGuitar(); 
	
	    	/*
	    	ACGuitar g4 = GBuilder.el()
					.name("Martin D16")
					.price(8000)
					.color(Color.NATURAL)
					.listedAt("FINN")
					.shape(GuitarBodyShape.DREADNOTE)
					.brand(GuitarBrand.MARTIN)
					.buildACGuitar(); */
	
	    
	    	grepo.save(g1);
	    	grepo.save(g2);
	    	grepo.save(g3);
	 
	    };
	}
	
	
}
