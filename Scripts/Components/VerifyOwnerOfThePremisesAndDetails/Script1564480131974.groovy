import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Thread.sleep(1000)

WebUI.click(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/div_Owner of the Premises'))

Thread.sleep(5000)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/div_Owner Of The Premises_Header'))

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/XPA_OwnerOfThePremisesTable1'))

if (WebUI.verifyElementPresent(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/XPA_OwnerOfThePremisesTable1'), 
    3, FailureHandling.OPTIONAL) == true) {
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/XPA_ApplicantName'))

    applicantName = WebUI.getText(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/XPA_ApplicantName'))

    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/XPA_TelNo'))

    telNo = WebUI.getText(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/XPA_TelNo'))

    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/XPA_FaxNo'))

    faxNo = WebUI.getText(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/XPA_FaxNo'))

    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/XPA_EmailAddress'))

    emailAddress = WebUI.getText(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/XPA_EmailAddress'))

    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/XPA_Address'))

    Address = WebUI.getText(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/XPA_Address'))

    Thread.sleep(2000)

    WebUI.click(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/div_Summary'))

    Thread.sleep(5000)

    WebUI.verifyTextPresent(applicantName, false)

    WebUI.verifyTextPresent(telNo, false)

    WebUI.verifyTextPresent(faxNo, false)

    WebUI.verifyTextPresent(emailAddress, false)

    WebUI.verifyTextPresent(Address, false)
} else {
    WebUI.click(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/div_Summary'))

    Thread.sleep(3000)

    WebUI.verifyTextPresent('Owner of the Premises is not valid', false, FailureHandling.CONTINUE_ON_FAILURE)
}

