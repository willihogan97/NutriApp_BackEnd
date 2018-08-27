package com.example.DAO;

import com.example.Model.ExternalModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ExternalMapper {
    @Insert("Insert into tblexternal (id, nama, tipe, urt, karbohidrat, protein, lemak, kalori) values " + "(#{id}, #{nama}, " +
            "#{tipe}, #{urt}, #{karbohidrat}, #{protein}, #{lemak}, #{kalori})")
    void addExternal(ExternalModel externalModel);

    @Select("Select * from tblexternal")
    List<ExternalModel> getAllExternal();

}
