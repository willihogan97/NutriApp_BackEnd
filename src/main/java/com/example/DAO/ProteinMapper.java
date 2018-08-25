package com.example.DAO;

import com.example.Model.ProteinModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProteinMapper {
    @Insert("Insert into tblprotein (id, nama, tipe, urt, karbohidrat, protein, lemat, kalori) values " + "(#{id}, #{nama}, " +
            "#{tipe}, #{urt}, #{karbohidrat}, #{protein}, #{lemak}, #{kalori})")
    void addProtein(ProteinModel proteinModel);

    @Select("Select * from tblprotein")
    List<ProteinModel> getAllProtein();
}
