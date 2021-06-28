package com.SerenityRestAssured.packages.testcases;

import com.SerenityRestAssured.packages.BasePackage.TestBase;
import com.SerenityRestAssured.packages.stepFiles.GetRequestSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class RunGetAllServices extends TestBase {

    @Steps
    GetRequestSteps getRequestSteps;

    @Title("Getting all services")
    @Test
    public void GetServices(){
        response=getRequestSteps.GetAllServicesCall();
        Assert.assertEquals(response.getStatusCode(),200);
    }

}
