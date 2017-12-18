package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.Uwaga;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Interfejs Uwagi
 * @author Michał Świerczewski
 * @since 0.0.3
 * @copyright Magical Solutions
 * @licence Creative Commons Attribution NonCommercial (CC-BY-NC)
 */
@RepositoryRestResource(path = "uwagi")
public interface UwagaRepository extends CrudRepository<Uwaga, Long> {
}
