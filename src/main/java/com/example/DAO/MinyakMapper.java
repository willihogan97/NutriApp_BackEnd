package com.example.DAO;

import com.example.Model.MinyakModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MinyakMapper {
    @Insert("Insert into tblminyak (id, nama, tipe, urt, karbohidrat, protein, lemak, kalori) values " + "(#{id}, #{nama}, " +
            "#{tipe}, #{urt}, #{karbohidrat}, #{protein}, #{lemak}, #{kalori})")
    void addMinyak(MinyakModel minyakModel);

    @Select("Select * from tblminyak")
    List<MinyakModel> getAllMinyak();
}
