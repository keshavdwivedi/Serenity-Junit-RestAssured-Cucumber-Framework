package com.SerenityRestAssured.packages.stepDefinitions;

import com.SerenityRestAssured.packages.apiCalls.PostServiceCall;
import com.SerenityRestAssured.packages.basePackage.TestBase;
import com.SerenityRestAssured.packages.stepFiles.DeleteRequestSteps;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class DeleteServiceStepDefs {

    int serviceId=0;

    @Steps
    DeleteRequestSteps deleteRequestSteps;

    @Before
    public void setUp(){
        TestBase.loadPreConfigs();
    }

    @Given("^I have the service id of created service$")
    public void i_have_the_service_id_of_created_service() {
        serviceId=PostServiceCall.getProductVal();
    }

    @When("^I post the delete request at specified endpoint$")
    public void i_post_the_delete_request_at_specified_endpoint() {
        TestBase.response=deleteRequestSteps.setDeleteRequestCall(serviceId);
    }

    @Then("^I validate response code as \"([^\"]*)\"$")
    public void i_validate_response_code_as(int resCode) {
        Assert.assertEquals(TestBase.response.getStatusCode(),resCode);
    }

}
