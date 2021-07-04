package com.SerenityRestAssured.packages.basePackage;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    public static Properties propertyConfig = new Properties();
    public static FileInputStream fis;
    public static Response response;
    public static RequestSpecification requestSpecification;


           public static void loadPreConfigs(){
               try {
                   fis = new FileInputStream("./src/test/resources/ConfigurationURLs/config.properties");
                   try {
                       propertyConfig.load(fis);
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               } catch (FileNotFoundException e) {
                   e.printStackTrace();
               }

               RestAssured.baseURI=propertyConfig.getProperty("BaseURI");
              // RestAssured.basePath=propertyConfig.getProperty("createService");
           }
      }
