package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement nextStepButtonAcceptAdditional;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButtonNationalityPage;

    public void selectNationality(String nationality)
    {
        clickOnElement(nextStepButtonAcceptAdditional);

        CustomListeners.test.log(Status.PASS,"Select nationality from the dropdown " + nationality);
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);
    }

    public void clickNextStepButton()
    {
        CustomListeners.test.log(Status.PASS,"click on continue button ");
        clickOnElement(nextStepButtonNationalityPage);
    }





}
