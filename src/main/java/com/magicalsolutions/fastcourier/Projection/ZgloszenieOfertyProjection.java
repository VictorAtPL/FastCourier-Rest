package com.magicalsolutions.fastcourier.Projection;

import com.magicalsolutions.fastcourier.Entity.ZgloszenieOferty;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.Set;

@Projection(name="verbose", types=ZgloszenieOferty.class)
/**
 * Zdefiniowanie projekcji modelu Zgloszenia Oferty w endpointcie REST
 * @author Michał Pruchniewski
 * @since 0.0.3
 * @copyright Magical Solutions
 * @licence Creative Commons Attribution NonCommercial (CC-BY-NC)
 */
public interface ZgloszenieOfertyProjection {
    Integer getId();
    String getPowod();
    String getTresc();
    Date getDataDodania();
    Boolean getPrzeczytane();
    Set<OfertaProjection> getZgloszonaOferta();
}
