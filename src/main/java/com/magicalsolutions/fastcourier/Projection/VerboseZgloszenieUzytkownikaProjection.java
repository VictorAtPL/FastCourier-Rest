package com.magicalsolutions.fastcourier.Projection;

import com.magicalsolutions.fastcourier.Entity.ZgloszenieUzytkownika;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

/**
 * Zdefiniowanie projekcji zgłoszenia użytkownika w endpoint'cie REST
 */
@Projection(name="verbose", types=ZgloszenieUzytkownika.class)
public interface VerboseZgloszenieUzytkownikaProjection {
    String getPowod();
    String getTresc();
    Set<UzytkownikProjection> getZgloszonyUzytkownik();
}
