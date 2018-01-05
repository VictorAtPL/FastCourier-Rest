package com.magicalsolutions.fastcourier.Projection;

import com.magicalsolutions.fastcourier.Entity.ZlecenieTransportu;
import com.magicalsolutions.fastcourier.Enum.StatusZlecenia;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name="verbose", types=ZlecenieTransportu.class)
public interface ZlecenieProjection {
    long getId();
    Date getDataZlecenia();
    String getKomentarz();
    String getKategoriaPaczki();
    String getRozmiarPaczki();
    Integer getWagaPaczki();
    StatusZlecenia getStatusZlecenia();

    OfertaProjection getDotyczyOferty();
    UzytkownikProjection getZlecajacyUzytkownik();
}
