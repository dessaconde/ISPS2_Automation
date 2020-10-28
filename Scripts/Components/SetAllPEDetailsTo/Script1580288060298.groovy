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
//****************** SetAllPEDetailsTo ******************//
//*** Author: Janelle Carbonell *****************//
//*** Date Created: 30th of January, 2020 ************//
//*** Purpose: To... ********************************//
//*** Reviewer: fullFirstName surname ***************//
//*******************************************************//
'Wait for a second before proceeding to further automated steps.'
Thread.sleep(1000)

'Highlight the text \'Set PE Details To\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.SetAllPEDetailsTo/SetAllPEDetailsTo'))

'Click the field \'Set PE Details To\''
CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.SetAllPEDetailsTo/Page_ISPS2/div_Set all PE Details to_combobox-1928-bodyEl'), 
    0)

not_run: WebUI.click(findTestObject('Objects.SetAllPEDetailsTo/Page_ISPS2/div_Set all PE Details to_combobox-1928-bodyEl'))

not_run: WebUI.setText(findTestObject('Objects.SetAllPEDetailsTo/Page_ISPS2/div_Set all PE Details to_combobox-1928-bodyEl'), 
    'Rhodessa Con')

not_run: WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Press arrow down to reveal values of the drop down selection'
WebUI.sendKeys(findTestObject('Objects.SetAllPEDetailsTo/Page_ISPS2/div_Set all PE Details to_combobox-1928-bodyEl'), Keys.chord(
        Keys.ARROW_DOWN))

not_run: WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 3000], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('Objects.SetAllPEDetailsTo/Page_ISPS2/div_9075 drpdwn'), Keys.chord(Keys.ARROW_DOWN))

'Wait for 5 seconds'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('Objects.SetAllPEDetailsTo/Page_ISPS2/div_Set all PE Details to_combobox-1928-bodyEl'), 
    Keys.chord(Keys.ENTER))

'Click the desired value '
CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.SetAllPEDetailsTo/Page_ISPS2/span_1234 (Rhodessa Conde)'), 
    0)

not_run: WebUI.click(findTestObject('Objects.SetAllPEDetailsTo/Page_ISPS2/span_1234 (Rhodessa Conde)'))

'Click Set button'
WebUI.click(findTestObject('Objects.SetAllPEDetailsTo/Page_ISPS2/SetButton'))

