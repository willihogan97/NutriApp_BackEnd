package com.example.Service;

import com.example.Model.SusuModel;

import java.util.List;

public interface SusuService {
    List<SusuModel> getAllSusu();
    void addSusu(SusuModel susuModel);
}
