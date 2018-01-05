package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.ZgloszenieOferty;
import com.magicalsolutions.fastcourier.Projection.ZgloszenieOfertyProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin( origins = "*" )
@RepositoryRestResource(path = "zgloszeniaofert", excerptProjection = ZgloszenieOfertyProjection.class)
/**
 * Zdefiniowanie repozytorium modelu ZgloszeniaOferty w endpointcie REST
 * @author Michał Pruchniewski
 * @since 0.0.3
 * @copyright Magical Solutions
 * @licence Creative Commons Attribution NonCommercial (CC-BY-NC)
 */
public interface ZgloszenieOfertyRepository extends CrudRepository<ZgloszenieOferty, Long> {
}
