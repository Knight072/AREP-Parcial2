package edu.escuelaing.arep.model;

import java.util.ArrayList;


public class SearchList {
    private String operation;
    private ArrayList<Integer> inputList;
    private Integer value;
    private Integer output;

    public SearchList(String operation, ArrayList<Integer> intputList, Integer value, Integer output) {
        this.operation = operation;
        this.inputList = intputList;
        this.value = value;
        this.output = output;
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

    public void setOutput(Integer output){
        this.output = output;
    }

}

