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

CustomKeywords.'com.SQLdb.ExecuteSQLQuery.openDBConnection'(findTestData('Datatable').getValue(1, 23), findTestData('Datatable').getValue(
        2, 23), findTestData('Datatable').getValue(3, 23))

Result = CustomKeywords.'com.SQLdb.ExecuteSQLQuery.executeQuery'('SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_GRADE_TYPE\' and NAME = \'A\'')

println(Result)

Match = WebUI.verifyMatch('A', Result, false)

println(Match)

CustomKeywords.'com.SQLdb.ExecuteSQLQuery.closeDBConnection'()

