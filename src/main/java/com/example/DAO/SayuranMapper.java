package com.example.DAO;

import com.example.Model.SayuranModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SayuranMapper {
    @Insert("Insert into tblsayuran (id, nama, tipe, urt, karbohidrat, protein, lemak, kalori) values " + "(#{id}, #{nama}, " +
            "#{tipe}, #{urt}, #{karbohidrat}, #{protein}, #{lemak}, #{kalori})")
    void addSayuran(SayuranModel sayuranModel);

    @Select("Select * from tblsayuran")
    List<SayuranModel> getAllSayuran();

}
