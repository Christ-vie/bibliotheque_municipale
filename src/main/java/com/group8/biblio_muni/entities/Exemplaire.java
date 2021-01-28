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
import java.util.Date;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Exemplaire {
    @Id
    private String numero;
    private String cote;
    private String code_d_usure;
    private Date date_d_acquisition;
    @DBRef
    private Rayon rayon;
    @DBRef
    private Livre livre;
    @DBRef
    private Editeur editeur;
    @DBRef
    private Collection<Pret> prets=new ArrayList<>();


}

