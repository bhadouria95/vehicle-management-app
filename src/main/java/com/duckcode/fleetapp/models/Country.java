package com.duckcode.fleetapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
//@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String capital;
    private String description;
    private String nationality;
    private String continent;

    public Country(){}

    public Country(Integer id, String capital, String code, String continent, String description, String nationality) {
        this.id = id;
        this.code = code;
        this.capital = capital;
        this.description = description;
        this.nationality = nationality;
        this.continent = continent;
    }

    @OneToMany(mappedBy = "country")
    private List<State> states;
}
