package com.magicalsolutions.fastcourier.fastcourier.Controller;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.magicalsolutions.fastcourier.fastcourier.Model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

@RestController
public class CustomRestController {

    @Value( "${jdbc.url}" )
    private String jdbcUrl;

    @RequestMapping("/greeting")
    public String greeting() {
        Connection connection = null;

        ArrayList<User> users = new ArrayList<>();
        try {
            connection = DriverManager.getConnection(jdbcUrl);
            String schema = connection.getSchema();
            System.out.println("Successful connection - Schema: " + schema);

            // Create and execute a SELECT SQL statement.
            String selectSql = "SELECT firstName, lastName "
                    + "FROM users ";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectSql)) {

                // Print results from select statement
                while (resultSet.next())
                {
                    users.add(new User(resultSet.getString(1), resultSet.getString(2)));
                }
                connection.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        StringWriter sw = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        MappingJsonFactory jsonFactory = new MappingJsonFactory();
        JsonGenerator jsonGenerator = null;
        try {
            jsonGenerator = jsonFactory.createJsonGenerator(sw);
            mapper.writeValue(jsonGenerator, users);

            return sw.getBuffer().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "{}";
    }
}
