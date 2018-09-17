package com.example.Service;

import com.example.Model.ParenteralModel;

import java.util.List;

public interface ParenteralService {
    List<ParenteralModel> getAllParenteral();
    void addParenteral(ParenteralModel parenteralModel);
    void deleteParenteral(int id);
    void updateParenteral(ParenteralModel parenteralModel);
}
