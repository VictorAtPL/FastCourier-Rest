package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.Oferta;
import com.magicalsolutions.fastcourier.Projection.OfertaProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Zdefiniowanie interfejsu ofert, do którego odwołania są realizowane przez REST
 */
@RepositoryRestResource(path = "oferty", excerptProjection = OfertaProjection.class)
public interface OfertaRepository extends CrudRepository<Oferta, Long> {
}
