package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.ZgloszenieUzytkownika;
import com.magicalsolutions.fastcourier.Projection.ZgloszenieUzytkownikaProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Zdefiniowanie interfejsu zgłoszenia użytkowników, do którego odwołujemy się z pomocą REST.
 */
@CrossOrigin( origins = "*" )
@RepositoryRestResource(path = "zgloszeniauzytkownikow", excerptProjection = ZgloszenieUzytkownikaProjection.class)
public interface ZgloszenieUzytkownikaRepository extends CrudRepository<ZgloszenieUzytkownika, Long> {
}
