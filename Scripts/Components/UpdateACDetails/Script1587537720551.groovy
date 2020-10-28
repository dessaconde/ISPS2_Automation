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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import org.openqa.selenium.Keys as Keys

'Wait until all attributes are loaded'
WebUI.enableSmartWait()

'Get Excel Data from Maintain AC Sheet'
ManageACTD = ExcelFactory.getExcelDataWithDefaultSheet(GlobalVariable.DBPath, GlobalVariable.SheetName, true)

'Get value from Nationality column'
GlobalVariable.acNationality = ManageACTD.getValue('Nationality', 2)

'Get value from IDNo column'
GlobalVariable.acID = ManageACTD.getValue('IDNo', 2)

'Get value from ACName column'
GlobalVariable.acName = ManageACTD.getValue('ACName', 2)

'Get value from QPTypeNo column'
GlobalVariable.acQPNo = ManageACTD.getValue('QPTypeNo', 2)

'Get value from QPName column'
GlobalVariable.acQPName = ManageACTD.getValue('QPName', 2)

'Get value from FirmName column'
GlobalVariable.acFirmName = ManageACTD.getValue('FirmName', 2)

'Get value from Status column'
GlobalVariable.acStatus = ManageACTD.getValue('Status', 2)

'Get value from Address column'
GlobalVariable.acAddress = ManageACTD.getValue('Address', 2)

'Get value from RegistrationStartDate column'
GlobalVariable.acRegStartDate = ManageACTD.getValue('RegistrationStartDate', 2)

'Get value from RegistrationEndDate column'
GlobalVariable.acRegEndDate = ManageACTD.getValue('RegistrationEndDate', 2)

'Get value from SuspensionStartDate column'
GlobalVariable.acSuspensionStartDate = ManageACTD.getValue('SuspensionStartDate', 2)

'Get value from SuspensionEndDate column'
GlobalVariable.acSuspensionEndDate = ManageACTD.getValue('SuspensionEndDate', 2)

'Modify the text object to the set AC No Global Variable'
modifyACNoText = WebUI.modifyObjectProperty(findTestObject('Objects.UpdateACDetails/Page_ISPS2/div_0045'), 'text', 'equals', 
    GlobalVariable.acNo, true)

'Highlight the AC No text'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifyACNoText)

'Wait for 5 seconds'
WebUI.delay(5)

'Set Focus in input Status'
WebUI.focus(findTestObject('Objects.UpdateACDetails/Page_ISPS2/input_Status'), FailureHandling.STOP_ON_FAILURE)

'Wait for 5 seconds'
WebUI.delay(5)

'Send arrow left keys'
WebUI.sendKeys(findTestObject('Objects.UpdateACDetails/Page_ISPS2/input_Status'), Keys.chord(Keys.ARROW_LEFT))

'Wait for 5 seconds'
WebUI.delay(5)

'Select All value'
WebUI.sendKeys(findTestObject('Objects.UpdateACDetails/Page_ISPS2/input_Status'), Keys.chord(Keys.LEFT_CONTROL, 'a'))

'Wait for 5 seconds'
WebUI.delay(5)

'Send Backspace key to delete the current value'
WebUI.sendKeys(findTestObject('Objects.UpdateACDetails/Page_ISPS2/input_Status'), Keys.chord(Keys.BACK_SPACE))

'Wait for 5 seconds'
WebUI.delay(5)

'Send arrow down keys in Status'
WebUI.sendKeys(findTestObject('Objects.UpdateACDetails/Page_ISPS2/input_Status'), Keys.chord(Keys.ARROW_DOWN))

'Update Status'
WebUI.setText(findTestObject('Objects.UpdateACDetails/Page_ISPS2/input_Status'), GlobalVariable.acStatus)

'Select Status'
WebUI.sendKeys(findTestObject('Objects.UpdateACDetails/Page_ISPS2/input_Status'), Keys.chord(Keys.ARROW_DOWN))

'Send Tab keys in Status'
WebUI.sendKeys(findTestObject('Objects.UpdateACDetails/Page_ISPS2/input_Status'), Keys.chord(Keys.TAB))

'Select Unformatted radio button'
WebUI.click(findTestObject('Objects.UpdateACDetails/Page_ISPS2/label_Unformatted'))

'Update Address'
WebUI.setText(findTestObject('Objects.UpdateACDetails/Page_ISPS2/Unformatted_Address'), GlobalVariable.acAddress)

