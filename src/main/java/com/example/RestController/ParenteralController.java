package com.example.RestController;

import com.example.Model.ParenteralModel;
import com.example.Service.ParenteralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ParenteralController {
    @Autowired
    ParenteralService parenteralService;

    @GetMapping("/parenteral/all")
    public ResponseEntity<Object> getAll(){
        Map<String, Object> responseJSON = new LinkedHashMap<>();
        try {
            List<ParenteralModel> list = parenteralService.getAllParenteral();
            System.out.println(list);
            if(list.size() == 0) {
                responseJSON.put("status", HttpStatus.NOT_FOUND.value());
                responseJSON.put("msg", "tidak ada makanan parenteral");
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

    @PostMapping("/parenteral/add")
    public ParenteralModel add(@RequestBody ParenteralModel parenteralModel){
        parenteralService.addParenteral(parenteralModel);
        return parenteralModel;
    }

    @PostMapping("/parenteral/delete/{id}")
    public void delete(@PathVariable(value = "id") int id){
        parenteralService.deleteParenteral(id);
    }

    @PostMapping("/parenteral/update")
    public ParenteralModel update(@RequestBody ParenteralModel parenteralModel){
        parenteralService.updateParenteral(parenteralModel);
        return parenteralModel;
    }
}
