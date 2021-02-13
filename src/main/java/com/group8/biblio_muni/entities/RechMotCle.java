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
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RechMotCle {
    @Id
    private String id;
    public String recher_motCle;
    @DBRef
    private MotCle motCle;
    @DBRef
    private Livre livre;
}
