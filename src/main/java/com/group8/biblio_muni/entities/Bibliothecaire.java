package com.group8.biblio_muni.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;

@Document
@Data
@NoArgsConstructor @AllArgsConstructor
@ToString
public class Bibliothecaire {
    private String id;
    private String matricule;
    private String nom;
    @DBRef
    private Collection<Pret> prets = new ArrayList<>();
}
