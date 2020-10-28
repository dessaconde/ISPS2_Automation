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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory

'Wait until all attributes are loaded'
WebUI.enableSmartWait()

'Get Excel Data from Maintain AC Sheet'
ManageACTD = ExcelFactory.getExcelDataWithDefaultSheet(GlobalVariable.DBPath, GlobalVariable.SheetName, true)

'Get value from Nationality column'
GlobalVariable.acNationality = ManageACTD.getValue('Nationality', 1)

'Get value from IDNo column'
GlobalVariable.acID = ManageACTD.getValue('IDNo', 1)

'Get value from ACName column'
GlobalVariable.acName = ManageACTD.getValue('ACName', 1)

'Get value from QPTypeNo column'
GlobalVariable.acQPNo = ManageACTD.getValue('QPTypeNo', 1)

'Get value from QPName column'
GlobalVariable.acQPName = ManageACTD.getValue('QPName', 1)

'Get value from FirmName column'
GlobalVariable.acFirmName = ManageACTD.getValue('FirmName', 1)

'Get value from Status column'
GlobalVariable.acStatus = ManageACTD.getValue('Status', 1)

'Get value from Address column'
GlobalVariable.acAddress = ManageACTD.getValue('Address', 1)

'Get value from RegistrationStartDate column'
GlobalVariable.acRegStartDate = ManageACTD.getValue('RegistrationStartDate', 1)

'Get value from RegistrationEndDate column'
GlobalVariable.acRegEndDate = ManageACTD.getValue('RegistrationEndDate', 1)

'Get value from SuspensionStartDate column'
GlobalVariable.acSuspensionStartDate = ManageACTD.getValue('SuspensionStartDate', 1)

'Get value from SuspensionEndDate column'
GlobalVariable.acSuspensionEndDate = ManageACTD.getValue('SuspensionEndDate', 1)

'Highlight \'AC Number label\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.AddACDetails/Page_ISPS2/span_Ac Number'))

'Enter AC No'
WebUI.setText(findTestObject('Objects.AddACDetails/Page_ISPS2/input__acNo'), GlobalVariable.acNo)

'Highlight \'Nationality label\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.AddACDetails/Page_ISPS2/span_Nationality'))

'Enter Nationality'
WebUI.setText(findTestObject('Objects.AddACDetails/Page_ISPS2/input_acNationality'), GlobalVariable.acNationality)

'Highlight \'ID No\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.AddACDetails/Page_ISPS2/span_ID No'))

'Enter ID No'
WebUI.setText(findTestObject('Objects.AddACDetails/Page_ISPS2/input_acIdNo'), GlobalVariable.acID)

'Highlight \'Ac Name\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.AddACDetails/Page_ISPS2/span_Ac Name'))

'Concatenate AC with ACNo'
GlobalVariable.acName = WebUI.concatenate('AC', GlobalVariable.acNo)

'Enter Ac Name'
WebUI.setText(findTestObject('Objects.AddACDetails/Page_ISPS2/input__acName'), GlobalVariable.acName)

'Highlight \'QP Type/No\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.AddACDetails/Page_ISPS2/span_QP TypeNo'))

'Wait for 5 seconds'
WebUI.delay(5)

'Send Arrow Down keys in QP Type/No'
WebUI.sendKeys(findTestObject('Objects.AddACDetails/Page_ISPS2/input__qpNo'), Keys.chord(Keys.ARROW_DOWN))

'Enter QP Type/No'
WebUI.setText(findTestObject('Objects.AddACDetails/Page_ISPS2/input__qpNo'), GlobalVariable.acQPNo)

'Select QP Type/No'
WebUI.sendKeys(findTestObject('Objects.AddACDetails/Page_ISPS2/input__qpNo'), Keys.chord(Keys.ARROW_DOWN))

'Send Tab keys in QP Type/No'
WebUI.sendKeys(findTestObject('Objects.AddACDetails/Page_ISPS2/input__qpNo'), Keys.chord(Keys.TAB))

'Save the Firm Name value to a global variable'
GlobalVariable.acFirmName = WebUI.getAttribute(findTestObject('Objects.AddACDetails/Page_ISPS2/input__firmName'), 'value')

'Highlight \'Status\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.AddACDetails/Page_ISPS2/span_Status'))

'Wait for 5 seconds'
WebUI.delay(5)

'Send Arrow Down keys in Status'
WebUI.sendKeys(findTestObject('Objects.AddACDetails/Page_ISPS2/input__status'), Keys.chord(Keys.ARROW_DOWN))

'Enter Status'
WebUI.setText(findTestObject('Objects.AddACDetails/Page_ISPS2/input__status'), GlobalVariable.acStatus)

'Select Status'
WebUI.sendKeys(findTestObject('Objects.AddACDetails/Page_ISPS2/input__status'), Keys.chord(Keys.ARROW_DOWN))

'Send Tab keys in Status'
WebUI.sendKeys(findTestObject('Objects.AddACDetails/Page_ISPS2/input__status'), Keys.chord(Keys.TAB))

'Get Hse/Blk No value'
HseBlk = WebUI.getAttribute(findTestObject('Objects.AddACDetails/Page_ISPS2/input_formatted_hseBlkNo'), 'value')

'Get Road Name value'
RdNm = WebUI.getAttribute(findTestObject('Objects.AddACDetails/Page_ISPS2/input_formatted_roadId'), 'value')

'Get the Total Length without the Road Code'
int LengthRN = RdNm.length() - 9

'Trim the Road Name based on the get length'
TrmRdNm = RdNm.substring(0, LengthRN)

'Get Building value'
Bldg = WebUI.getAttribute(findTestObject('Objects.AddACDetails/Page_ISPS2/input_formatted_bldgName'), 'value')

'Get Level value'
LvlNo = WebUI.getAttribute(findTestObject('Objects.AddACDetails/Page_ISPS2/input__level'), 'value')

'Get Unit value'
Unit = WebUI.getAttribute(findTestObject('Objects.AddACDetails/Page_ISPS2/input_unit'), 'value')

'Get Postal Code value'
PostalCd = WebUI.getAttribute(findTestObject('Objects.AddACDetails/Page_ISPS2/input_postalCode'), 'value')

'Check if the Level field is blank'
if (LvlNo == '') {
    'If Level is blank then get this concatenated global address'
    GlobalVariable.acAddress = WebUI.concatenate(HseBlk, ' ', TrmRdNm, ' -', Unit, ' ', Bldg, ' Singapore ', PostalCd)
} else {
    'If Level have value then get this concatenated global address including the Level value'
    GlobalVariable.acAddress = WebUI.concatenate(HseBlk, ' ', TrmRdNm, ' ', LvlNo, '-', Unit, ' ', Bldg, ' Singapore ', 
        PostalCd)
}

'Highlight \'Registration Start Date\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.AddACDetails/Page_ISPS2/span_Registration Start Date'))

'Enter Registration Start Date'
WebUI.setText(findTestObject('Objects.AddACDetails/Page_ISPS2/input_Registration Start Date'), GlobalVariable.acRegStartDate)

'Highlight \'Registration End Date\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.AddACDetails/Page_ISPS2/span_Registration End Date'))

'Enter Registration End Date'
WebUI.setText(findTestObject('Objects.AddACDetails/Page_ISPS2/input_acRegEnd'), GlobalVariable.acRegEndDate)

'Highlight \'Suspension Start Date\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.AddACDetails/Page_ISPS2/span_Suspension Start Date'))

'Enter Suspension Start Date'
WebUI.setText(findTestObject('Objects.AddACDetails/Page_ISPS2/input_Suspension Start Date_suspOn'), GlobalVariable.acSuspensionStartDate)

'Highlight \'Suspension End Date\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.AddACDetails/Page_ISPS2/span_Suspension End Date'))

'Enter Suspension End Date'
WebUI.setText(findTestObject('Objects.AddACDetails/Page_ISPS2/input_acSuspendEnd'), GlobalVariable.acSuspensionEndDate)

