package edu.escuelaing.arep.controller;

import edu.escuelaing.arep.model.SearchList;
import edu.escuelaing.arep.service.BinarySearch;
import edu.escuelaing.arep.service.LinearSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping
public class SearchController {
    private LinearSearch linearSearch;
    private BinarySearch binarySearch;

    @Autowired
    public SearchController(LinearSearch linearSearch, BinarySearch binarySearch) {
        this.linearSearch = linearSearch;
        this.binarySearch = binarySearch;
    }

    @GetMapping("linearsearch")
    public SearchList getLinearSearch(@RequestParam ArrayList<Integer> list, @RequestParam Integer value) {
        return linearSearch.getSearchList(list, value);
    }

    @GetMapping("binarysearch")
    public SearchList getBinarySearch(@RequestParam ArrayList<Integer> list, @RequestParam Integer value) {
        return binarySearch.getSearchList(list, value);
    }
}
