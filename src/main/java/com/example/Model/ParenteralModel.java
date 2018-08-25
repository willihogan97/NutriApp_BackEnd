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
    private double karbohidrat;
    private double protein;
    private double lemak;
    private double elektrolit;
    private double kalori;
}
