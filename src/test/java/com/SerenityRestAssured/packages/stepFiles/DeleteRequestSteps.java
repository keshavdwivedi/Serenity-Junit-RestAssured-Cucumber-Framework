package com.SerenityRestAssured.packages.stepFiles;

import com.SerenityRestAssured.packages.apiCalls.DeleteServiceCall;
import com.SerenityRestAssured.packages.basePackage.TestBase;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DeleteRequestSteps {

    DeleteServiceCall deleteServiceCall=new DeleteServiceCall();

    @Step
    public Response setDeleteRequestCall(int id){
        TestBase.response=deleteServiceCall.makeDeleteService(id);
        return TestBase.response;
    }

}
