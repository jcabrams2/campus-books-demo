package org.wcci.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.demo.resources.Author;
import org.wcci.demo.resources.Campus;
import org.wcci.demo.service.CampusStorage;
import org.wcci.demo.service.repository.AuthorRepository;

@Component
public class Populator implements CommandLineRunner {

    private CampusStorage campusStorage;
    private AuthorRepository authorRepo;

    public Populator(CampusStorage campusStorage, AuthorRepository authorRepo) {
        this.campusStorage = campusStorage;
        this.authorRepo = authorRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Campus columbus = new Campus("Columbus", "Java");
        campusStorage.saveCampus(columbus);
        Campus cleveland = new Campus("Cleveland", "C#");
        campusStorage.saveCampus(cleveland);
        Campus moon = new Campus("THE MOON", "Ruby");
        campusStorage.saveCampus(moon);

        Author kathySierra = new Author("Kathy Sierra");
        authorRepo.save(kathySierra);
        Author bertBates = new Author("Bert Bates");
        authorRepo.save(bertBates);
        Author ericFreeman = new Author("ericFreeman");
        authorRepo.save(ericFreeman);
        Author elisabethRobson = new Author("Elisabeth Robson");
        authorRepo.save(elisabethRobson);
        Author kent = new Author("Kent Beck");
        authorRepo.save(kent);
        Author martin = new Author("Martin Fowler");
        authorRepo.save(martin);
        Author sandi = new Author("Sandi Metz");
        authorRepo.save(sandi);
    }
}
