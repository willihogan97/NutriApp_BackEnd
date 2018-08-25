package com.example.Service.Database;

import com.example.DAO.SusuMapper;
import com.example.Model.SusuModel;
import com.example.Service.SusuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SusuServiceDatabase implements SusuService {
    @Autowired
    SusuMapper susuMapper;

    @Override
    public List<SusuModel> getAllSusu() {
        return susuMapper.getAllSusu();
    }

    @Override
    public void addSusu(SusuModel susuModel) {
        susuMapper.addSusu(susuModel);
    }
}
