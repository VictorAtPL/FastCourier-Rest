package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.ZgloszenieOferty;
import com.magicalsolutions.fastcourier.Projection.VerboseZgloszenieOfertyProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "zgloszeniaofert", excerptProjection = VerboseZgloszenieOfertyProjection.class)
/**
 * Zdefiniowanie repozytorium modelu ZgloszeniaOferty w endpointcie REST
 * @author Michał Pruchniewski
 * @since 0.0.3
 * @copyright Magical Solutions
 * @licence Creative Commons Attribution NonCommercial (CC-BY-NC)
 */
public interface ZgloszenieOfertyRepository extends CrudRepository<ZgloszenieOferty, Long> {
}
