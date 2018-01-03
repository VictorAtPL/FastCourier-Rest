package com.magicalsolutions.fastcourier.Entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * Klasa określająca model bazodanowy oferty
 * @author Przemysław P.
 * @since 0.0.3
 * @copyright Magical Solutions
 * @licence Creative Commons Attribution NonCommercial (CC-BY-NC)
 */
@Entity
@Table(name = "oferty")
public class Oferta {

    /**
     * Zmienna przechowująca identyfikator oferty
     */
    @Id
    @Column
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    /**
     * Zmienna przechowująca użytkownika wystawiającego ofertę
     */
    @ManyToOne(fetch=EAGER)
    @JoinColumn(name="uzytkownik_id")
    @RestResource(path = "ofertaUzytkownika", rel="uzytkownik")
    private Uzytkownik ofertaUzytkownika;

    /**
     * Zmienna przechowująca tytuł oferty
     */
    @Column
    @NotEmpty
    @Length(min = 10, max = 40)
    private String tytul;

    /**
     * Zmienna przechowująca cenę minimalną
     */
    @Column(name = "cena_minimalna", precision = 4, scale = 2)
    @NotNull
    private Double cenaMinimalna;

    /**
     * Zmienna przechowująca cenę maksymalną
     */
    @Column(name = "cena_maksymalna", precision = 4, scale = 2)
    @NotNull
    private Double cenaMaksymalna;

    /**
     * Zmienna przechowująca miasto początkowe
     */
    @Column(name = "miasto_poczatkowe")
    @NotEmpty
    private String miastoPoczatkowe;

    /**
     * Zmienna przechowująca miasto docelowe
     */
    @Column(name = "miasto_docelowe")
    @NotEmpty
    private String miastoDocelowe;

    /**
     * Zmienna przechowująca kategorie paczek
     */
    @Column(name = "kategorie_paczek")
    @NotEmpty
    private String kategoriePaczek;

    /**
     * Zmienna przechowująca rozmiary paczek
     */
    @Column(name = "rozmiary_paczek")
    @NotEmpty
    private String rozmiaryPaczek;

    /**
     * Zmienna przechowująca maksymalną wagę paczki
     */
    @Column(name = "maksymalna_waga_paczki")
    private Integer maksymalnaWagaPaczki;

    /**
     * Zmienna przechowująca datę wyjazdu
     */
    @Column(name = "data_wyjazdu")
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dataWyjazdu;

    /**
     * Zmienna przechowująca godzinę wyjazdu
     */
    @Column(name = "godzina_wyjazdu")
    @NotNull
    @Temporal(TemporalType.TIME)
    private Date godzinaWyjazdu;

    /**
     * Zmienna przechowująca opis
     */
    @Column(name = "opis", length = 400)
    @Length(min = 20, max = 400)
    @NotEmpty
    private String opis;

    /**
     * Zmienna przechowująca wyróżnienie
     */
    @Column(name = "czy_wyroznic")
    @NotNull
    private Boolean czyWyroznic;

    @OneToMany(mappedBy="zgloszonaOferta")
    private Set<ZgloszenieOferty> zgloszeniaOferty;

    @OneToMany(mappedBy="dotyczyOferty")
    private Set<ZlecenieTransportu> zleceniaTransportu;

    @Column(name = "zablokowana")
    @NotNull
    private Boolean zablokowana;

    @Column(name = "aktywna")
    @NotNull
    private Boolean aktywna;

    /**
     * Metoda zwracająca identyfikator oferty
     * @return id oferty
     */
    public Long getId() {
        return id;
    }

    /**
     * Metoda zmieniająca identyfikator oferty
     * @param id Identyfikator oferty
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Metoda zwracająca użytkownika wystawiającego ofertę
     * @return uzytkownik wystawiający ofertę
     */
    public Uzytkownik getOfertaUzytkownika() {
        return ofertaUzytkownika;
    }

    /**
     * Metoda zmieniająca użytkownika wystawiającego ofertę
     * @param ofertaUzytkownika Użytkownik wystawiający ofertę
     */
    public void setOfertaUzytkownika(Uzytkownik ofertaUzytkownika) {
        this.ofertaUzytkownika = ofertaUzytkownika;
    }

    /**
     * Metoda zwracająca tytuł oferty
     * @return tytuł oferty
     */
    public String getTytul() {
        return tytul;
    }

    /**
     * Metoda zmieniająca tytuł oferty
     * @param tytul Tytył oferty
     */
    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    /**
     * Metoda zwracająca cenę minimalną
     * @return cena minimalna
     */
    public Double getCenaMinimalna() {
        return cenaMinimalna;
    }

    /**
     * Metoda zmieniająca cenę minimalną
     * @param cenaMinimalna Cena minimalna
     */
    public void setCenaMinimalna(Double cenaMinimalna) {
        this.cenaMinimalna = cenaMinimalna;
    }

    /**
     * Metoda zwracająca cenę maksymalną
     * @return cena maksymalna
     */
    public Double getCenaMaksymalna() {
        return cenaMaksymalna;
    }

    /**
     * Metoda zmieniająca cenę maksymalną
     * @param cenaMaksymalna Cena maksymalna
     */
    public void setCenaMaksymalna(Double cenaMaksymalna) {
        this.cenaMaksymalna = cenaMaksymalna;
    }

    /**
     * Metoda zwracająca miasto początkowe
     * @return miasto początkowe
     */
    public String getMiastoPoczatkowe() {
        return miastoPoczatkowe;
    }

    /**
     * Metoda zmieniająca miasto początkowe
     * @param miastoPoczatkowe Miasto początkowe
     */
    public void setMiastoPoczatkowe(String miastoPoczatkowe) {
        this.miastoPoczatkowe = miastoPoczatkowe;
    }

    /**
     * Metoda zwracająca miasto docelowe
     * @return miasto docelowe
     */
    public String getMiastoDocelowe() {
        return miastoDocelowe;
    }

    /**
     * Metoda zmieniająca miasto docelowe
     * @param miastoDocelowe Miasto docelowe
     */
    public void setMiastoDocelowe(String miastoDocelowe) {
        this.miastoDocelowe = miastoDocelowe;
    }

    /**
     * Metoda zwracająca kategorie paczki
     * @return kategorie paczki
     */
    public String getKategoriePaczek() {
        return kategoriePaczek;
    }

    /**
     * Metoda zmieniająca kategorie paczki
     * @param kategoriePaczek Kategorie paczki
     */
    public void setKategoriePaczek(String kategoriePaczek) {
        this.kategoriePaczek = kategoriePaczek;
    }

    /**
     * Metoda zwracająca rozmiary paczki
     * @return rozmiary paczki
     */
    public String getRozmiaryPaczek() {
        return rozmiaryPaczek;
    }

    /**
     * Metoda zmieniająca rozmiary paczki
     * @param rozmiaryPaczek Rozmiary paczki
     */
    public void setRozmiaryPaczek(String rozmiaryPaczek) {
        this.rozmiaryPaczek = rozmiaryPaczek;
    }

    /**
     * Metoda zwracająca datę wyjazdu
     * @return data wyjazdu
     */
    public Date getDataWyjazdu() {
        return dataWyjazdu;
    }

    /**
     * Metoda zmieniająca datę wyjazdu
     * @param dataWyjazdu Data wyjazdu
     */
    public void setDataWyjazdu(Date dataWyjazdu) {
        this.dataWyjazdu = dataWyjazdu;
    }

    /**
     * Metoda zwracająca godzinę wyjazdu
     * @return godzina wyjazdu
     */
    public Date getGodzinaWyjazdu() {
        return godzinaWyjazdu;
    }

    /**
     * Metoda zmieniająca godzinę wyjazdu
     * @param godzinaWyjazdu Godzina wyjazdu
     */
    public void setGodzinaWyjazdu(Date godzinaWyjazdu) {
        this.godzinaWyjazdu = godzinaWyjazdu;
    }

    /**
     * Metoda zwracająca maksymalną wagę paczki
     * @return maksymalna waga paczki
     */
    public Integer getMaksymalnaWagaPaczki() {
        return maksymalnaWagaPaczki;
    }

    /**
     * Metoda zmieniająca maksymalną wagę paczki
     * @param maksymalnaWagaPaczki Maksymalna waga paczki
     */
    public void setMaksymalnaWagaPaczki(Integer maksymalnaWagaPaczki) {
        this.maksymalnaWagaPaczki = maksymalnaWagaPaczki;
    }

    /**
     * Metoda zwracająca opis paczki
     * @return opis paczki
     */
    public String getOpis() {
        return opis;
    }

    /**
     * Metoda zmieniająca opis paczki
     * @param opis Opis paczki
     */
    public void setOpis(String opis) {
        this.opis = opis;
    }

    /**
     * Metoda zwracająca wyróżnienie oferty
     * @return wyróżnienie oferty
     */
    public Boolean getCzyWyroznic() {
        return czyWyroznic;
    }

    /**
     * Metoda zmieniająca wyróżnienie oferty
     * @param czyWyroznic Wyróżnienie oferty
     */
    public void setCzyWyroznic(Boolean czyWyroznic) {
        this.czyWyroznic = czyWyroznic;
    }

    public Set<ZgloszenieOferty> getZgloszeniaOferty() {
        return zgloszeniaOferty;
    }

    public void setZgloszeniaOferty(Set<ZgloszenieOferty> zgloszeniaOferty) {
        this.zgloszeniaOferty = zgloszeniaOferty;
    }

    public Boolean getZablokowana() {
        return zablokowana;
    }

    public void setZablokowana(Boolean zablokowana) {
        this.zablokowana = zablokowana;
    }

    public Boolean getAktywna() {
        return aktywna;
    }

    public void setAktywna(Boolean aktywna) {
        this.aktywna = aktywna;
    }

    public Set<ZlecenieTransportu> getZleceniaTransportu() {
        return zleceniaTransportu;
    }

    public void setZleceniaTransportu(Set<ZlecenieTransportu> zleceniaTransportu) {
        this.zleceniaTransportu = zleceniaTransportu;
    }

    @PrePersist
    protected void onCreate() {
        this.setZablokowana(false);
        this.setAktywna(true);
    }
}
