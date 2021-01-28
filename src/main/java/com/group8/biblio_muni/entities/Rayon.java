package com.group8.biblio_muni.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;

@Document
@Data
@NoArgsConstructor @AllArgsConstructor
@ToString
public class Rayon {
    @Id
    private String rayonName;
    private String numero_de_rayon;
    @DBRef
    private Collection<Exemplaire> exemplaires=new ArrayList<>();
}
