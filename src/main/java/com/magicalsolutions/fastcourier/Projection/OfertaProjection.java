package com.magicalsolutions.fastcourier.Projection;

import com.magicalsolutions.fastcourier.Entity.Oferta;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.Set;

@Projection(name="verbose", types=Oferta.class)
public interface OfertaProjection {
    long getId();
    String getTytul();
    Set<UzytkownikProjection> getOfertaUzytkownika();
    Integer getCenaMinimalna();
    Integer getCenaMaksymalna();
    String getMiastoPoczatkowe();
    String getMiastoDocelowe();
    String getKategoriePaczek();
    String getRozmiaryPaczek();
    Integer getMaksymalnaWagaPaczki();
    Date getDataWyjazdu();
    Date getGodzinaWyjazdu();
}
