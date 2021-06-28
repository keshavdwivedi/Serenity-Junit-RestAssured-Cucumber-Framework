package com.SerenityRestAssured.packages.stepFiles;

import com.SerenityRestAssured.packages.BasePackage.TestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import java.util.HashMap;
import java.util.Map;

public class PostRequestSteps {

    @Step
    public Response setPostRequestCall(String name){
        Map<String,String>args= new HashMap<>();
        args.put("name",name);
        TestBase.response=SerenityRest.given().contentType(ContentType.JSON).body(args).post();
        TestBase.response.prettyPrint();
        return TestBase.response;
    }


}
