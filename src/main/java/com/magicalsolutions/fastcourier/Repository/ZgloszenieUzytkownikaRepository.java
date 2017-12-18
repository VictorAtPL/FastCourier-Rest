package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.ZgloszenieUzytkownika;
import com.magicalsolutions.fastcourier.Projection.VerboseZgloszenieUzytkownikaProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Zdefiniowanie interfejsu zgłoszenia użytkowników, do którego odwołujemy się z pomocą REST.
 */
@RepositoryRestResource(path = "zgloszeniauzytkownikow", excerptProjection = VerboseZgloszenieUzytkownikaProjection.class)
public interface ZgloszenieUzytkownikaRepository extends CrudRepository<ZgloszenieUzytkownika, Long> {
}
