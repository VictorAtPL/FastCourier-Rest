package com.magicalsolutions.fastcourier.Entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Klasa Tworząca obiekt uwagi pobrane z bazy danych
 * @author Michał Świerczewski
 * @since 0.0.3
 * @copyright Magical Solutions
 * @licence Creative Commons Attribution NonCommercial (CC-BY-NC)
 */

@Entity
@Table(name = "uwagi")
public class Uwaga {

    /**
     * Zmienna przechowująca wartość id
     */
    @Id
    @Column
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    /**
     * Zmienna przechowująca wartość powod
     */
    @Column(name="powod")
    @NotEmpty
    private String powod;
    /**
     * Zmienna przechowująca wartość tresc
     */
    @Column(name="tresc")
    @NotEmpty
    private String tresc;

    /**
     * Metoda służąca do pobrania wartości id
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Metoda służąca do ustawienia wartości id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Metoda służąca do pobrania wartości powod
     * @return powod
     */
    public String getPowod() {
        return powod;
    }

    /**
     *Metoda służąca do ustawienia wartości Powod
     * @param powod
     */
    public void setPowod(String powod) {
        this.powod = powod;
    }

    /**
     * Metoda służąca do pobrania wartości Tresc
     * @return tresc
     */
    public String getTresc() {
        return tresc;
    }

    /**
     *Metoda służąca do ustawienia wartości tresc
     * @param tresc
     */
    public void setTresc(String tresc) {
        this.tresc = tresc;
    }
}
