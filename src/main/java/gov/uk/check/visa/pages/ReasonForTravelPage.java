package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement touristVisa;


    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement workAcademicVisitOrBusiness;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-2']")
    WebElement study;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-3']")
    WebElement transit;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement joinPartnerAndJointFamily;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-5']")
    WebElement getMarriedOrEnterIntoCivilPartner;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-6']")
    WebElement stayWithYourChild;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-7']")
    WebElement haveMedicalTreatment;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-8']")
    WebElement forOfficialDiplomaticOrBusiness;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButtonOnReasonTravel;


    public void selectReasonForVisit(String reason) {
        switch (reason) {
            case "Tourism or visiting family and friends":
                clickOnElement(touristVisa);
                break;
            case "Work, academic visit or business":
                clickOnElement(workAcademicVisitOrBusiness);
                break;
            case "Study":
                clickOnElement(study);
                break;
            case "Transit (on your way to somewhere else)":
                clickOnElement(transit);
                break;
            case "Join partner or family for a long stay":
                clickOnElement(joinPartnerAndJointFamily);
                break;
            case "Get married or enter into a civil partnership":
                clickOnElement(getMarriedOrEnterIntoCivilPartner);
                break;
            case "Stay with your child, if they’re at school":
                clickOnElement(stayWithYourChild);
                break;
            case "Have medical treatment":
                clickOnElement(haveMedicalTreatment);
                break;
            case "For official diplomatic or government business (including transit through the UK)":
                clickOnElement(forOfficialDiplomaticOrBusiness);
                break;
            default:
                break;
        }

    }

    public void clickNextStepButtonContinue() {
        clickOnElement(continueButtonOnReasonTravel);
    }


}
