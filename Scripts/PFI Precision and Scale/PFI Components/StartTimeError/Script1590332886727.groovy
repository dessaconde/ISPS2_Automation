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

Thread.sleep(1000)

if (index == 0){
	'Modify Input field property/attribute'
	NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Objects.HighlightElements/input_field'), 'name', 'equals',
		FldNm, true)
}else{
	NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.HighlightElements/input_field_index'), 'xpath', 'equals',
	'(//*[@name= \'' + FldNm + '\'])[' + index + ']', true)
}

WebUI.mouseOver(NewInputNmField)

getInputInvalidDate = WebUI.getAttribute(NewInputNmField, 'value')

getErrMsg = WebUI.getAttribute(NewInputNmField, 'data-errorqtip')

'Remove the html codes'
RmvCd = getErrMsg.substring(0, 75)

'Get the 1st Error Message'
FirstErrMsg = RmvCd.substring(29, 66)

'Get the total length of tooltip error message'
getTotalLength = getErrMsg.length()

'Remove the html codes'
RmvCd = getErrMsg.substring(75, getTotalLength)

'Get the total length of the 2nd error message'
lenInv = (RmvCd.length() - 10)

'Get the 2nd error message without the html codes'
InvErrMsg = RmvCd.substring(0, lenInv)

'Get the concatenated expected invalid date error message'
ExpectedInvalidErrMsg2 = WebUI.concatenate(GlobalVariable.InvDtErr, ' ', getInputInvalidDate, ' ', GlobalVariable.NotValidDt)

'Get the actual invalid date error message'
ActualInvErrMsg = WebUI.concatenate(FirstErrMsg, ' ', InvErrMsg)

'Verify that the tooltip error message is the same to the expected invalid date error message'
WebUI.verifyMatch(ActualInvErrMsg, ExpectedInvalidErrMsg2, true)