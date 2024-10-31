package edu.escuelaing.arep.controller;

import edu.escuelaing.arep.model.SearchList;
import edu.escuelaing.arep.service.LinearSearchConnection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("linear")
public class LinearSearchController {
    @GetMapping
    public String getLinearSearch(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 10; i++) list.add(i);
        try {
            return LinearSearchConnection.connection(list, 9);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
