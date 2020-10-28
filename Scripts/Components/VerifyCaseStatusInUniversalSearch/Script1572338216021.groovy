import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys

//Component Name: VerifyCaseStatusInUniversalSearch
//Dev: Shayne Cardona
//Purpose: To verify the status of the case in the Universal Search

'3 seconds hard wait. '
Thread.sleep(1000)

//WebUI.modifyObjectProperty(findTestObject('Objects.VerifyCaseStatusInUniversalSearch/Page_ISPS2/a_case ref no'), 'text', 
//    'equals', GlobalVariable.CRN, false)
'Modify object property.'
not_run: modified = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyCaseStatusInUniversalSearch/Page_ISPS2/a_case ref no'), 
    'text', 'equals', GlobalVariable.CRN, false)

not_run: WebUI.rightClick(findTestObject(modified))

//'//a[@class = 'isps-search-result-title x-box-item' and (text()='A1234-00004-2019-EP19')]''
'Verify the case ref no is present.'
WebUI.verifyTextPresent(GlobalVariable.CRN, true)

//'Highlight the case ref no.'
//CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject(newCRN))
'3 seconds hard wait. '
Thread.sleep(1000)

'Modify object property.'
modifiedcaseTypeStatus = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyCaseStatusInUniversalSearch/Page_ISPS2/b_caseTypeCaseStatus'), 
    'text', 'equals', caseTypeCaseStatus, true)

'Verify the case type and case status.'
WebUI.verifyTextPresent(caseTypeCaseStatus, false)

'Highlight the case type and case status.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedcaseTypeStatus)

'3 seconds hard wait. '
Thread.sleep(1000)

'Modify object property.'
modifiedStat = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyCaseStatusInUniversalSearch/Page_ISPS2/caseStatus'), 
    'text', 'equals', caseStatus, true)

'Verify the case status is correct.'
WebUI.verifyTextPresent(caseStatus, false)

'Highlight case status.'
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedStat)

'3 seconds hard wait. '
Thread.sleep(1000)

