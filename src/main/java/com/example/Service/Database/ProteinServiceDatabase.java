package com.example.Service.Database;

import com.example.DAO.ProteinMapper;
import com.example.Model.ProteinModel;
import com.example.Service.ProteinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProteinServiceDatabase implements ProteinService {
    @Autowired
    ProteinMapper proteinMapper;

    @Override
    public List<ProteinModel> getAllProtein() {
        return proteinMapper.getAllProtein();
    }

    @Override
    public void addProtein(ProteinModel proteinModel) {
        proteinMapper.addProtein(proteinModel);
    }
}
