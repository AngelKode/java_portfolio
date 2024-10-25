package poo.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SystemProperties {
    public static void main(String[] args) {
        //Get each property individually
        String username = System.getProperty("user.name");
        //System.out.println("Username: " + username);

        String javaHome = System.getProperty("java.home");
        //System.out.println("Java Home: " + javaHome);

        String workSpace = System.getProperty("user.dir");
        //System.out.println("Project directory: " + workSpace);

        String javaVersion = System.getProperty("java.version");
        //System.out.println("Current JAVA version: " + javaVersion);

        //Get properties at once
        Properties systemProperties = System.getProperties();
        //systemProperties.list(System.out);

        //Get properties from a config.properties file
        try{
            FileInputStream fileInputStream = new FileInputStream("./src/main/resources/config.properties");
            Properties newProperties = new Properties(System.getProperties()); //Load current properties
            newProperties.load(fileInputStream); //Load extra properties

            //Add properties to system
            System.setProperties(newProperties);
        }catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.getProperties().list(System.out);
    }
}
