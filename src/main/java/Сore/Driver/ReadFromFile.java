package Сore.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFromFile {
    public String getReadPropertyFile(String name) {
        String browser = "";

        try {


            InputStream input = new FileInputStream("C:\\TestFrameWork_Snovio_Preprod\\src\\main\\java\\Сore\\Driver\\Config.properties");
            Properties prop = new Properties();
            prop.load(input);
            browser = prop.getProperty(name);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return browser;
    }
}
