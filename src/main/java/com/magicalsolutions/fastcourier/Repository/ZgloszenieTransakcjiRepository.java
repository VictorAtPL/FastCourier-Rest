package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.ZgloszenieTransakcji;
import com.magicalsolutions.fastcourier.Projection.ZgloszenieTransakcjiProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "zgloszeniatransakcji", excerptProjection = ZgloszenieTransakcjiProjection.class)
/**
 * Zdefiniowanie repozytorium modelu ZgloszeniaTransakcji w endpointcie REST
 * @author Michał Pruchniewski
 * @since 0.0.3
 * @copyright Magical Solutions
 * @licence Creative Commons Attribution NonCommercial (CC-BY-NC)
 */
public interface ZgloszenieTransakcjiRepository extends CrudRepository<ZgloszenieTransakcji, Long> {
}
