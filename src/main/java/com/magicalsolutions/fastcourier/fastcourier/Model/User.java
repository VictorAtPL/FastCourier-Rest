package com.magicalsolutions.fastcourier.fastcourier.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model dla przykładowego obiektu bazodanowego User
 */
public class User {
    /**
     * Imię użytkownika
     */
    private String firstName;
    /**
     * Nazwisko użytkownika
     */
    private String lastName;

    /**
     * Konstruktor klasy User pozwalający na powołanie instancji z ustawionymi atrybutami początkowymi
     *
     * @param firstName imię użytkownika
     * @param lastName  nazwisko użytkownika
     */
    @JsonCreator
    public User(@JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Funkcja zwracająca imię użytkownika
     *
     * @return imię użytkownika
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Funkcja pozwalająca na zmianę imienia użytkownika
     * @param firstName imię użytkownika
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Funkcja zwracająca nazwisko użytkownika
     * @return nazwisko użytkownika
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Funkcja pozwalająca na zmianę nazwiska użytkownika
     * @param lastName nazwisko użytkownika
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
