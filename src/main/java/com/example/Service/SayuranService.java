package com.example.Service;

import com.example.Model.SayuranModel;

import java.util.List;

public interface SayuranService {
    List<SayuranModel> getAllSayuran();
    void addSayuran(SayuranModel sayuranModel);
}
