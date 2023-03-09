package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class utworTest {

    @Test
    void czasTrwania() {
        utwor utwor = new utwor("Rolling Stones", 4, 24);
        Assertions.assertEquals("4:24", utwor.czasTrwania());
    }

    @Test
    void poprawneUstawienieTytulu() {
        utwor utwor = new utwor("012345678901234567890123456789Rolling Stones", 4, 24);
        Assertions.assertEquals("012345678901234567890123456789", utwor.getTytul());
    }

    @Test
    void poprawneUstawienieWykonawcy() {
        utwor utwor = new utwor("Paint in black", 3, 40);
        utwor.setWykonawca("01234567890123456789");
        Assertions.assertEquals("01234567890123456789", utwor.getWykonawca());
    }

    @Test
    void czas() {
        utwor utwor = new utwor("Paint in black", 3, 40);
        Assertions.assertEquals(220, utwor.getCzas());
    }

    @Test
    void konstruktor() {
        utwor utwor = new utwor("012345678901234567890123456789Paint in black", 0, 0);
        Assertions.assertEquals("012345678901234567890123456789", utwor.getTytul());
        Assertions.assertEquals(1, utwor.getCzas());
    }

    @Test
    void poprawnyToString() {
        utwor utwor = new utwor("Paint in black", 3, 40);
        utwor.setWykonawca("Rolling Stones");
        Assertions.assertEquals("Tytuł: Paint in black Wykonawca: Rolling Stones czas trwania: 3:40", utwor.toString());
    }
}