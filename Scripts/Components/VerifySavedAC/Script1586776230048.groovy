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

'Modify the Object Property of AC Number Column'
SavedACNum = WebUI.modifyObjectProperty(findTestObject('Objects.VerifySavedAC/Page_ISPS2/ACNum'), 'text', 'equals', GlobalVariable.acNo, 
    true)

'Highlight the Saved AC Number from AC Details'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(SavedACNum)

'Modify the Object Property of AC Name Column'
SavedACName = WebUI.modifyObjectProperty(findTestObject('Objects.VerifySavedAC/Page_ISPS2/div_ACName'), 'text', 'equals', 
    GlobalVariable.acName, true)

'Highlight the Saved AC Name from AC Details'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(SavedACName)

'Modify the Object Property of Firm Column'
SavedFirm = WebUI.modifyObjectProperty(findTestObject('Objects.VerifySavedAC/Page_ISPS2/div_FirmName'), 'text', 'equals', 
    GlobalVariable.acFirmName, true)

'Highlight the Saved Firm Name from AC Details'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(SavedFirm)

'Modify the Object Property of Address Column'
SavedAddress = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.VerifySavedAC/Page_ISPS2/div_Address'), 'text', 'equals',
	GlobalVariable.acFirmName, true)

'Highlight the Saved Address from AC Details'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(SavedAddress)

'Modify the Object Property of Status'
SavedStatus = WebUI.modifyObjectProperty(findTestObject('Objects.VerifySavedAC/Page_ISPS2/div_Status'), 'text', 'equals', 
    GlobalVariable.acStatus, true)

'Highlight the Saved Status from AC Details'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(SavedStatus)

