package com.example.Service.Database;

import com.example.DAO.BuahGulaMapper;
import com.example.Model.BuahGulaModel;
import com.example.Service.BuahGulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuahGulaServiceDatabase implements BuahGulaService {
    @Autowired
    BuahGulaMapper buahGulaMapper;

    @Override
    public List<BuahGulaModel> getAllBuahGula() {
        return buahGulaMapper.getAllBuahGula();
    }

    @Override
    public void addBuahGula(BuahGulaModel buahGulaModel) {
        buahGulaMapper.addBuahGula(buahGulaModel);
    }
}
