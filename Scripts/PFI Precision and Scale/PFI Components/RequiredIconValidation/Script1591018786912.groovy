import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Component Name: DataErrorValidation
//Author: Krizia Manuel
//Date Created: 5/5/2020
//Purpose: Verify that the input field is a required field
'Wait.'
WebUI.enableSmartWait()

'Modify Input field property/attribute'
modifiedIcon = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.ReusableObjects/ErrorIcon'), 'xpath', 'equals', ('(//*[contains(@class,\'x-form-error-msg x-form-invalid-icon\')])[' + 
    index) + ']', true)

'Hover the mouse over the required field'
WebUI.mouseOver(modifiedIcon)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedIcon)

'Get tooltip error message'
getRqErrMsg = WebUI.getAttribute(modifiedIcon, 'data-errorqtip')

'Remove the unnecessary values'
strToolTip = getRqErrMsg.substring(29, 61)

'Get the error message display in tool tip'
toolTipReqErrMsg = strToolTip.substring(0, 22)

'Verify if the tooltip error message display is the same of the error message in DB'
WebUI.verifyMatch(toolTipReqErrMsg, GlobalVariable.RqField, true)

