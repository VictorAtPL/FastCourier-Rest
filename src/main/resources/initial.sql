INSERT INTO uzytkownicy(login, data_urodzenia, email, haslo, imie, miejscowosc, nazwisko, numer_telefonu, rola, ulica, wojewodztwo, zablokowany) VALUES ('admin', '1995-10-02 00:00:00.000', 'p.podbielski@gmail.com', 'pass', 'Piotr', 'Warszawa', 'Podbielski', '123456789', 'ROLE_ADMIN', 'ul. 3 Maja 13', 'mazowieckie', 0), ('marcinexxx', '1995-10-02 00:00:00.000', 'p.podbielski@gmail.com', 'pass', 'Marcin', 'Warszawa', 'Marcinkowski', '123456789', 'ROLE_USER', 'ul. 3 Maja 13', 'mazowieckie', 0), ('adamexxx', '1995-10-02 00:00:00.000', 'p.podbielski@gmail.com', 'pass', 'Adam', 'Warszawa', 'R.', '123456789', 'ROLE_USER', 'ul. 3 Maja 13', 'mazowieckie', 1);

INSERT INTO oferty(cena_maksymalna, aktywna, cena_minimalna, czy_wyroznic, data_wyjazdu, godzina_wyjazdu, kategorie_paczek, maksymalna_waga_paczki, miasto_docelowe, miasto_poczatkowe, opis, rozmiary_paczek, tytul, zablokowana, uzytkownik_id) VALUES (100.00, 1, 10.00, 1, '2017-12-18 00:00:00.000', '2017-12-18 14:00:00.000', 'szkło', NULL, 'Warszawa', 'Kraków', 'Brak opisu, który musi mieć min. 40 znaków.', 'duża', 'Tytuł oferty dłuższy', 0, 'marcinexxx');

INSERT INTO zgloszenia_oferty(data_dodania, powod, przeczytane, tresc, oferta_id) VALUES ('2017-12-18 14:00:00.000', 'Inny', 0, 'Przykładowa treść', SCOPE_IDENTITY());

INSERT INTO oferty (cena_maksymalna, aktywna, cena_minimalna, czy_wyroznic, data_wyjazdu, godzina_wyjazdu, kategorie_paczek, maksymalna_waga_paczki, miasto_docelowe, miasto_poczatkowe, opis, rozmiary_paczek, tytul, zablokowana, uzytkownik_id) VALUES (25, 1, 15, 0, '2018-12-21 00:00:00.000', '1970-01-01 15:00:00.000', 'żywność,szkło,zwierzęta,rośliny', 25, 'Warszawa', 'Kraków', 'Szybkie przejazdy z KRK do WWY samochodem marki Mercedes-Benz.', 'mała,srednia,duża', 'Szybkie przejazdy z KRK do WWY', 0, 'marcinexxx');


INSERT INTO zlecenia_transportu (data_zlecenia, kategoria_paczki, komentarz, rozmiar_paczki, waga_paczki, oferta_id, uzytkownik_id) VALUES ('2018-12-20 00:00:00.000', 'zwierzęta', '', 'duża', 123, SCOPE_IDENTITY(), 'marcinexxx');

INSERT INTO powiadomienia (data_dodania, id_typu_powiadomienia, przeczytane, typ_powiadomienia, uzytkownik_id) VALUES ('2017-12-21 00:00:00.000', CONVERT(varchar(255), SCOPE_IDENTITY()), 0, 'ZLECONO_TRANSPORT_PRZESYLKI', 'marcinexxx');


INSERT INTO oferty (cena_maksymalna, aktywna, cena_minimalna, czy_wyroznic, data_wyjazdu, godzina_wyjazdu, kategorie_paczek, maksymalna_waga_paczki, miasto_docelowe, miasto_poczatkowe, opis, rozmiary_paczek, tytul, zablokowana, uzytkownik_id) VALUES (25, 1, 15, 0, '2018-12-21 00:00:00.000', '1970-01-01 15:00:00.000', 'żywność,szkło,zwierzęta,rośliny', 25, 'Warszawa', 'Kraków', 'Zablokowana', 'mała,srednia,duża', 'Zablokowana', 1, 'adamexxx');

INSERT INTO oferty (cena_maksymalna, aktywna, cena_minimalna, czy_wyroznic, data_wyjazdu, godzina_wyjazdu, kategorie_paczek, maksymalna_waga_paczki, miasto_docelowe, miasto_poczatkowe, opis, rozmiary_paczek, tytul, zablokowana, uzytkownik_id) VALUES (25, 0, 15, 0, '2018-12-21 00:00:00.000', '1970-01-01 15:00:00.000', 'żywność,szkło,zwierzęta,rośliny', 25, 'Warszawa', 'Kraków', 'Nieaktywna', 'mała,srednia,duża', 'Nieaktywna', 0, 'adamexxx');

INSERT INTO oferty (cena_maksymalna, aktywna, cena_minimalna, czy_wyroznic, data_wyjazdu, godzina_wyjazdu, kategorie_paczek, maksymalna_waga_paczki, miasto_docelowe, miasto_poczatkowe, opis, rozmiary_paczek, tytul, zablokowana, uzytkownik_id) VALUES (25, 0, 15, 0, '2018-12-21 00:00:00.000', '1970-01-01 15:00:00.000', 'żywność,szkło,zwierzęta,rośliny', 25, 'Warszawa', 'Kraków', 'Nieaktywna i zablokowana', 'mała,srednia,duża', 'Nieaktywna i zablokowana', 1, 'adamexxx');

INSERT INTO zgloszenia_uzytkownikow(data_dodania, powod, przeczytane, tresc, uzytkownik_id) VALUES ('2017-12-18 14:00:00.000', 'Inny', 0, 'Przykładowa treść', 'marcinexxx');

INSERT INTO uwagi(powod, tresc) VALUES ('Przykładowy powód', 'Przykładowa treść');