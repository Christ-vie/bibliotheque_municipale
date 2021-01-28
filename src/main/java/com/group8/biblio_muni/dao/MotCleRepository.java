package com.group8.biblio_muni.dao;

import com.group8.biblio_muni.entities.MotCle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MotCleRepository extends MongoRepository<MotCle,String> {
}
