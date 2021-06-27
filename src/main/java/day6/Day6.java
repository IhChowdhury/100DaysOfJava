package day6;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Ibrahim Chowdhury on 27 Jun, 2021
 * <p>
 * Today we will read a properties file
 * <p>
 * you will fine properties file in resources folder
 */
public class Day6 {
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties appProps = new Properties();
        try (InputStream resourceStream = loader.getResourceAsStream("application.properties")) {
            appProps.load(resourceStream);
            String applcationName = appProps.getProperty("application.name");
            String applcationVersion = appProps.getProperty("application.version");
            System.out.println(applcationName);
            System.out.println(applcationVersion);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
