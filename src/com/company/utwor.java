package com.company;

public class utwor {
    private String tytul;
    private String wykonawca;
    private Integer czas;

    public utwor(String tytul, Integer minuty, Integer sekundy) {
        this.setTytul(tytul);
        this.wykonawca = "nieznany";
        this.czas = minuty * 60 + sekundy;
        this.setCzas(this.czas);
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        if (tytul.length()>30){
            this.tytul = tytul.substring(0, 30);
        } else {
            this.tytul = tytul;
        }
    }

    public String getWykonawca() {
        return wykonawca;
    }

    public void setWykonawca(String wykonawca) {
        if (wykonawca.length()>20){
            this.wykonawca = wykonawca.substring(0, 20);
        } else {
            this.wykonawca = wykonawca;
        }
    }

    public Integer getCzas() {
        return czas;
    }

    public void setCzas(Integer czas) {
        if (czas<=0){
            this.czas = 1;
        }
        this.czas = czas;
    }
    public String czasTrwania(){
        int minuty = this.czas / 60;
        int sekundy = this.czas % 60;
        return minuty + ":" + sekundy;
    }
    @Override
    public String toString(){
        return
                "Tytuł: " + tytul + " Wykonawca: " + wykonawca +
                        " czas trwania: " + this.czasTrwania();
    }
}
