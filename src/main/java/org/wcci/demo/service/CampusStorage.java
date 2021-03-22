package org.wcci.demo.service;

import org.springframework.stereotype.Service;
import org.wcci.demo.resources.Campus;
import org.wcci.demo.service.repository.CampusRepository;

@Service
public class CampusStorage {

    private CampusRepository campusRepo;

    public CampusStorage(CampusRepository campusRepo) {
        this.campusRepo = campusRepo;
    }

    public void saveCampus(Campus campusToSave){
        campusRepo.save(campusToSave);
    }
    public Iterable<Campus> retrieveAllCampuses(){
        return campusRepo.findAll();
    }
}
