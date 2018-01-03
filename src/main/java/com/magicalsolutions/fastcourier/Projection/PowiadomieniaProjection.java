package com.magicalsolutions.fastcourier.Projection;

import com.magicalsolutions.fastcourier.Entity.Powiadomienie;
import com.magicalsolutions.fastcourier.Enum.TypPowiadomienia;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name="verbose", types=Powiadomienie.class)
public interface PowiadomieniaProjection {
    long getId();
    TypPowiadomienia getTypPowiadomienia();
    String getIdTypuPowiadomienia();
    Boolean getPrzeczytane();
    Date getDataDodania();
}
