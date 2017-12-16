package com.magicalsolutions.fastcourier.Entity;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "zgloszenia_oferty")
public class ZgloszenieOferty {

    @Id
    @Column
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne(fetch=EAGER)
    @JoinColumn(name="oferta_id")
    @RestResource(path = "zgloszonaOferta", rel="oferta")
    private Oferta zgloszonaOferta;

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

    public Oferta getZgloszonaOferta() {
        return zgloszonaOferta;
    }

    public void setZgloszonaOferta(Oferta zgloszonaOferta) {
        this.zgloszonaOferta = zgloszonaOferta;
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
