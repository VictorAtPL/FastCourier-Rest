package com.magicalsolutions.fastcourier.Projection;

import com.magicalsolutions.fastcourier.Entity.ZgloszenieOferty;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(name="verbose", types=ZgloszenieOferty.class)
public interface VerboseZgloszenieOfertyProjection {
    String getPowod();
    String getTresc();
    Set<OfertaProjection> getZgloszonaOferta();
}
