package net.exemple.monolithique.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.exemple.monolithique.entities.Voiture;


@Repository
public interface VoitureRepository extends MongoRepository<Voiture,String> {

}
