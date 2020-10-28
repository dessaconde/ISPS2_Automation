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

Thread.sleep(3000)

ModifiedSubmNo = WebUI.modifyObjectProperty(findTestObject('Objects.ReusableObjects/LabelXPathField'), 'xpath', 'equals', 
    '//*[contains(@class,\'app-h1-small\')]', true)

GetText = WebUI.getText(ModifiedSubmNo)

GetCaseRefNo = (GetText.split(':')[2])

parsedStr = GetCaseRefNo.replaceAll(' ', '&')

NewStr = (parsedStr.split('&')[1])

StrLen = (NewStr.length() - 1)

GlobalVariable.SubmissionNo = NewStr.substring(0, StrLen)