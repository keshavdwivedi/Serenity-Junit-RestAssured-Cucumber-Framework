package com.SerenityRestAssured.packages.stepDefinitions;

import com.SerenityRestAssured.packages.basePackage.TestBase;
import com.SerenityRestAssured.packages.stepFiles.GetAllRequestSteps;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class GetAllServiceStepDefs {

    @Steps
   GetAllRequestSteps getAllRequestSteps;

    @Before
    public void setUp(){
        TestBase.loadPreConfigs();
    }

    @Given("^I want to get details of \"([^\"]*)\" services$")
    public void i_want_to_get_details_of_services(int limit) {
        getAllRequestSteps.makeGetCall(limit);
    }

    @When("^I get the products details of \"([^\"]*)\" services using Get all service API endpoint$")
    public void i_get_the_products_details_of_services_using_Get_all_service_API_endpoint(int serviceLimit ) {
       TestBase.response=getAllRequestSteps.GetAllServices(serviceLimit);
    }

    @Then("^I validate status code as \"([^\"]*)\"$")
    public void i_validate_status_code_as(int expectedStatusCode) {
        Assert.assertEquals(TestBase.response.getStatusCode(),expectedStatusCode);
    }

    @Then("^I validate product count as \"([^\"]*)\"$")
    public void i_validate_product_count_as(int serviceTotal) {
        Assert.assertEquals(TestBase.response.jsonPath().get("total").toString(),String.valueOf(serviceTotal));
    }

}
