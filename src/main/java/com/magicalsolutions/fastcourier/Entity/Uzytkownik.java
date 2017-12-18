package com.magicalsolutions.fastcourier.Entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "uzytkownicy")
public class Uzytkownik implements Serializable {

    @Id
    @Column(name = "login")
    @NotEmpty
    private String login;

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

    @Column(name = "rola")
    @NotEmpty
    private String rola;

    @Column(name = "haslo")
    @NotEmpty
    private String haslo;

    @Column(name = "data_urodzenia")
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dataUrodzenia;

    @Column
    @NotEmpty
    private String wojewodztwo;

    @Column
    @NotEmpty
    private String miejscowosc;

    @Column(name = "ulica")
    @NotEmpty
    private String ulica;

    @Column(name = "numer_telefonu")
    @NotEmpty
    private String numerTelefonu;

    @OneToMany(mappedBy="zgloszonyUzytkownik")
    private Set<ZgloszenieUzytkownika> zgloszeniaUzytkownika;

    /**
     * Tablica przechowująca oferty użytkownika
     */
    @OneToMany(mappedBy="ofertaUzytkownika")
    private Set<Oferta> oferty;

    @PrePersist
    public void prePersist() {
        if (getRola() == null) {
            setRola("ROLE_USER");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getRola() {
        return rola;
    }

    public void setRola(String rola) {
        this.rola = rola;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getWojewodztwo() {
        return wojewodztwo;
    }

    public void setWojewodztwo(String wojewodztwo) {
        this.wojewodztwo = wojewodztwo;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

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
