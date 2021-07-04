package com.SerenityRestAssured.packages.stepFiles;

import com.SerenityRestAssured.packages.apiCalls.PostServiceCall;
import com.SerenityRestAssured.packages.basePackage.TestBase;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

public class PostRequestSteps {

    PostServiceCall postServiceCall=new PostServiceCall();

    @Step
    public void makeService(){
        postServiceCall.makeCreateProductRequest();
    }


    @Step
    public Response setPostRequestCall(String name) {
        TestBase.response=postServiceCall.createService(name);
        return TestBase.response;
    }


}
