package com.magicalsolutions.fastcourier.Entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * Klasa określająca model bazodanowy zgłoszenia użytkownika
 * @author Marcin M.
 * @since 0.0.3
 * @copyright Magical Solutions
 * @licence Creative Commons Attribution NonCommercial (CC-BY-NC)
 */
@Entity
@Table(name = "zgloszenia_uzytkownikow")
public class ZgloszenieUzytkownika {

    /**
     * Zmienna przechowująca identyfikator zgłoszenia
     */
    @Id
    @Column
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    /**
     * Zmienna przechowująca zgłaszanego użytkownika
     */
    @ManyToOne(fetch=EAGER)
    @JoinColumn(name="uzytkownik_id")
    @RestResource(path = "zgloszonyUzytkownik", rel="uzytkownik")
    private Uzytkownik zgloszonyUzytkownik;

    /**
     * Zmienna przechowująca powód zgłoszenia
     */
    @Column(name="powod")
    @NotEmpty
    @Length(max = 200)
    private String powod;

    /**
     * Zmienna przechowująca treść zgłoszenia
     */
    @Column(name="tresc")
    @NotEmpty
    @Length(min = 40, max = 500)
    private String tresc;

    /**
     * Atrybut odpowiedzialny za datę dodania zgłoszenia
     */
    @Column(name="data_dodania")
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataDodania;

    /**
     * Atrybut odpowiedzialny za to czy zgłoszenie zostało przeczytane
     */
    @Column(name="przeczytane")
    @NotNull
    private Boolean przeczytane;

    /**
     * Metoda zwracająca id zgłoszenia
     * @return id zgłoszenia
     */
    public Long getId() {
        return id;
    }

    /**
     * Metoda ustawiająca id zgłoszenia w obiekcie
     * @param id id zgłoszenia
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Metoda pobierająca zgłaszanego użytkownika
     * @return obiekt zgłaszanego użytkownika
     */
    public Uzytkownik getZgloszonyUzytkownik() {
        return zgloszonyUzytkownik;
    }

    /**
     * Metoda ustawiająca zgłaszanego użytkownika
     * @param zgloszonyUzytkownik zgłaszany użytkownik
     */
    public void setZgloszonyUzytkownik(Uzytkownik zgloszonyUzytkownik) {
        this.zgloszonyUzytkownik = zgloszonyUzytkownik;
    }

    /**
     * Metoda pobierająca powód zgłoszenia
     * @return powód zgłoszenia
     */
    public String getPowod() {
        return powod;
    }

    /**
     * Metoda ustawiająca powód zgłoszenia
     * @param powod powód zgłoszenia
     */
    public void setPowod(String powod) {
        this.powod = powod;
    }

    /**
     * Metoda pobierająca treść zgłoszenia
     * @return treść zgłoszenia
     */
    public String getTresc() {
        return tresc;
    }

    /**
     * Metoda ustawiająca treść zgłoszenia
     * @param tresc treść zgłoszenia
     */
    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public Date getDataDodania() {
        return dataDodania;
    }

    public void setDataDodania(Date dataDodania) {
        this.dataDodania = dataDodania;
    }

    public Boolean getPrzeczytane() {
        return przeczytane;
    }

    public void setPrzeczytane(Boolean przeczytane) {
        this.przeczytane = przeczytane;
    }

    @PrePersist
    protected void onCreate() {
        this.dataDodania = new Date();
        this.przeczytane = false;
    }
}
