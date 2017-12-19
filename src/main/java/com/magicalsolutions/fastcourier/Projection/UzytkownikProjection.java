package com.magicalsolutions.fastcourier.Projection;

import com.magicalsolutions.fastcourier.Entity.Uzytkownik;
import org.springframework.data.rest.core.config.Projection;

/**
 * Zdefiniowanie projekcji modelu użytkownika w endpoint'cie REST
 */
@Projection(name="verbose", types=Uzytkownik.class)
public interface UzytkownikProjection {
    String getLogin();
    String getRola();
    Boolean getZablokowany();
}
