package com.SerenityRestAssured.packages.stepFiles;

import com.SerenityRestAssured.packages.BasePackage.TestBase;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetRequestSteps {

    @Step
    public Response GetAllServicesCall(){
        TestBase.response =SerenityRest.given().when().get();
        TestBase.response.prettyPrint();
        return TestBase.response;
    }
}
