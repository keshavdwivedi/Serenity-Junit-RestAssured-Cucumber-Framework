package com.SerenityRestAssured.packages.testcases;

import com.SerenityRestAssured.packages.BasePackage.TestBase;
import com.SerenityRestAssured.packages.stepFiles.PostRequestSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class RunPostService extends TestBase {

    private static String id;

    public static String getid(){
        return id;
    }

    @Steps
    PostRequestSteps postRequestSteps;

    @Title("Creating Service")
    @Test
    public void createServiceTest(){

        TestBase.response=postRequestSteps.setPostRequestCall("Hair-care");
        id=TestBase.response.jsonPath().get("id").toString();
    }

 }
