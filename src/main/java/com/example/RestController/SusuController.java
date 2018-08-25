package com.example.RestController;

import com.example.Model.SusuModel;
import com.example.Service.SusuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SusuController {

    @Autowired
    SusuService susuService;

    @GetMapping("/susu/all")
    public ResponseEntity<Object> getAll(Model model){
        Map<String, Object> responseJSON = new LinkedHashMap<>();
        try {
            List<SusuModel> list = susuService.getAllSusu();
            System.out.println(list);
            if(list.size() == 0) {
                responseJSON.put("status", HttpStatus.NOT_FOUND.value());
                responseJSON.put("msg", "tidak ada susu");
            }else {
                responseJSON.put("status", HttpStatus.OK.value());
                responseJSON.put("msg", "success");
                responseJSON.put("result", list);
            }
        }catch (Exception e) {
            e.printStackTrace();
            responseJSON.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
            responseJSON.put("msg", "internal server error");
        }
        return ResponseEntity.status((Integer) responseJSON.get("status")).body(responseJSON);
    }

    @PostMapping("/susu/add")
    public SusuModel add(@ModelAttribute SusuModel susuModel, Model model){
        susuService.addSusu(susuModel);
        return susuModel;
    }
}
