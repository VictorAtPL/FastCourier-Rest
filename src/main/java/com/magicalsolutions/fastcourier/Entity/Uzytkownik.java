package com.magicalsolutions.fastcourier.Entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Entity dla przykładowego obiektu bazodanowego User
 */
@Entity
@Table(name = "uzytkownicy")
@Data
public class Uzytkownik implements Serializable {

    @Id
    @Column(name = "email")
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
}
