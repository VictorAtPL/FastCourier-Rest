package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.ZgloszenieOferty;
import com.magicalsolutions.fastcourier.Projection.VerboseZgloszenieOfertyProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "zgloszeniaofert", excerptProjection = VerboseZgloszenieOfertyProjection.class)
public interface ZgloszenieOfertyRepository extends CrudRepository<ZgloszenieOferty, Long> {
}
