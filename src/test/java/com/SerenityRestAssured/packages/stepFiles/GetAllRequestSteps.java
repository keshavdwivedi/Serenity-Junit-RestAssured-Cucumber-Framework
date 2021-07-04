package com.SerenityRestAssured.packages.stepFiles;

import com.SerenityRestAssured.packages.apiCalls.GetServiceCall;
import com.SerenityRestAssured.packages.basePackage.TestBase;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

public class GetAllRequestSteps {

    GetServiceCall getServiceCall=new GetServiceCall();

    @Step
    public void makeGetCall(int limit){
        getServiceCall.makeAPIPath(limit);
    }

    @Step
    public Response GetAllServices(int limit){
        TestBase.response=getServiceCall.GetAllService(limit);
        return TestBase.response;
    }


}

