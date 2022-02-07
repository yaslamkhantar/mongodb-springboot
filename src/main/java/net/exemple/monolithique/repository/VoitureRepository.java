package net.exemple.monolithique.repository;


import org.springframework.data.mongodb.repository.MongoRepository;


import net.exemple.monolithique.entities.Voiture;


public interface VoitureRepository extends MongoRepository<Voiture,String> {

}
