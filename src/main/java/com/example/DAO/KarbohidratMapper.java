package com.example.DAO;

import com.example.Model.KarbohidratModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface KarbohidratMapper {
    @Insert("Insert into tblkarbohidrat (id, nama, tipe, urt, karbohidrat, protein, lemak, kalori) values " + "(#{id}, #{nama}, " +
            "#{tipe}, #{urt}, #{karbohidrat}, #{protein}, #{lemak}, #{kalori})")
    void addKarbohidrat(KarbohidratModel karbohidratModel);

    @Select("Select * from tblkarbohidrat")
    List<KarbohidratModel> getAllKarbohidrat();

}
