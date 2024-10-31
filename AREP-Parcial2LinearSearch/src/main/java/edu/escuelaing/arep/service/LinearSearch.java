package edu.escuelaing.arep.service;

import edu.escuelaing.arep.model.SearchList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LinearSearch {
    public SearchList getSearchList(ArrayList<Integer> values, Integer value){

        SearchList searchList = new SearchList(values, value);
        System.out.println(searchList);
        return searchList;
    }

}
