package com.group8.biblio_muni.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Reservation extends MongoRepository<Reservation,String> {
}
