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

    @Delete("Delete from tblparenteral where id = #{id}")
    void deleteParenteral(int id);

    @Update("Update tblparenteral set nama = #{nama}, karbohidrat = #{karbohidrat}, protein = #{protein}, " +
            "lemak = #{lemak}, elektrolit = #{elektrolit}, kalori = #{kalori} where id = #{id}")
    void updateParenteral(ParenteralModel parenteralModel);

}
