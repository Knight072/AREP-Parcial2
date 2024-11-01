package edu.escuelaing.arep.service;

import edu.escuelaing.arep.model.SearchList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LinearSearch {
    public SearchList getSearchList(ArrayList<Integer> values, Integer value) {
        Integer output = null;
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) == value) {
                output = i;
                break;
            }
        }
        SearchList searchList = new SearchList("linearSearch", values, value, output);
        return searchList;
    }
}
