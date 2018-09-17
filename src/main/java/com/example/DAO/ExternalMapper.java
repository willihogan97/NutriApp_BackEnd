package com.example.DAO;

import com.example.Model.ExternalModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ExternalMapper {
    @Insert("Insert into tblexternal (nama, tipe, urt, karbohidrat, protein, lemak, kalori) values " + "(#{nama}, " +
            "#{tipe}, #{urt}, #{karbohidrat}, #{protein}, #{lemak}, #{kalori})")
    void addExternal(ExternalModel externalModel);

    @Select("Select * from tblexternal")
    List<ExternalModel> getAllExternal();

    @Delete("Delete from tblexternal where id = #{id}")
    void deleteExternal(int id);

    @Update("Update tblexternal set nama = #{nama}, tipe = #{tipe}, urt = #{urt}, " +
            "karbohidrat = #{karbohidrat}, protein = #{protein}, lemak = #{lemak}, kalori = #{kalori} where id = #{id}")
    void updateExternal(ExternalModel externalModel);

}
