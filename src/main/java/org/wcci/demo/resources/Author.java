package org.wcci.demo.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Author {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    protected Author(){

    }

    public Author(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }


}
