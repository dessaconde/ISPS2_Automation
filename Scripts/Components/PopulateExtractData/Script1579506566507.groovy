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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

//*******************************************************//
//****************** PopulateExtractData ****************//
//*** Author: Rhodessa Conde ****************************//
//*** Date Created: 20th of January, 2020 ***************//
//*** Purpose: To populate fields in Extract Data screen*//
//*** and select the Recipients**************************//
//*******************************************************//
'Wait until all pages are loaded'
Thread.sleep(1000)

'Highlight and verify the label \'Extraction Data\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateExtractData/Page_ISPS2/div_Extraction Data'))

'Highlight and verify the report label \'AAMIM4130\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateExtractData/Page_ISPS2/span_Extraction ID'))

'Highlight and verify the Extraction Description'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateExtractData/Page_ISPS2/div_AAMIM4130'))

'Highlight and verify the Extraction Description'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateExtractData/Page_ISPS2/span_Extraction Description'))

'Highlight and verify the label \'From Date\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateExtractData/Page_ISPS2/span_From Date'))

'Enter Start Date'
WebUI.setText(findTestObject('Objects.PopulateExtractData/Page_ISPS2/input_From Date_fromDate'), FromDate)

'Highlight and verify the element \'To Date\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateExtractData/Page_ISPS2/span_To Date'))

'Enter End Date'
WebUI.setText(findTestObject('Objects.PopulateExtractData/Page_ISPS2/input_To Date_toDate'), ToDate)

'Hightlight and verify the element \'Execution Type\' label'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateExtractData/Page_ISPS2/span_Execution Type'))

'Highlight and verify the element \'Recipient\' label'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateExtractData/Page_ISPS2/span_Recipient'))

'Modify the Object Property of recipient radiobutton'
modifiedRadioButton = WebUI.modifyObjectProperty(findTestObject('Objects.ClickRadioButton/DynamicRadioButton'), 'xpath',
	'equals', '(//*[contains(@class,\'x-form-cb-label-default\') and text()=\'' + lblNm + '\'])[' + index + ']', true)

'Highlight and verify the element \'SelectRecipient\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedRadioButton)

'Check if the ModifiedRecipient is equal to AC'
WebUI.click(modifiedRadioButton)

'Highlight and verify the element \'Submit\' button'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateExtractData/Page_ISPS2/span_Submit'))

'Click Submit button'
WebUI.click(findTestObject('Objects.PopulateExtractData/Page_ISPS2/span_Submit'))

'Wait until the next label message is loaded'
Thread.sleep(1000)

'Verify if the text \'AAMIM4130 report is processed\' is present'
WebUI.verifyTextPresent('AAMIM4130 is now being processed, please wait for 15-20 minutes.', false)

'Highlight text \'AAMIM4130 report is processed\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateExtractData/Page_ISPS2/li_AAMIM4130 is now being processed'))

'Wait until the next label message is loaded'
Thread.sleep(1000)

'Wait for the Element to refresh'
WebUI.waitForElementVisible(findTestObject('Objects.PopulateExtractData/Page_ISPS2/li_AAMIM4130 successfully completed'), 
    5)

'Verify if the text \'AAMIM4130 report successfully completed\' is present'
WebUI.verifyTextPresent('AAMIM4130 successfully completed. You can generate the report now.', true)

'Highlight text \'AAMIM4130 report successfully completed\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateExtractData/Page_ISPS2/li_AAMIM4130 successfully completed'))

'Highlight the \'Reset\' button'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateExtractData/Page_ISPS2/span_Reset'))

'Click Reset button'
WebUI.click(findTestObject('Objects.PopulateExtractData/Page_ISPS2/span_Reset'))

