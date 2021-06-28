package com.SerenityRestAssured.packages.testcases;

import com.SerenityRestAssured.packages.BasePackage.TestBase;
import com.SerenityRestAssured.packages.stepFiles.DeleteRequestSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class RunDeleteService extends TestBase {

    @Steps
    DeleteRequestSteps deleteRequestSteps;

    @Title("Deleting Service")
    @Test
    public void DeleteServiceTest(){
        int id= Integer.parseInt(RunPostService.getid());
        deleteRequestSteps.setDeleteRequestCall(id);
    }

}
