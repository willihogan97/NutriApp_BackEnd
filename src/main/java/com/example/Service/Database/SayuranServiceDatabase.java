package com.example.Service.Database;

import com.example.DAO.SayuranMapper;
import com.example.Model.SayuranModel;
import com.example.Service.SayuranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SayuranServiceDatabase implements SayuranService {
    @Autowired
    SayuranMapper sayuranMapper;

    @Override
    public List<SayuranModel> getAllSayuran() {
        return sayuranMapper.getAllSayuran();
    }

    @Override
    public void addSayuran(SayuranModel sayuranModel) {
        sayuranMapper.addSayuran(sayuranModel);
    }
}
