package com.testng.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    static Properties properties;

    static  {
        String path = "configuration.properties";

        FileInputStream file = null;
        try {
            file = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        properties = new Properties();
        try {
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);

    }
}
