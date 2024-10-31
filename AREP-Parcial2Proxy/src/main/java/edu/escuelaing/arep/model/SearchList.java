package edu.escuelaing.arep.model;

import java.util.ArrayList;


public class SearchList {
    private final String operation = "linearSearch";
    private ArrayList<Integer> inputList;
    private Integer value;
    private Integer output;

    public SearchList(ArrayList<Integer> intputList, Integer value) {
        this.inputList = intputList;
        this.value = value;
    }

    public String getOperation(){
        return operation;
    }
    public ArrayList<Integer> getInputList(){
        return inputList;
    }

    public Integer getValue(){
        return value;
    }

    public Integer getOutput(){
        return output;
    }

}

