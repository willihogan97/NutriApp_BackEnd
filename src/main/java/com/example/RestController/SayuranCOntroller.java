package com.example.RestController;

import com.example.Model.SayuranModel;
import com.example.Service.SayuranService;
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
public class SayuranCOntroller {

    @Autowired
    SayuranService sayuranService;

    @GetMapping("/sayuran/all")
    public ResponseEntity<Object> getAll(Model model){
        Map<String, Object> responseJSON = new LinkedHashMap<>();
        try {
            List<SayuranModel> list = sayuranService.getAllSayuran();
            System.out.println(list);
            if(list.size() == 0) {
                responseJSON.put("status", HttpStatus.NOT_FOUND.value());
                responseJSON.put("msg", "tidak ada sayuran");
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

    @PostMapping("/sayuran/add")
    public SayuranModel add(@ModelAttribute SayuranModel sayuranModel, Model model){
        sayuranService.addSayuran(sayuranModel);
        return sayuranModel;
    }

}
