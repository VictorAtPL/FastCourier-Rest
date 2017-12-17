package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.Oferta;
import com.magicalsolutions.fastcourier.Projection.OfertaProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "oferty", excerptProjection = OfertaProjection.class)
public interface OfertaRepository extends CrudRepository<Oferta, Long> {
}
