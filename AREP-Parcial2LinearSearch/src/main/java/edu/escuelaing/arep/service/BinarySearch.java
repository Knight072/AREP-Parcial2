package edu.escuelaing.arep.service;

import edu.escuelaing.arep.model.SearchList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class BinarySearch {

    public SearchList getSearchList(ArrayList<Integer> values, Integer value) {
        // Ordenar la lista para la búsqueda binaria
        Collections.sort(values);

        Integer output = binarySearch(values, value);

        // Crear y devolver el objeto SearchList
        SearchList searchList = new SearchList("binarySearch", values, value, output);
        return searchList;
    }

    private Integer binarySearch(ArrayList<Integer> values, Integer value) {
        int left = 0;
        int right = values.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Verifica si el valor está en el medio
            if (values.get(mid).equals(value)) {
                return mid;
            }

            // Si el valor es mayor, ignora la mitad izquierda
            if (values.get(mid) < value) {
                left = mid + 1;
            }
            // Si el valor es menor, ignora la mitad derecha
            else {
                right = mid - 1;
            }
        }

        // Si no se encuentra el valor, devuelve null
        return null;
    }
}
