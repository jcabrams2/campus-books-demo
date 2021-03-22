package org.wcci.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wcci.demo.resources.Campus;
import org.wcci.demo.service.CampusStorage;

@RestController
public class CampusController {
    private CampusStorage campusStorage;


    public CampusController(CampusStorage campusStorage) {
        this.campusStorage = campusStorage;
    }

    @GetMapping("/api/campuses")
    public Iterable<Campus> retrieveAllCampuses(){
        return campusStorage.retrieveAllCampuses();
    }
}
