package edu.escuelaing.arep.controller;

import edu.escuelaing.arep.model.SearchList;
import edu.escuelaing.arep.service.LinearSearchConnection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("linear")
public class LinearSearchController {
    @GetMapping
    public String getLinearSearch() {
        try {
            return LinearSearchConnection.connection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
