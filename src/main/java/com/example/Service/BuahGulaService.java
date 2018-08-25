package com.example.Service;

import com.example.Model.BuahGulaModel;

import java.util.List;

public interface BuahGulaService {
    List<BuahGulaModel> getAllBuahGula();
    void addBuahGula(BuahGulaModel buahGulaModel);
}
