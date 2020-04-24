package edu.ucmo.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/jsonservlet")
public class JSONServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    // This will store all received articles
    List<MyArticle> articles = new LinkedList<MyArticle>();

    /***************************************************
     * URL: /jsonservlet
     * doPost(): receives JSON data, parse it, map it and send back as JSON
     ****************************************************/
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{

        // 1. get received JSON data from request
        BufferedReader br =
                new BufferedReader(new InputStreamReader(request.getInputStream()));

        String json = "";
        if(br != null){
            json = br.readLine();
            System.out.println("Received JSON: " + json);
        }

        // 2. initiate jackson mapper
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // 3. Convert received JSON to Article
        MyArticle myArticle = mapper.readValue(json, MyArticle.class);

        System.out.println(myArticle.toString());
    }
}
