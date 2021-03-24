package org.wcci.demo.resources;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "authors")
    @JsonIgnore
    private Set<Book> books;

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
