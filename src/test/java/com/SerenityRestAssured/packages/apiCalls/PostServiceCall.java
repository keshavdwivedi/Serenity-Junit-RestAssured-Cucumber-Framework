package com.SerenityRestAssured.packages.apiCalls;

import com.SerenityRestAssured.packages.basePackage.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.HashMap;
import java.util.Map;

public class PostServiceCall extends TestBase {

    private static String serviceVal;

    public static int getProductVal() {
        return Integer.parseInt(serviceVal);
    }

    public static void setProductVal(String serviceVal) {
        PostServiceCall.serviceVal= serviceVal;
    }

    public RequestSpecification makeCreateProductRequest(){
        requestSpecification= RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        return requestSpecification;
    }

    public Response createService(String serviceName){
        Map<String,String> args= new HashMap<>();
        args.put("name",serviceName);
        response=makeCreateProductRequest().body(args).post(propertyConfig.getProperty("createService"));
        response.prettyPrint();
        return response;
    }





}
