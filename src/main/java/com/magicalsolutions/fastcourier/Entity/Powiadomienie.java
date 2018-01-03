package com.magicalsolutions.fastcourier.Entity;

import com.magicalsolutions.fastcourier.Enum.TypPowiadomienia;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "powiadomienia")
public class Powiadomienie {
    @Id
    @Column
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne(fetch=EAGER)
    @JoinColumn(name="uzytkownik_id")
    @RestResource(path = "powiadomienieUzytkownika", rel="uzytkownik")
    private Uzytkownik powiadomienieUzytkownika;

    @Column(name = "typ_powiadomienia")
    @Enumerated(EnumType.STRING)
    private TypPowiadomienia typPowiadomienia;

    @Column(name = "id_typu_powiadomienia")
    @NotEmpty
    private String idTypuPowiadomienia;

    @Column(name="przeczytane")
    @NotNull
    private Boolean przeczytane;

    @Column(name="data_dodania")
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataDodania;

    @PrePersist
    protected void onCreate() {
        this.dataDodania = new Date();
        this.przeczytane = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Uzytkownik getPowiadomienieUzytkownika() {
        return powiadomienieUzytkownika;
    }

    public void setPowiadomienieUzytkownika(Uzytkownik powiadomienieUzytkownika) {
        this.powiadomienieUzytkownika = powiadomienieUzytkownika;
    }

    public TypPowiadomienia getTypPowiadomienia() {
        return typPowiadomienia;
    }

    public void setTypPowiadomienia(TypPowiadomienia typPowiadomienia) {
        this.typPowiadomienia = typPowiadomienia;
    }

    public String getIdTypuPowiadomienia() {
        return idTypuPowiadomienia;
    }

    public void setIdTypuPowiadomienia(String idTypuPowiadomienia) {
        this.idTypuPowiadomienia = idTypuPowiadomienia;
    }

    public Boolean getPrzeczytane() {
        return przeczytane;
    }

    public void setPrzeczytane(Boolean przeczytane) {
        this.przeczytane = przeczytane;
    }

    public Date getDataDodania() {
        return dataDodania;
    }

    public void setDataDodania(Date dataDodania) {
        this.dataDodania = dataDodania;
    }
}
