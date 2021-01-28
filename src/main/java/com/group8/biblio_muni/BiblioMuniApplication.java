package com.group8.biblio_muni;

import com.group8.biblio_muni.dao.LivreRepository;
import com.group8.biblio_muni.dao.ThemeRepository;
import com.group8.biblio_muni.entities.Livre;
import com.group8.biblio_muni.entities.Theme;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

@SpringBootApplication
public class BiblioMuniApplication {

    public static void main(String[] args) {
        SpringApplication.run(BiblioMuniApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ThemeRepository themeRepository, LivreRepository livreRepository){
        return  args -> {
            Stream.of("Amour").forEach(c->{
                livreRepository.save(new Livre(null,"Amour de Taille", "A25353",true, null, new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));
            });
            livreRepository.findAll().forEach(System.out::println);

        };
    }
}
