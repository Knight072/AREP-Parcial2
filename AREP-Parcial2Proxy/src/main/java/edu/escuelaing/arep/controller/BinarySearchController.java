package edu.escuelaing.arep.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("binary")
public class BinarySearchController {
    @GetMapping
    public String getLinearSearch(){
        return "Hola";
    }
}
