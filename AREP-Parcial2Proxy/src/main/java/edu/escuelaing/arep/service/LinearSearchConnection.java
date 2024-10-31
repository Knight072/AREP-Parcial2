package edu.escuelaing.arep.service;

import edu.escuelaing.arep.model.SearchList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class LinearSearchConnection {

    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "http://localhost:8081/search";

    private static final String list = "?list=";
    private static final String value = "&value=";

    public static String connection(ArrayList<Integer> Arraylist, Integer SearchValue) throws IOException {
        String searchList = Arraylist.toString().replaceAll("]", "");
        searchList = searchList.replace("[", "");
        searchList = searchList.replace(" ", "");
        URL obj = new URL(GET_URL+list+searchList+value+SearchValue);
        System.out.println(obj.toString());
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            return response.toString();
        } else {
            System.out.println("GET request not worked");
        }
        return null;
    }

}
