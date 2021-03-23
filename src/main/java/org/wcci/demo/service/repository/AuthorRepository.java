package org.wcci.demo.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.wcci.demo.resources.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
