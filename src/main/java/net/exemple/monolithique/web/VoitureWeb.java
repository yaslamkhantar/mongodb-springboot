package net.exemple.monolithique.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.exemple.monolithique.entities.Voiture;
import net.exemple.monolithique.repository.VoitureRepository;

@RestController
public class VoitureWeb {
	
	
	private VoitureRepository voiturerepository;
	
	public VoitureWeb(VoitureRepository voiturerepository) {
		this.voiturerepository=voiturerepository;
	}
	
	@GetMapping("/Allcars")
	public List<Voiture>  getall(){
		return voiturerepository.findAll();
	}

}
