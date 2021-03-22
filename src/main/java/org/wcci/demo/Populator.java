package org.wcci.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.demo.resources.Campus;
import org.wcci.demo.service.CampusStorage;

@Component
public class Populator implements CommandLineRunner {

    private CampusStorage campusStorage;

    public Populator(CampusStorage campusStorage) {
        this.campusStorage = campusStorage;
    }

    @Override
    public void run(String... args) throws Exception {
        Campus columbus = new Campus("Columbus", "Java");
        campusStorage.saveCampus(columbus);
    }
}
