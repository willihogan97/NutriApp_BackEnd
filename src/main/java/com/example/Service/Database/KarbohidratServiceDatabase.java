package com.example.Service.Database;

import com.example.DAO.KarbohidratMapper;
import com.example.Model.KarbohidratModel;
import com.example.Service.KarbohidratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KarbohidratServiceDatabase implements KarbohidratService {
    @Autowired
    KarbohidratMapper karbohidratMapper;

    @Override
    public List<KarbohidratModel> getAllKarbohidrat() {
        return karbohidratMapper.getAllKarbohidrat();
    }

    @Override
    public void addKarbohidrat(KarbohidratModel karbohidratModel) {
        karbohidratMapper.addKarbohidrat(karbohidratModel);
    }
}
