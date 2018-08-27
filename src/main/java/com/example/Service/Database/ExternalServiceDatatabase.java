package com.example.Service.Database;

import com.example.DAO.ExternalMapper;
import com.example.Model.ExternalModel;
import com.example.Service.ExternalService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ExternalServiceDatatabase implements ExternalService {
    @Autowired
    ExternalMapper externalMapper;

    @Override
    public void addExternal(ExternalModel externalModel) {
        externalMapper.addExternal(externalModel);
    }

    @Override
    public List<ExternalModel> getAllExternal() {
        return externalMapper.getAllExternal();
    }
}
