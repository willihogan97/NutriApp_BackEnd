package com.example.DAO;

import com.example.Model.BuahGulaModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BuahGulaMapper {
    @Insert("Insert into tblbuahgula (id, nama, tipe, urt, karbohidrat, protein, lemak, kalori) values " + "(#{id}, #{nama}, " +
            "#{tipe}, #{urt}, #{karbohidrat}, #{protein}, #{lemak}, #{kalori})")
    void addBuahGula(BuahGulaModel buahGulaModel);

    @Select("Select * from tblbuahgula")
    List<BuahGulaModel> getAllBuahGula();

}
