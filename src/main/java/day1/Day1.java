package day1;

import java.util.regex.Pattern;

/**
 * Created by Ibrahim Chowdhury on 15 Jun, 2021
 *
 * This code example is to valid an email in Java
 */
public class Day1 {
    public static void main(String[] args) {
        String email = "ihchowdhury32@gmail.com";
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        boolean isValid = pattern.matcher(email).matches();

        System.out.println(isValid);
    }
}
