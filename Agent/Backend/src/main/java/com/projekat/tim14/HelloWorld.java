package com.projekat.tim14;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/pozdrav")
public class HelloWorld {

    @GetMapping(value = "/masa")
    public ResponseEntity<String> pozdrav(){
        String ime = "masa";
        return new ResponseEntity<>(ime, HttpStatus.OK) ;
    }

}
