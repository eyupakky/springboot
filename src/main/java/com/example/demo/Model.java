package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String occupation;

    public Model() {
    }

    public Model(String name, String occupation,Long id) {
        this.name = name;
        this.id=id;
        this.occupation = occupation;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString(){
        return  name +' '+occupation;
    }

}
