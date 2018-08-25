package com.example.DAO;

import com.example.Model.ParenteralModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ParenteralMapper {
    @Insert("Insert into tblparenteral (id, nama, tipe, urt, karbohidrat, protein, lemat, kalori) values " + "(#{id}, #{nama}, " +
            "#{tipe}, #{urt}, #{karbohidrat}, #{protein}, #{lemak}, #{kalori})")
    void addParenteral(ParenteralModel parenteralModel);

    @Select("Select * from tblprotein")
    List<ParenteralModel> getAllParenteral();

}
