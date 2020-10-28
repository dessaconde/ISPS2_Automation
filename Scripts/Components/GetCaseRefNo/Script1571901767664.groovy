import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable


//Component Name: GetCaseRefNo
//Author: Shayne Cardona
//Purpose: To get the case ref no of the opened case
'Best practice: Wait for 3 seconds after a page navigation component. '
Thread.sleep(3000)

'Get text of the element where the case ref no is.'
splitString = WebUI.getText(findTestObject('Objects.GetCaseRefNo/Page_ISPS2/div_deets'))

'Split the captured string starting from the character ":"'
parsedString = (splitString.split(':')[1])

'Replace all the spaces with "&" character for easy splitting.'
str = parsedString.replaceAll(' ', '&')

'Split the string starting after the character "&"'
str2 = (str.split('&')[1])

'Assign the splitted/parsed string in a global variable for easy access'
GlobalVariable.CRN = str2

'Paste the parsed/splitted string on the universal serach for checking.'
not_run: WebUI.setText(findTestObject('Objects.GetCaseRefNo/Page_ISPS2/Page_ISPS2/input_uni'), str2)

