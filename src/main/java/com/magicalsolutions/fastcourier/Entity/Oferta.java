package com.magicalsolutions.fastcourier.Entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "oferty")
public class Oferta {

    @Id
    @Column
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne(fetch=EAGER)
    @JoinColumn(name="uzytkownik_id")
    @RestResource(path = "ofertaUzytkownika", rel="uzytkownik")
    private Uzytkownik ofertaUzytkownika;

    @Column
    @NotEmpty
    @Length(min = 10, max = 40)
    private String tytul;

    @Column(name = "cena_minimalna")
    @NotNull
    private Integer cenaMinimalna;

    @Column(name = "cena_maksymalna")
    @NotNull
    private Integer cenaMaksymalna;

    @Column(name = "miasto_poczatkowe")
    @NotEmpty
    private String miastoPoczatkowe;

    @Column(name = "miasto_docelowe")
    @NotEmpty
    private String miastoDocelowe;

    @Column(name = "kategorie_paczek")
    @NotEmpty
    private String kategoriePaczek;

    @Column(name = "rozmiary_paczek")
    @NotEmpty
    private String rozmiaryPaczek;

    @Column(name = "maksymalna_waga_paczki")
    private Integer maksymalnaWagaPaczki;

    @Column(name = "data_wyjazdu")
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dataWyjazdu;

    @Column(name = "godzina_wyjazdu")
    @NotNull
    @Temporal(TemporalType.TIME)
    private Date godzinaWyjazdu;

    @Column(name = "opis", length = 400)
    @Length(min = 20, max = 400)
    @NotEmpty
    private String opis;

    @Column(name = "czy_wyroznic")
    @NotNull
    private Boolean czyWyroznic;

    @OneToMany(mappedBy="zgloszonaOferta")
    private Set<ZgloszenieOferty> zgloszeniaOferty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Uzytkownik getOfertaUzytkownika() {
        return ofertaUzytkownika;
    }

    public void setOfertaUzytkownika(Uzytkownik ofertaUzytkownika) {
        this.ofertaUzytkownika = ofertaUzytkownika;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Integer getCenaMinimalna() {
        return cenaMinimalna;
    }

    public void setCenaMinimalna(Integer cenaMinimalna) {
        this.cenaMinimalna = cenaMinimalna;
    }

    public Integer getCenaMaksymalna() {
        return cenaMaksymalna;
    }

    public void setCenaMaksymalna(Integer cenaMaksymalna) {
        this.cenaMaksymalna = cenaMaksymalna;
    }

    public String getMiastoPoczatkowe() {
        return miastoPoczatkowe;
    }

    public void setMiastoPoczatkowe(String miastoPoczatkowe) {
        this.miastoPoczatkowe = miastoPoczatkowe;
    }

    public String getMiastoDocelowe() {
        return miastoDocelowe;
    }

    public void setMiastoDocelowe(String miastoDocelowe) {
        this.miastoDocelowe = miastoDocelowe;
    }

    public String getKategoriePaczek() {
        return kategoriePaczek;
    }

    public void setKategoriePaczek(String kategoriePaczek) {
        this.kategoriePaczek = kategoriePaczek;
    }

    public String getRozmiaryPaczek() {
        return rozmiaryPaczek;
    }

    public void setRozmiaryPaczek(String rozmiaryPaczek) {
        this.rozmiaryPaczek = rozmiaryPaczek;
    }

    public Date getDataWyjazdu() {
        return dataWyjazdu;
    }

    public void setDataWyjazdu(Date dataWyjazdu) {
        this.dataWyjazdu = dataWyjazdu;
    }

    public Date getGodzinaWyjazdu() {
        return godzinaWyjazdu;
    }

    public void setGodzinaWyjazdu(Date godzinaWyjazdu) {
        this.godzinaWyjazdu = godzinaWyjazdu;
    }

    public Integer getMaksymalnaWagaPaczki() {
        return maksymalnaWagaPaczki;
    }

    public void setMaksymalnaWagaPaczki(Integer maksymalnaWagaPaczki) {
        this.maksymalnaWagaPaczki = maksymalnaWagaPaczki;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Boolean getCzyWyroznic() {
        return czyWyroznic;
    }

    public void setCzyWyroznic(Boolean czyWyroznic) {
        this.czyWyroznic = czyWyroznic;
    }

    public Set<ZgloszenieOferty> getZgloszeniaOferty() {
        return zgloszeniaOferty;
    }

    public void setZgloszeniaOferty(Set<ZgloszenieOferty> zgloszeniaOferty) {
        this.zgloszeniaOferty = zgloszeniaOferty;
    }
}
