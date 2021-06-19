package day3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by Ibrahim Chowdhury on 19 Jun, 2021
 *
 * Today I will show Json to object and object to json convert using jackson library
 *
 */
public class Day3 {
    public static void main(String[] args) {
        User user = new User(1,"Ibrahim Chowdhury", "+880123456789");

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String userString = objectMapper.writeValueAsString(user);
            System.out.println(userString);

            User jsonToObject = objectMapper.readValue(userString, User.class);
            System.out.println(jsonToObject.toString());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
