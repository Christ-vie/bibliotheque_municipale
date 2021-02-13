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
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MotCle {
    @Id
    private String id;
    private String par_mot;
    @DBRef
    private Collection<RechMotCle> rechMotCles=new ArrayList<>();
}
