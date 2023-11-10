package FileHandaling.C_PropertiesFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;
import java.util.Set;

public class ReadingProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        String filePath = System.getProperty("user.dir")+"\\data\\example.properties";

        FileInputStream file = new FileInputStream(filePath);

        properties.load(file);

        //Read data from properties file
        String age = properties.getProperty("Age");
        String email = properties.getProperty("Email");
        String name = properties.getProperty("Name");

        System.out.println(age+" "+name+" "+ email);

        //Capture all the properties
        Set<String> keys=properties.stringPropertyNames();
        System.out.println(keys);

        //capture all the properties - method 2
        Set<Object> allKeys = properties.keySet();
        System.out.println(allKeys);

        ////capture all the values
        Collection<Object> values= properties.values();
        System.out.println(values);

        //read all the properties along with the values
        for (String  key : properties.stringPropertyNames()) {
            System.out.println(key+" "+properties.getProperty("Age"));
        }

        file.close();
    }
}
