package org.wcci.demo.controller;

import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/api/campuses/{id}")
    public Campus retrieveCampusById(@PathVariable Long id){
        return campusStorage.retrieveCampusById(id);
    }

    @DeleteMapping("/api/campuses/{id}")
    public void deleteCampusById(@PathVariable Long id){
        campusStorage.deleteCampusById(id);
    }

    @PostMapping("/api/campuses")
    public Iterable<Campus> addCampus(@RequestBody Campus campusToAdd){
        campusStorage.saveCampus(campusToAdd);
        return campusStorage.retrieveAllCampuses();
    }
}
