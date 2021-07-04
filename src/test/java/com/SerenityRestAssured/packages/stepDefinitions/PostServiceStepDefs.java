package com.SerenityRestAssured.packages.stepDefinitions;

import com.SerenityRestAssured.packages.apiCalls.PostServiceCall;
import com.SerenityRestAssured.packages.basePackage.TestBase;
import com.SerenityRestAssured.packages.stepFiles.PostRequestSteps;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class PostServiceStepDefs {

    @Steps
    PostRequestSteps postRequestSteps;

    @Before
    public void setUp(){
        TestBase.loadPreConfigs();
    }

    @Given("^I create service by using create service API$")
    public void i_create_service_by_using_create_service_API() {
       postRequestSteps.makeService();
    }

    @When("^I provide valid \"([^\"]*)\" for service creation$")
    public void i_provide_valid_for_service_creation(String serviceName) {
        postRequestSteps.setPostRequestCall(serviceName);
    }

    @When("^I store id of service created$")
    public void i_store_id_of_service_created() {
        String serviceId=TestBase.response.jsonPath().get("id").toString();
        PostServiceCall.setProductVal(serviceId);
    }

    @Then("^I validate status code \"([^\"]*)\"$")
    public void i_validate_status_code(int statusCode) {
        Assert.assertEquals(TestBase.response.getStatusCode(),statusCode);
    }
}
