package net.exemple.monolithique.entities;




import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter 
@ToString
@Document(collection = "Voiture")
public class Voiture {

	
	private String matricule;
	
	private String marque;
	
	private String countryofmade;
	
	private double prix;
}
