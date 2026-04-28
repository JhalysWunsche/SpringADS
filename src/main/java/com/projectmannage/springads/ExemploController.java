package com.projectmannage.springads;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ExemploController {
    @GetMapping("/ok")
    public ResponseEntity<String> sayOk() {
        return ResponseEntity.ok("OK");
    }
    @PostMapping("/echo")
    public ResponseEntity<String>echo(@RequestBody String value){
        StringBuilder sb = new StringBuilder(value);
        return ResponseEntity.ok(sb.reverse().toString());
    }
}
