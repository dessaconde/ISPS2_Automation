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

'Wait until all attributes are loaded'
WebUI.enableSmartWait()

/*'Enter DB Path in Global Variable'
GlobalVariable.DBPath = enterDBPath

'Enter Sheet Name in Global Variable'
GlobalVariable.SheetName = enterSheetName

'Enter variable in AC No global variable'
GlobalVariable.acNo = enterACNo*/

'Highlight \'Manage AC\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateACDetails/Page_ISPS2/div_Manage AC'))

'Highlight \'AC Details\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateACDetails/Page_ISPS2/b_AC DETAILS'))

'Check if the AC Name field have value'
inputACName = WebUI.getAttribute(findTestObject('Objects.PopulateACDetails/Page_ISPS2/input__acName'), 'value')

'If AC Name field is blank then go to AddACDetails else UpdateACDetails'
if (inputACName == ''){
	'Go to AddACDetails component'
	WebUI.callTestCase(findTestCase('Components/AddACDetails'), [:], FailureHandling.STOP_ON_FAILURE)
}else{
	'Go to UpdateACDetails component'
	WebUI.callTestCase(findTestCase('Components/UpdateACDetails'), [:], FailureHandling.STOP_ON_FAILURE)
}