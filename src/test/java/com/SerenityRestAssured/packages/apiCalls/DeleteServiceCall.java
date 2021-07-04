package com.SerenityRestAssured.packages.apiCalls;

import com.SerenityRestAssured.packages.basePackage.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteServiceCall extends TestBase {

    public Response makeDeleteService(int serviceId){
        response= RestAssured.given().delete(propertyConfig.getProperty("deleteservice")+serviceId);
        response.prettyPrint();
        return response;
    }

}
