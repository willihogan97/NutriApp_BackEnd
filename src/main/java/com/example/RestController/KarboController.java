package com.example.RestController;

import com.example.Model.KarbohidratModel;
import com.example.Service.KarbohidratService;
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
public class KarboController
{
    @Autowired
    KarbohidratService karbohidratService;

    @GetMapping("/karbohidrat/all")
    public ResponseEntity<Object> getAll(Model model){
        Map<String, Object> responseJSON = new LinkedHashMap<>();
        try {
            List<KarbohidratModel> list = karbohidratService.getAllKarbohidrat();
            System.out.println(list);
            if(list.size() == 0) {
                responseJSON.put("status", HttpStatus.NOT_FOUND.value());
                responseJSON.put("msg", "tidak ada makanan karbohidrat");
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

    @PostMapping("/karbohidrat/add")
    public KarbohidratModel add(@RequestBody KarbohidratModel karbohidratModel, Model model){
        karbohidratService.addKarbohidrat(karbohidratModel);
        return karbohidratModel;
    }
}
