package com.group8.biblio_muni.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

@Document
@Data
@NoArgsConstructor @AllArgsConstructor
@ToString
public class Abonne {
    @Id
    private String id;
    private String nom;
    private String adresse;
    private Integer telephone;
    private Date dateNaissance;
    private Date dateAdhesion;
    private String num_matricule;
    private String categorieProfessionnelle;
    @DBRef
    private Collection<Pret> prets=new ArrayList<>();
    @DBRef
    private Collection<Reservation> reservations=new ArrayList<>();


}
