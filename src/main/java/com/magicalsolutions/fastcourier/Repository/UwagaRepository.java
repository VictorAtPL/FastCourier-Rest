package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.Uwaga;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "uwagi")
public interface UwagaRepository extends CrudRepository<Uwaga, Long> {
}
