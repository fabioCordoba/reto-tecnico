package com.training.retotecnico.web.controller;

import com.training.retotecnico.domain.Spercraft;
import com.training.retotecnico.domain.service.SpercraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spercraft")
public class SpercraftController {

    @Autowired
    private SpercraftService spercraftService;

    @GetMapping("/all")
    public ResponseEntity<List<Spercraft>> getAll(){
        return new ResponseEntity<>(spercraftService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Spercraft> getSpercraft(@PathVariable("id") int spercraftId){
        return spercraftService.getUser(spercraftId)
                .map(spercraft -> new ResponseEntity<>(spercraft, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("save")
    public ResponseEntity<Spercraft> save(@RequestBody Spercraft spercraft){
        return new ResponseEntity<>(spercraftService.save(spercraft), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{spercraftId}")
    public ResponseEntity delete(@PathVariable("spercraftId") int spercraftId){
        if(spercraftService.delete(spercraftId)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
