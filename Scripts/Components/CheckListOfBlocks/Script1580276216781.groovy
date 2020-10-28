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
//****************** CheckListOfBlocks ******************//
//*** Author: Janelle Carbonell *****************//
//*** Date Created: 29th of January, 2020 ************//
//*** Purpose: To... ********************************//
//*** Reviewer: fullFirstName surname ***************//
//*******************************************************//
Thread.sleep(1000)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.CheckListOfBlocks/Page_ISPS2/div_LIST OF BLOCKS'))

CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.CheckListOfBlocks/Page_ISPS2/div_'), 
    0)

not_run: WebUI.click(findTestObject('Objects.CheckListOfBlocks/Page_ISPS2/div_'))

