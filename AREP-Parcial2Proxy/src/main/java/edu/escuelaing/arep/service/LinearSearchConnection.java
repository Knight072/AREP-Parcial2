package edu.escuelaing.arep.service;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import edu.escuelaing.arep.model.SearchList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LinearSearchConnection {

    private static final String USER_AGENT = "Mozilla/5.0";
    private static final List<String> SEARCH_SERVERS = List.of(
            "http://localhost:8081",
            "http://localhost:8082"
    );
    private static int roundRobinIndex = 0;

    private static final String LIST_PARAM = "?list=";
    private static final String VALUE_PARAM = "&value=";

    public static SearchList connection(ArrayList<Integer> arrayList, Integer searchValue, String searchType) throws IOException {
        SearchList searchListResult = null;
        // Construir la cadena de búsqueda
        String searchList = arrayList.toString().replaceAll("]", "").replace("[", "").replace(" ", "");

        // Seleccionar la URL usando Round Robin
        String currentUrl = SEARCH_SERVERS.get(roundRobinIndex);
        roundRobinIndex = (roundRobinIndex + 1) % SEARCH_SERVERS.size(); // Actualiza el índice para Round Robin

        URL obj = new URL(currentUrl + searchType + LIST_PARAM + searchList + VALUE_PARAM + searchValue);
        System.out.println("Connecting to: " + obj.toString());
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            try {
                Gson gson = new Gson();
                searchListResult = gson.fromJson(response.toString(), SearchList.class);

                // Verificar que se creó correctamente
                System.out.println("Operation: " + searchListResult.getOperation());
                System.out.println("Input List: " + searchListResult.getInputList());
                System.out.println("Search Value: " + searchListResult.getValue());
                System.out.println("Output: " + searchListResult.getOutput());

            } catch (JsonSyntaxException e) {
                System.out.println("Error al parsear JSON: " + e.getMessage());
            }

        } else {
            System.out.println("GET request did not work");
        }

        // Devolver el objeto SearchList actualizado
        return searchListResult;
    }
}
