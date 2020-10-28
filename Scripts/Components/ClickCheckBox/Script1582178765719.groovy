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

//*******************************************************//
//****************** CheckListOfBlocksAssignedToPE ******************//
//*** Author: Janelle Carbonell *****************//
//*** Date Created: 20th of January, 2020 ************//
//*** Purpose: To... ********************************//
//*** Reviewer: fullFirstName surname ***************//
//*******************************************************//

'Wait for a second before proceeding to further automated steps.'
Thread.sleep(1000)

'Modify Object '
modifiedCheckBox = WebUI.modifyObjectProperty(findTestObject('Objects.ClickCheckBox/Page_ISPS2/CheckBox2'), 
    'xpath', 'equals', ('(//*[contains(@class,\'x-grid-row-checker\')])[' + Index) + ']', true)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedCheckBox)

'Click the checkbox'
CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(modifiedCheckBox, 0)