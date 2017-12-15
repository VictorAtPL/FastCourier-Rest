package com.magicalsolutions.fastcourier.Projection;

import com.magicalsolutions.fastcourier.Entity.Uzytkownik;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="verbose", types=Uzytkownik.class)
public interface UzytkownikProjection {
    String getLogin();
}
