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

//Component Name: RightClickItemFromUniversalSearch
//Dev: Shayne Cardona
//Purpose: To be able to right-click items in the universal search

'3 seconds hard wait. '
Thread.sleep(1000)

'Wait for the search result to be visible.'
WebUI.waitForElementVisible(findTestObject('Objects.SelectItemFromAuditTrailTable/Page_ISPS2/div_search res'), 120)

'Modify object\'s attributes.'
modified = WebUI.modifyObjectProperty(findTestObject('Objects.RightClickItemFromUniversalSearch/a_SM 2017101640'), 'text', 
    'contains', modifiedItem, true)

//caseRefNo = WebUI.getText(findTestObject('Objects.RightClickItemFromUniversalSearch/a_SM 2017101640'))
//modifiedItem = WebUI.modifyObjectProperty(findTestObject('Objects.RightClickItemFromUniversalSearch/a_SM 2017101640'), 'text', 
//    GlobalVariable.CRN, 'contains', true)
//
//if (caseRefNo == GlobalVariable.CRN) {
//    
//}
'Right click the modified object.'
WebUI.rightClick(modified)

'Scroll.'
WebUI.scrollToPosition(9999999, 9999999)

'Wait for 3 secs.'
Thread.sleep(3000)

