package com.example.DAO;

import org.apache.ibatis.annotations.*;

@Mapper
public interface StudentMapper
{
    @Select("select nama from tblparenteral where id = '1'")
    String test ();
}
