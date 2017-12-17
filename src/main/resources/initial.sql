
INSERT INTO uzytkownicy(login, data_urodzenia, email, haslo, imie, miejscowosc, nazwisko, numer_telefonu, rola, ulica, wojewodztwo) VALUES ('admin', '1995-10-02 00:00:00.000', 'p.podbielski@gmail.com', 'pass', 'Piotr', 'Warszawa', 'Podbielski', '123456789', 'ROLE_ADMIN', 'ul. 3 Maja 13', 'mazowieckie'), ('marcinexxx', '1995-10-02 00:00:00.000', 'p.podbielski@gmail.com', 'pass', 'Marcin', 'Warszawa', 'Marcinkowski', '123456789', 'ROLE_USER', 'ul. 3 Maja 13', 'mazowieckie');

INSERT INTO oferty(cena_maksymalna, cena_minimalna, czy_wyroznic, data_wyjazdu, godzina_wyjazdu, kategorie_paczek, maksymalna_waga_paczki, miasto_docelowe, miasto_poczatkowe, opis, rozmiary_paczek, tytul, uzytkownik_id) VALUES (100, 10, 1, '2017-12-18 00:00:00.000', '2017-12-18 14:00:00.000', 'szkło', NULL, 'Warszawa', 'Kraków', 'Brak opisu, który musi mieć min. 40 znaków.', 'duża', 'Tytuł oferty dłuższy', 'marcinexxx');

INSERT INTO zgloszenia_oferty(powod, tresc, oferta_id) VALUES ('Inny', 'Przykładowa treść', SCOPE_IDENTITY());

INSERT INTO zgloszenia_uzytkownikow(powod, tresc, uzytkownik_id) VALUES ('Inny', 'Przykładowa treść', 'marcinexxx');

INSERT INTO uwagi(powod, tresc) VALUES ('Przykładowy powód', 'Przykładowa treść');