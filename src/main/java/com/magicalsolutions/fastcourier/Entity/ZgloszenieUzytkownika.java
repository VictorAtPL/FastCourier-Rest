package com.magicalsolutions.fastcourier.Entity;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "zgloszenia_uzytkownikow")
public class ZgloszenieUzytkownika {

    @Id
    @Column
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne(fetch=EAGER)
    @JoinColumn(name="uzytkownik_id")
    @RestResource(path = "zgloszonyUzytkownik", rel="uzytkownik")
    private Uzytkownik zgloszonyUzytkownik;

    @Column(name="powod")
    @NotEmpty
    private String powod;

    @Column(name="tresc")
    @NotEmpty
    private String tresc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Uzytkownik getZgloszonyUzytkownik() {
        return zgloszonyUzytkownik;
    }

    public void setZgloszonyUzytkownik(Uzytkownik zgloszonyUzytkownik) {
        this.zgloszonyUzytkownik = zgloszonyUzytkownik;
    }

    public String getPowod() {
        return powod;
    }

    public void setPowod(String powod) {
        this.powod = powod;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }
}
