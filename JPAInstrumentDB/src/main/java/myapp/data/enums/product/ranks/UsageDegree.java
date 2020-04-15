package myapp.data.enums.product.ranks;

// This designates if product is new or used, and if it is used how used it is. 

public enum UsageDegree {
	NEW, 				// not owned privately
	DEMO_OBJECT,  		// not owned privately , but somewhat used
	USED_PRISTINE, 		// hardly touched
	USED_MINT, 			// almost as new 
	MINOR_USE, 			
	AVERAGE_USE,		
	HEAVILY_USE
}

