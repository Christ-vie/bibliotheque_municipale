package com.group8.biblio_muni.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Date;

@Document
@Data
@NoArgsConstructor @AllArgsConstructor
@ToString
public class Pret {
    @Id
    private Date date_de_pret;
    private Date date_de_retour;
    @DBRef
    private Abonne abonne;
    @DBRef
    private Exemplaire exemplaire;
    @DBRef
    private Bibliothecaire bibliothecaire;
}
