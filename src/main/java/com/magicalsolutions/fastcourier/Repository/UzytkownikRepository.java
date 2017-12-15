package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.Uzytkownik;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Piotr on 14.12.2017.
 */
@RepositoryRestResource(path = "uzytkownicy")
public interface UzytkownikRepository extends CrudRepository<Uzytkownik, String> {
}
