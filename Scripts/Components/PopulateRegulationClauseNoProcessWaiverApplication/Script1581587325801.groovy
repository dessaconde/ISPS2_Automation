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
import org.openqa.selenium.Keys as Keys

//*******************************************************//
//****************** PopulateRegulationClauseNo ******************//
//*** Author: Janelle Carbonell *****************//
//*** Date Created: 4th of February, 2020 ************//
//*** Purpose: To... ********************************//
//*** Reviewer: fullFirstName surname ***************//
//*******************************************************//
Thread.sleep(1000)

'Verify if dropdown field is present'
if (WebUI.verifyElementVisible(findTestObject('Objects.PopulateRegulationClauseNo/Page_ISPS2/input__regulationCd'), FailureHandling.CONTINUE_ON_FAILURE)) {
    'If present, this will click the field'
    WebUI.click(findTestObject('Objects.PopulateRegulationClauseNo/Page_ISPS2/input__regulationCd'))

    'From the drop down field press arrow down'
    WebUI.sendKeys(findTestObject('Objects.PopulateRegulationClauseNo/Page_ISPS2/input__regulationCd'), Keys.chord(Keys.ARROW_DOWN))

    'Press arrow down again to choose a value'
    WebUI.sendKeys(findTestObject('Objects.PopulateRegulationClauseNo/Page_ISPS2/input__regulationCd'), Keys.chord(Keys.ARROW_DOWN))

    'Press enter to confirm the value'
    WebUI.sendKeys(findTestObject('Objects.PopulateRegulationClauseNo/Page_ISPS2/input__regulationCd'), Keys.chord(Keys.ENTER))
} else if (WebUI.verifyElementVisible(findTestObject('Objects.PopulateRegulationClauseNo/Page_ISPS2/TextField'))) {
    'Else if, the field is not dropdown and is a textfield click the field'
    WebUI.click(findTestObject('Objects.PopulateRegulationClauseNo/Page_ISPS2/TextField'))

    'Enter a text '
    WebUI.setText(findTestObject('Objects.PopulateRegulationClauseNo/Page_ISPS2/TextField'), 'test')
}

