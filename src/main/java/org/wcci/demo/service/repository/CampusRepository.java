package org.wcci.demo.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.wcci.demo.resources.Campus;

public interface CampusRepository extends CrudRepository<Campus, Long> {
}
