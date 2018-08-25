package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.StudentMapper;

import lombok.extern.slf4j.Slf4j;


@Service
public class StudentServiceDatabase implements StudentService
{

    @Autowired
    StudentMapper studentMapper;

    @Override
    public String test ()
    {
        return studentMapper.test();
    }
}
