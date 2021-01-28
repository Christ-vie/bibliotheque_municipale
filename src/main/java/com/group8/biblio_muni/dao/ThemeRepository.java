package com.group8.biblio_muni.dao;

import com.group8.biblio_muni.entities.Theme;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ThemeRepository extends MongoRepository <Theme,String>{
}
