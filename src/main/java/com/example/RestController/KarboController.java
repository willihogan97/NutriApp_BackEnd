package com.example.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Service.StudentService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KarboController
{
    @Autowired
    StudentService studentDAO;


    @RequestMapping("/asd")
    public String index (Model model)
    {

        String asdf = studentDAO.test();
        System.out.println(asdf);
        model.addAttribute(asdf);
        return "index";
    }
}
