package com.example.Service;

import com.example.Model.ProteinModel;

import java.util.List;

public interface ProteinService {
    List<ProteinModel> getAllProtein();
    void addProtein (ProteinModel proteinModel);
}
