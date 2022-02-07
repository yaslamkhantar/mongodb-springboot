package net.exemple.monolithique.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Document(collection = "voiture")
public class Voiture {

	@Id
	private String matricule;
	
	private String marque;
	
	private String countryofmade;
	
	private double prix;
}
