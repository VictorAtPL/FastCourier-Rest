package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.Oferta;
import com.magicalsolutions.fastcourier.Projection.OfertaProjection;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Zdefiniowanie interfejsu ofert, do którego odwołania są realizowane przez REST
 */
@CrossOrigin( origins = "*" )
@RepositoryRestResource(path = "oferty", excerptProjection = OfertaProjection.class)
public interface OfertaRepository extends PagingAndSortingRepository<Oferta, Long> {
}
