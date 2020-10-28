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

Thread.sleep(3000)

WebUI.scrollToElement(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Process Temporary Building Permit'), 
    0)

WebUI.verifyElementVisible(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Process Temporary Building Permit'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Process Temporary Building Permit'))

WebUI.scrollToElement(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Summary'), 0)

WebUI.verifyElementVisible(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Summary'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Summary'))

WebUI.scrollToElement(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Case Detail'), 0)

WebUI.verifyElementVisible(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Case Detail'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Case Detail'))

WebUI.scrollToElement(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Main Form'), 0)

WebUI.verifyElementVisible(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Main Form'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Main Form'))

not_run: WebUI.scrollToElement(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_DETAILS OF TEMPORARY BUILDING'), 
    0)

not_run: WebUI.verifyElementVisible(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_DETAILS OF TEMPORARY BUILDING'))

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_DETAILS OF TEMPORARY BUILDING'))

WebUI.scrollToElement(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Previous Temporary Building Permit Summary'), 
    0)

WebUI.verifyElementVisible(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Previous Temporary Building Permit Summary'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Previous Temporary Building Permit Summary'))

WebUI.scrollToElement(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Building Plan Fees'), 0)

WebUI.verifyElementVisible(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Building Plan Fees'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Building Plan Fees'))

WebUI.scrollToElement(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Record Inspection'), 0)

WebUI.verifyElementVisible(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Record Inspection'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Record Inspection'))

WebUI.scrollToElement(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_OWNER OF TEMPORARY BUILDINGSSTRUCTURES  DETAILS'), 
    0)

WebUI.verifyElementVisible(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_OWNER OF TEMPORARY BUILDINGSSTRUCTURES  DETAILS'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_OWNER OF TEMPORARY BUILDINGSSTRUCTURES  DETAILS'))

WebUI.scrollToElement(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_OWNER OF THE PREMISES  DETAILS'), 0)

WebUI.verifyElementVisible(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_OWNER OF THE PREMISES  DETAILS'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_OWNER OF THE PREMISES  DETAILS'))

WebUI.scrollToElement(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Qualified Person'), 0)

WebUI.verifyElementVisible(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Qualified Person'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Qualified Person'))

WebUI.scrollToElement(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Builder'), 0)

WebUI.verifyElementVisible(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Builder'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifySummarySections/Page_ISPS2/div_Builder'))

