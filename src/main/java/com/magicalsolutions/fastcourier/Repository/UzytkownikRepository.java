package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.Uzytkownik;
import com.magicalsolutions.fastcourier.Projection.UzytkownikProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "uzytkownicy",  excerptProjection = UzytkownikProjection.class)
public interface UzytkownikRepository extends CrudRepository<Uzytkownik, String> {
}
