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

modifyInputFld = WebUI.modifyObjectProperty(findTestObject('Objects.ReusableObjects/InputXPathField'), 'xpath', 'equals', 
    ((('(//*[contains(@class, \'x-form-text\') and contains(@name, \'' + InputName) + '\')])[') + index) + ']', true)

WebUI.mouseOver(modifyInputFld)

GetError = WebUI.getAttribute(modifyInputFld, 'data-errorqtip')

LenErrorMsg = GetError.length()

RmvULCd = GetError.substring(29, LenErrorMsg)

NewLength = (RmvULCd.length() - 10)

ActualErrMsg = RmvULCd.substring(0, NewLength)

ExpectedErrMsg = WebUI.concatenate((findTestData('PrecisionAndScaleDB').getValue('ErrorMessage', 9)),(findTestData('PrecisionAndScaleDB').getValue('MaxValue', 1)))

WebUI.verifyMatch(ActualErrMsg, ExpectedErrMsg, true)