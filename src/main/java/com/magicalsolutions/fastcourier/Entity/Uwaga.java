package com.magicalsolutions.fastcourier.Entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "uwagi")
public class Uwaga {

    @Id
    @Column
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

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
