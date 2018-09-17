package com.example.Service;

import com.example.Model.ExternalModel;

import java.util.List;

public interface ExternalService {
    void addExternal(ExternalModel externalModel);
    List<ExternalModel> getAllExternal();
    void deleteExternal(int id);
    void updateExternal(ExternalModel externalModel);
}
