package com.example.Service.Database;

import com.example.DAO.ParenteralMapper;
import com.example.Model.ParenteralModel;
import com.example.Service.ParenteralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParenteralServiceDatabase implements ParenteralService {
    @Autowired
    ParenteralMapper parenteralMapper;

    @Override
    public List<ParenteralModel> getAllParenteral() {
        return parenteralMapper.getAllParenteral();
    }

    @Override
    public void addParenteral(ParenteralModel parenteralModel) {
        parenteralMapper.addParenteral(parenteralModel);
    }

    @Override
    public void deleteParenteral(int id) { parenteralMapper.deleteParenteral(id); }

    @Override
    public void updateParenteral(ParenteralModel parenteralModel) { parenteralMapper.updateParenteral(parenteralModel); }
}
