package com.example.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SusuModel {
    private int id;
    private String nama;
    private int tipe;
    private String urt;
    private double karbohidrat;
    private double protein;
    private double lemak;
    private double kalori;
}
