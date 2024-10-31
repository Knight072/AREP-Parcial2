package edu.escuelaing.arep.controller;

import edu.escuelaing.arep.model.SearchList;
import edu.escuelaing.arep.service.LinearSearchConnection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping
public class LinearSearchController {
    @GetMapping("linear")
    public String getLinearSearch(@RequestParam ArrayList<Integer> list, @RequestParam Integer value){
        ArrayList<Integer> alist = new ArrayList<>();
        for(int i = 0; i <= 10; i++) list.add(i);
        try {
            return LinearSearchConnection.connection(alist, 9);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
