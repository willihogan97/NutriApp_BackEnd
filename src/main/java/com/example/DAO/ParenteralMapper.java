package com.example.DAO;

import com.example.Model.ParenteralModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ParenteralMapper {
    @Insert("Insert into tblparenteral (nama, karbohidrat, protein, lemak, elektrolit, kalori) values " + "(#{nama}, " +
            "#{karbohidrat}, #{protein}, #{lemak}, #{elektrolit}, #{kalori})")
    void addParenteral(ParenteralModel parenteralModel);

    @Select("Select * from tblparenteral")
    List<ParenteralModel> getAllParenteral();

}
