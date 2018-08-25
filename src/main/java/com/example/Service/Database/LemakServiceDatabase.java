package com.example.Service.Database;

import com.example.DAO.LemakMapper;
import com.example.Model.LemakModel;
import com.example.Service.LemakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LemakServiceDatabase implements LemakService {
    @Autowired
    LemakMapper lemakMapper;

    @Override
    public List<LemakModel> getAllLemak() {
        return lemakMapper.getAllLemak();
    }

    @Override
    public void addLemak(LemakModel lemakModel) {
        lemakMapper.addLemak(lemakModel);
    }
}
