package com.magicalsolutions.fastcourier.Projection;

import com.magicalsolutions.fastcourier.Entity.Oferta;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="verbose", types=Oferta.class)
public interface OfertaProjection {
    long getId();
    String getTytul();
}
