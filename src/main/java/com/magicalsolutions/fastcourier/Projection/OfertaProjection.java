package com.magicalsolutions.fastcourier.Projection;

import com.magicalsolutions.fastcourier.Entity.Oferta;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.Set;

/**
 * Projekcja klasy oferta, która posiada w sobie projekcje klasy użytkownik. Dzięki temu endpoint REST zawiera oprócz linku do użytkownika wystawiającego oferte także dane użytkownika tego użytkownika.
 *
 * @author Michał Pruchniewski, Piotr Podbielski
 * @since 0.0.3
 * @version 0.0.3
 * @copyright Magical Solutions
 * @todo Integracja komentarzy z galęzi Michała Pruchniewskiego dla metod getId oraz getTytul.
 * @license Creative Commons Attribution NonCommercial (CC-BY-NC)
 */
@Projection(name="verbose", types=Oferta.class)
/**
 * Zdefiniowanie projekcji modelu Oferty w endpointcie REST
 * @author Michał Pruchniewski
 * @since 0.0.3
 * @copyright Magical Solutions
 * @licence Creative Commons Attribution NonCommercial (CC-BY-NC)
 */
public interface OfertaProjection {
    /**
     *
     * @author Michał Pruchniewski
     * @return
     */
    long getId();

    /**
     *
     * @author Michał Pruchniewski
     * @return
     */
    String getTytul();

    /**
     * Funkcja zwracająca do którego użytkownika należy oferta
     * @author Piotr Podbielski
     * @return tablica projekcji encji użytkownik
     */
    Set<UzytkownikProjection> getOfertaUzytkownika();

    /**
     * Funkcja zwracająca cenę minimalną
     * @author Piotr Podbielski
     * @return cena minimalna
     */
    Double getCenaMinimalna();

    /**
     * Funkcja zwracająca cenę maksymalną
     * @author Piotr Podbielski
     * @return cena maksymalna
     */
    Double getCenaMaksymalna();

    /**
     * Funkcja zwracająca miasto początkowe
     * @author Piotr Podbielski
     * @return miasto początkowe
     */
    String getMiastoPoczatkowe();

    /**
     * Funkcja zwracająca miasto docelowe
     * @author Piotr Podbielski
     * @return miasto docelowe
     */
    String getMiastoDocelowe();

    /**
     * Funkcja zwracająca kategorie paczek
     * @author Piotr Podbielski
     * @return kategorie paczek
     */
    String getKategoriePaczek();

    /**
     * Funkcja zwracająca rozmiary paczek
     * @author Piotr Podbielski
     * @return rozmiary paczek
     */
    String getRozmiaryPaczek();

    /**
     * Funkcja zwracająca maksymalną wagę paczki
     * @author Piotr Podbielski
     * @return waga paczki
     */
    Integer getMaksymalnaWagaPaczki();

    /**
     * Funkcja zwracająca datę wyjazdu
     * @author Piotr Podbielski
     * @return data wyjazdu
     */
    Date getDataWyjazdu();

    /**
     * Funkcja zwracająca godzinę wyjazdu
     * @author Piotr Podbielski
     * @return godzina wyjazdu
     */
    Date getGodzinaWyjazdu();
}
