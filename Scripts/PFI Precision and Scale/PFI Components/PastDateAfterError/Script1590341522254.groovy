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
import java.text.SimpleDateFormat as SimpleDateFormat

Thread.sleep(1000)

def date = new Date()

DateFormat = new SimpleDateFormat('dd/MM/yyyy')

CurrentDate = DateFormat.format(date)

DateFieldNm = WebUI.modifyObjectProperty(findTestObject('Objects.HighlightElements/input_field'),
	'name', 'equals', FldNm, true)

GetDateValue = WebUI.getAttribute(DateFieldNm, 'value')

WebUI.verifyMatch(GetDateValue, CurrentDate, true)

PastDate = date - 30

PastDateFormatted = PastDate.format('dd/MM/yyyy')

WebUI.setText(DateFieldNm, PastDateFormatted)

WebUI.mouseOver(DateFieldNm, FailureHandling.STOP_ON_FAILURE)

'Get the error message for entering past date'
PastDtErrMsg = WebUI.getAttribute(DateFieldNm, 'data-errorqtip', 
    FailureHandling.STOP_ON_FAILURE)

'Get the total length of error message'
lenErrMsg = PastDtErrMsg.length()

'Remove the html codes'
RmvCde = PastDtErrMsg.substring(29, lenErrMsg)

'Get the actual error message without the hmtl codes'
ActualErrDtMsg = RmvCde.substring(0, 47)

'Concatenate the expected error messag'
ExpectedErrDtMsg = WebUI.concatenate(GlobalVariable.DtErrMsg, ' ', CurrentDate)

'Verify that the actual error message is matched to the expected error message'
WebUI.verifyMatch(ActualErrDtMsg, ExpectedErrDtMsg, true)

GlobalVariable.FromDate = WebUI.getAttribute(DateFieldNm, 'value')