package com.company;

import java.util.Scanner;

public class TestyJednostkoweMuzyka {
    static public String tytul;
    static public String wykonawca;
    static public Integer minuty;
    static public Integer sekundy;

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Podaj tytuł utworu: ");
        tytul = scanner.nextLine();
        System.out.print("Podaj wykonawcę utworu: ");
        wykonawca = scanner.nextLine();
        System.out.print("Podaj ile minut trwa utwór: ");
        minuty = scanner.nextInt();
        System.out.print("Podaj ile sekund trwa utwór: ");
        sekundy = scanner.nextInt();

        utwor utwor = new utwor(tytul, minuty, sekundy);
        utwor.setWykonawca(wykonawca);
        System.out.println(utwor.toString());

    }
}