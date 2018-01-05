package com.magicalsolutions.fastcourier.Entity;

import com.magicalsolutions.fastcourier.Enum.StatusZlecenia;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "zlecenia_transportu")
public class ZlecenieTransportu {
    @Id
    @Column
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne(fetch=EAGER)
    @JoinColumn(name="oferta_id")
    @RestResource(path = "dotyczyOferty", rel="oferta")
    private Oferta dotyczyOferty;

    @ManyToOne(fetch=EAGER)
    @JoinColumn(name="uzytkownik_id")
    @RestResource(path = "zlecajacyUzytkownik", rel="uzytkownik")
    private Uzytkownik zlecajacyUzytkownik;

    @Column(name="data_zlecenia")
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataZlecenia;

    @Column(name="komentarz")
    @Length(max = 500)
    private String komentarz;

    @Column(name = "kategoria_paczki")
    @NotEmpty
    private String kategoriaPaczki;

    @Column(name = "rozmiar_paczki")
    @NotEmpty
    private String rozmiarPaczki;

    @Column(name = "waga_paczki")
    @NotNull
    private Integer wagaPaczki;

    @Column(name = "status_zlecenia")
    @Enumerated(EnumType.STRING)
    private StatusZlecenia statusZlecenia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Oferta getDotyczyOferty() {
        return dotyczyOferty;
    }

    public void setDotyczyOferty(Oferta dotyczyOferty) {
        this.dotyczyOferty = dotyczyOferty;
    }

    public Uzytkownik getZlecajacyUzytkownik() {
        return zlecajacyUzytkownik;
    }

    public void setZlecajacyUzytkownik(Uzytkownik zlecajacyUzytkownik) {
        this.zlecajacyUzytkownik = zlecajacyUzytkownik;
    }

    public Date getDataZlecenia() {
        return dataZlecenia;
    }

    public void setDataZlecenia(Date dataZlecenia) {
        this.dataZlecenia = dataZlecenia;
    }

    public String getKomentarz() {
        return komentarz;
    }

    public void setKomentarz(String komentarz) {
        this.komentarz = komentarz;
    }

    public String getKategoriaPaczki() {
        return kategoriaPaczki;
    }

    public void setKategoriaPaczki(String kategoriaPaczki) {
        this.kategoriaPaczki = kategoriaPaczki;
    }

    public String getRozmiarPaczki() {
        return rozmiarPaczki;
    }

    public void setRozmiarPaczki(String rozmiarPaczki) {
        this.rozmiarPaczki = rozmiarPaczki;
    }

    public Integer getWagaPaczki() {
        return wagaPaczki;
    }

    public void setWagaPaczki(Integer wagaPaczki) {
        this.wagaPaczki = wagaPaczki;
    }

    public StatusZlecenia getStatusZlecenia() {
        return statusZlecenia;
    }

    public void setStatusZlecenia(StatusZlecenia statusZlecenia) {
        this.statusZlecenia = statusZlecenia;
    }

    @PrePersist
    protected void onCreate() {
        this.dataZlecenia = new Date();
        this.statusZlecenia = StatusZlecenia.DO_ROZPATRZENIA;
    }
}
