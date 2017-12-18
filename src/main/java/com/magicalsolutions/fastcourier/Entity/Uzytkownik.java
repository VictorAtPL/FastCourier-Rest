package com.magicalsolutions.fastcourier.Entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Klasa określająca model bazodanowy użytkownika
 * @author Adam R.
 * @since 0.0.3
 * @copyright Magical Solutions
 * @licence Creative Commons Attribution NonCommercial (CC-BY-NC)
 */
@Entity
@Table(name = "uzytkownicy")
public class Uzytkownik implements Serializable {

    /**
     * Zmienna przechowująca login
     */
    @Id
    @Column(name = "login")
    @NotEmpty
    private String login;

    /**
     * Zmienna przechowująca email
     */
    @Column(name = "email")
    @NotEmpty
    private String email;

    /**
     * Imię użytkownika
     */
    @Column(name = "imie")
    @NotEmpty
    private String imie;

    /**
     * Nazwisko użytkownika
     */
    @Column(name = "nazwisko")
    @NotEmpty
    private String nazwisko;

    /**
     * Zmienna przechowująca role użytkownika
     */
    @Column(name = "rola")
    @NotEmpty
    private String rola;

    /**
     * Zmienna przechowująca hasło użytkownika
     */
    @Column(name = "haslo")
    @NotEmpty
    private String haslo;

    /**
     * Zmienna przechowująca datę urodzenia użytkownika
     */
    @Column(name = "data_urodzenia")
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dataUrodzenia;

    /**
     * Zmienna przechowująca województwo użytkownika
     */
    @Column
    @NotEmpty
    private String wojewodztwo;

    /**
     * Zmienna przechowująca miejscowość
     */
    @Column
    @NotEmpty
    private String miejscowosc;

    /**
     * Zmienna przechowująca ulicę użytkownika
     */
    @Column(name = "ulica")
    @NotEmpty
    private String ulica;

    /**
     * Zmienna przechowująca numer telefonu
     */
    @Column(name = "numer_telefonu")
    @NotEmpty
    private String numerTelefonu;

    /**
     *
     */
    @OneToMany(mappedBy="zgloszonyUzytkownik")
    private Set<ZgloszenieUzytkownika> zgloszeniaUzytkownika;

    /**
     * Tablica przechowująca oferty użytkownika
     */
    @OneToMany(mappedBy="ofertaUzytkownika")
    private Set<Oferta> oferty;

    /**
     * Metoda wykonywana przed dodaniem obiektu do bazy danych ustawiająca początkową rolę użytkownika
     */
    @PrePersist
    public void prePersist() {
        if (getRola() == null) {
            setRola("ROLE_USER");
        }
    }

    /**
     * Metoda zwracająca login użytkownika
     * @return login użytkownika
     */
    public String getLogin() {
        return login;
    }

    /**
     * Metoda zmieniająca login uzytkownika w obiekcie
     * @param login Login użytkownika
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Metoda zwracająca email użytkownika
     * @return email użytkownika
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metoda ustawiajaca email użytkownika
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Metoda zwracająca imię użytkownika
     * @return imię użytkownika
     */
    public String getImie() {
        return imie;
    }

    /**
     * Metoda ustawiająca imię użytkownika
     * @param imie - imię użytkownika
     */
    public void setImie(String imie) {
        this.imie = imie;
    }

    /**
     * Metoda zwracająca nazwisko użytkownika
     * @return nazwisko użytkownika
     */
    public String getNazwisko() {
        return nazwisko;
    }

    /**
     * Metoda ustawiająca nazwisko użytkownika
     * @param nazwisko użytkownika
     */
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    /**
     * Metoda zwracająca rolę użytkownika
     * @return rola użytkownika
     */
    public String getRola() {
        return rola;
    }

    /**
     * Metoda zwracająca
     * @param rola
     */
    public void setRola(String rola) {
        this.rola = rola;
    }

    /**
     * Metoda zwracająca hasło użytkownika
     * @return haslo użytkownika
     */
    public String getHaslo() {
        return haslo;
    }

    /**
     * Metoda ustawiająca hasło użytkownika
     * @param haslo
     */
    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    /**
     * Metoda zwracająca datę urodzenia
     * @return data urodzenia uzytkownika
     */
    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    /**
     * Metoda ustawiająca date urodzenia
     * @param dataUrodzenia
     */
    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    /**
     * Metoda zwracająca województwo użytkownika
     * @return województwo użytkownika
     */
    public String getWojewodztwo() {
        return wojewodztwo;
    }

    /**
     * Metoda ustawiająca województwo użytkownika
     * @param wojewodztwo
     */
    public void setWojewodztwo(String wojewodztwo) {
        this.wojewodztwo = wojewodztwo;
    }

    /**
     * Metoda zwracająca miejscowosć użytkownika
     * @return miejscowość użytkownika
     */
    public String getMiejscowosc() {
        return miejscowosc;
    }

    /**
     * Metoda ustawiajaca miejscowość uzytkownika
     * @param miejscowosc
     */
    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    /**
     * Metoda zwrcająca ulice uzytkownika
     * @return ulica użytkownika
     */
    public String getUlica() {
        return ulica;
    }

    /**
     * Metoda ustawiajaca ulicę użytkownika
     * @param ulica użytkownika
     */
    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    /**
     * Metoda zwracajaca numer telefonu użytkownika
     * @return numer telefonu użytkownika
     */
    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    /**
     * Metoda ustawiająca numer telefonu użytkownika
     */
    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    public Set<ZgloszenieUzytkownika> getZgloszeniaUzytkownika() {
        return zgloszeniaUzytkownika;
    }

    public void setZgloszeniaUzytkownika(Set<ZgloszenieUzytkownika> zgloszeniaUzytkownika) {
        this.zgloszeniaUzytkownika = zgloszeniaUzytkownika;
    }

    /**
     * Metoda zwracająca oferty użytkownika
     * @return oferty użytkownika
     */
    public Set<Oferta> getOferty() {
        return oferty;
    }

    /**
     * Metoda zmieniająca oferty użytkownika
     * @param oferty Oferty użytkownika
     */
    public void setOferty(Set<Oferta> oferty) {
        this.oferty = oferty;
    }
}
