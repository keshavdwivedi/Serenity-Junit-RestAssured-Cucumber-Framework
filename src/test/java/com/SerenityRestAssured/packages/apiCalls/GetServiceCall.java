package com.SerenityRestAssured.packages.apiCalls;

import com.SerenityRestAssured.packages.basePackage.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetServiceCall extends TestBase {

    public String makeAPIPath(int limit){
        String GetAPIPath=propertyConfig.getProperty("GetAllServicesPath")+"?$limit="+limit;
        return GetAPIPath;
    }

    public Response GetAllService(int serviceLimit){
        response = RestAssured.given().contentType(ContentType.JSON).get(makeAPIPath(serviceLimit));
        response.prettyPrint();
        return response;
    }
}
