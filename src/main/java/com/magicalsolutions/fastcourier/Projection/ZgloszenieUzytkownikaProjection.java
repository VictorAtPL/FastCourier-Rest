package com.magicalsolutions.fastcourier.Projection;

import com.magicalsolutions.fastcourier.Entity.ZgloszenieUzytkownika;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.Set;

/**
 * Zdefiniowanie projekcji zgłoszenia użytkownika w endpoint'cie REST
 */
@Projection(name="verbose", types=ZgloszenieUzytkownika.class)
public interface ZgloszenieUzytkownikaProjection {
    Integer getId();
    String getPowod();
    String getTresc();
    Date getDataDodania();
    Boolean getPrzeczytane();
    Set<UzytkownikProjection> getZgloszonyUzytkownik();
}
