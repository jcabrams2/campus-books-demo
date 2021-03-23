package org.wcci.demo.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Campus {

    @Id
    @GeneratedValue
    private Long id;
    private String location;
    private String techStack;



    public Campus(String location, String techStack){
        this.location = location;
        this.techStack = techStack;
    }

    protected Campus(){

    }


    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getTechStack() {
        return techStack;
    }
}
