package com.example.DAO;

import com.example.Model.MinyakModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MinyakMapper {
    @Insert("Insert into tblMinyak (id, nama, tipe, urt, karbohidrat, protein, lemat, kalori) values " + "(#{id}, #{nama}, " +
            "#{tipe}, #{urt}, #{karbohidrat}, #{protein}, #{lemak}, #{kalori})")
    void addMinyak(MinyakModel minyakModel);

    @Select("Select * from tblprotein")
    List<MinyakModel> getAllMinyak();
}
