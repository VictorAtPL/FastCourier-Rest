package com.magicalsolutions.fastcourier.Repository;

import com.magicalsolutions.fastcourier.Entity.Uzytkownik;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "uzytkownicy")
public interface UzytkownikRepository extends CrudRepository<Uzytkownik, String> {
}
