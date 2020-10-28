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

'Wait for a moment before proceeding to other automated steps.'
Thread.sleep(1000)

'Verifies that the \'APPLICANT DETAIL\' text is present on the page to confirm user is in the right page. '
WebUI.verifyTextPresent('APPLICANT DETAIL', false)

'Locates the \'Salutation\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateApplicantDetail/Page_ISPS2/input_Salutation_caseApplicantsalutationCd'))

WebUI.setText(findTestObject('Objects.PopulateApplicantDetail/Page_ISPS2/input_Salutation_caseApplicantsalutationCd'), Salutation)

'Locates the \'ID Type\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateApplicantDetail/Page_ISPS2/input__caseApplicantidTypeCd'))

WebUI.setText(findTestObject('Objects.PopulateApplicantDetail/Page_ISPS2/input__caseApplicantidTypeCd'), IDType)

'Locates the \'Designation\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateApplicantDetail/Page_ISPS2/input_Designation_caseApplicantdesignation'))

WebUI.setText(findTestObject('Objects.PopulateApplicantDetail/Page_ISPS2/input_Designation_caseApplicantdesignation'), Designation)

'Locates the \'Name\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateApplicantDetail/Page_ISPS2/input__caseApplicantname'))

WebUI.setText(findTestObject('Objects.PopulateApplicantDetail/Page_ISPS2/input__caseApplicantname'), Name)

'Locates the \'ID No.\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateApplicantDetail/Page_ISPS2/input_ID No_caseApplicantidNo'))

WebUI.setText(findTestObject('Objects.PopulateApplicantDetail/Page_ISPS2/input_ID No_caseApplicantidNo'), IDNo)

'Locates the \'Firm Name\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateApplicantDetail/Page_ISPS2/input_Firm Name_caseApplicantfirmName'))

WebUI.setText(findTestObject('Objects.PopulateApplicantDetail/Page_ISPS2/input_Firm Name_caseApplicantfirmName'), FirmName)

