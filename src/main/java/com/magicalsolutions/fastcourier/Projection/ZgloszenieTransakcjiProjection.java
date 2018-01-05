package com.magicalsolutions.fastcourier.Projection;

import com.magicalsolutions.fastcourier.Entity.ZlecenieTransportu;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.Set;

@Projection(name = "verbose", types = ZlecenieTransportu.class)
/**
 * Zdefiniowanie projekcji modelu Zgloszenia Transakcji w endpointcie REST
 * @author Michał Pruchniewski
 * @since 0.0.3
 * @copyright Magical Solutions
 * @licence Creative Commons Attribution NonCommercial (CC-BY-NC)
 */
public interface ZgloszenieTransakcjiProjection {
    Integer getId();

    String getPowod();

    String getTresc();

    Date getDataDodania();

    Boolean getPrzeczytane();

    Set<ZlecenieTransportu> getZgloszonaTransakcja();
}
