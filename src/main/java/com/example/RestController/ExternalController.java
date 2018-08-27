package com.example.RestController;

import com.example.Model.ExternalModel;
import com.example.Service.ExternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExternalController {
    @Autowired
    ExternalService externalService;

    @PostMapping("/external/add")
    public ExternalModel add(@RequestBody ExternalModel externalModel){
        externalService.addExternal(externalModel);
        return externalModel;
    }

    @GetMapping("/external/all")
    public ResponseEntity<Object> getAll(){
        Map<String, Object> responseJSON = new LinkedHashMap<>();
        try {
            List<ExternalModel> list = externalService.getAllExternal();
            System.out.println(list);
            if(list.size() == 0) {
                responseJSON.put("status", HttpStatus.NOT_FOUND.value());
                responseJSON.put("msg", "tidak ada makanan external");
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
}
