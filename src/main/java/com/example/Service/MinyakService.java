package com.example.Service;

import com.example.Model.MinyakModel;

import java.util.List;

public interface MinyakService {
    List<MinyakModel> getAllMinyak();
    void addMinyak(MinyakModel minyakModel);
}
