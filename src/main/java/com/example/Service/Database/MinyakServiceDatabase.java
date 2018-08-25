package com.example.Service.Database;

import com.example.DAO.MinyakMapper;
import com.example.Model.MinyakModel;
import com.example.Service.MinyakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MinyakServiceDatabase implements MinyakService {
    @Autowired
    MinyakMapper minyakMapper;

    @Override
    public List<MinyakModel> getAllMinyak() {
        return minyakMapper.getAllMinyak();
    }

    @Override
    public void addMinyak(MinyakModel minyakModel) {
        minyakMapper.addMinyak(minyakModel);
    }
}
