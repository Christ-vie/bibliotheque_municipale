package com.group8.biblio_muni.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Reservation {
    @Id
    private String id;
    private String numero;
    @DBRef
    private Livre livre;
    @DBRef
    private  Abonne abonne;

}
