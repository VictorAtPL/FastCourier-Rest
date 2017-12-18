package com.magicalsolutions.fastcourier.Entity;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "zgloszenia_oferty")

/**
 * Zdefiniowe klasy ZgloszenieOferty
 * @author Michał Pruchniewski
 * @since 0.0.3
 * @copyright Magical Solutions
 * @licence Creative Commons Attribution NonCommercial (CC-BY-NC)
 */
public class ZgloszenieOferty {

    /**
     * Atrybut odpowiedzialny za identyfikator zgloszenia
     */
    @Id
    @Column
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    /**
     * Obiekt ktory jest odpowiedzialny za zgloszonaOferte
     */
    @ManyToOne(fetch=EAGER)
    @JoinColumn(name="oferta_id")
    @RestResource(path = "zgloszonaOferta", rel="oferta")
    private Oferta zgloszonaOferta;

    /**
     * Atrybut odpowiedzialny za powód zgloszenia
     */
    @Column(name="powod")
    @NotEmpty
    private String powod;

    /**
     * Atrybut odpowiedzialny za treść zgłoszenia
     */
    @Column(name="tresc")
    @NotEmpty
    private String tresc;


    /**
     * Metoda zwracająca id zgloszenia
     */
    public Long getId() {
        return id;
    }

    /**
     * Metoda ustawiająca id zgloszenia
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Metoda pobierajaca zgloszona oferte
     */
    public Oferta getZgloszonaOferta() {
        return zgloszonaOferta;
    }

    /**
     * Metoda ustawiajaca zgloszona oferte
     */
    public void setZgloszonaOferta(Oferta zgloszonaOferta) {
        this.zgloszonaOferta = zgloszonaOferta;
    }

    /**
     * Metoda pobierajaca powod zgloszenia
     */
    public String getPowod() {
        return powod;
    }

    /**
     * Metoda ustawiajaca powod zgloszenia
     */
    public void setPowod(String powod) {
        this.powod = powod;
    }

    /**
     * Metoda pobierajaca tresc zgloszenia
     */
    public String getTresc() {
        return tresc;
    }

    /**
     * Metoda ustawiajaca tresc zgloszenia
     */
    public void setTresc(String tresc) {
        this.tresc = tresc;
    }
}
