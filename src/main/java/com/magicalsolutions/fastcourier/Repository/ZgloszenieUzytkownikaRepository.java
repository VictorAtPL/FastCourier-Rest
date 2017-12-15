package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.ZgloszenieUzytkownika;
import com.magicalsolutions.fastcourier.Projection.VerboseZgloszenieUzytkownikaProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "zgloszeniauzytkownikow", excerptProjection = VerboseZgloszenieUzytkownikaProjection.class)
public interface ZgloszenieUzytkownikaRepository extends CrudRepository<ZgloszenieUzytkownika, Long> {
}
