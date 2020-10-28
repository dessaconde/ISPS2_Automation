import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Wait for a moment before proceeding to further autmoated steps. '
Thread.sleep(1000)

'Verify that \'Lift Number\' that was set in Main Form is reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.liftNumber, false)

'Verify that \'Waiver/Modification of Building Regulation\' that was set in Main Form is reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.radioButton, false)

'Verify that \'Category of Provision\' that was set in Main Form is reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.categoryOfProvision, false)

'Verify that \'Provision Made On\' that was set in Main Form is reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.provisionMadeOn, false)

'Verify that \'Regulation/Clause\' that was set in Main Form is reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.regulationClause, false)

'Verify that \'Description\' that was set in Main Form is reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.Description, false)

