package com.example.DAO;

import com.example.Model.LemakModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface LemakMapper {
    @Insert("Insert into tbllemak (id, nama, tipe, urt, karbohidrat, protein, lemak, kalori) values " + "(#{id}, #{nama}, " +
            "#{tipe}, #{urt}, #{karbohidrat}, #{protein}, #{lemak}, #{kalori})")
    void addLemak(LemakModel lemakModel);

    @Select("Select * from tbllemak")
    List<LemakModel> getAllLemak();

}
