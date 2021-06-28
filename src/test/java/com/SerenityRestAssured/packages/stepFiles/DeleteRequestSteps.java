package com.SerenityRestAssured.packages.stepFiles;

import com.SerenityRestAssured.packages.BasePackage.TestBase;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DeleteRequestSteps {

    @Step
    public void setDeleteRequestCall(int id){
        TestBase.response= SerenityRest.given().when().delete(String.valueOf(id));
        TestBase.response.prettyPrint();
    }

}
