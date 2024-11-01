package edu.escuelaing.arep.controller;

import edu.escuelaing.arep.model.SearchList;
import edu.escuelaing.arep.service.LinearSearchConnection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("search")
public class LinearSearchController {
    @GetMapping
    public SearchList getLinearSearch(@RequestParam ArrayList<Integer> list, @RequestParam Integer value, @RequestParam String searchType){
        try {
            return LinearSearchConnection.connection(list, value, searchType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
