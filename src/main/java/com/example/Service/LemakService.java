package com.example.Service;

import com.example.Model.LemakModel;

import java.util.List;

public interface LemakService {
    List<LemakModel> getAllLemak();
    void addLemak(LemakModel lemakModel);
}
