package com.example.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParenteralModel {
    private int id;
    private String nama;
    private double volume;
    private double karbohidrat;
    private double protein;
    private double lemak;
    private double elektrolit;
    private double kalori;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getKarbohidrat() {
        return karbohidrat;
    }

    public void setKarbohidrat(double karbohidrat) {
        this.karbohidrat = karbohidrat;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getLemak() {
        return lemak;
    }

    public void setLemak(double lemak) {
        this.lemak = lemak;
    }

    public double getElektrolit() {
        return elektrolit;
    }

    public void setElektrolit(double elektrolit) {
        this.elektrolit = elektrolit;
    }

    public double getKalori() {
        return kalori;
    }

    public void setKalori(double kalori) {
        this.kalori = kalori;
    }

    public double getVolume() { return volume; }

    public void setVolume(double volume) { this.volume = volume; }
}
