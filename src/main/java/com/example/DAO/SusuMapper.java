package com.example.DAO;

import com.example.Model.SusuModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SusuMapper {
    @Insert("Insert into tblsusu (id, nama, tipe, urt, karbohidrat, protein, lemak, kalori) values " + "(#{id}, #{nama}, " +
            "#{tipe}, #{urt}, #{karbohidrat}, #{protein}, #{lemak}, #{kalori})")
    void addSusu(SusuModel susuModel);

    @Select("Select * from tblsusu")
    List<SusuModel> getAllSusu();

}
