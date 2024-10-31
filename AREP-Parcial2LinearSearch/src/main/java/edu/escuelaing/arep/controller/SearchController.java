package edu.escuelaing.arep.controller;

import edu.escuelaing.arep.model.SearchList;
import edu.escuelaing.arep.service.LinearSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SearchController {
    private LinearSearch linearSearch;

    @Autowired
    public SearchController(LinearSearch linearSearch) {
        this.linearSearch = linearSearch;
    }

    @GetMapping("search")
    public SearchList getLinearSearch(@RequestParam ArrayList<Integer> list, @RequestParam String value) {
        return linearSearch.getSearchList(list, 2);
    }
}
