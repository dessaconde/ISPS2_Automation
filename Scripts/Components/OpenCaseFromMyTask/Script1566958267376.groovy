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


//ComponentName: OpenCaseFromMyTask
//Author: Shayne Cardona
//Purpose: To be able to open a case from the My Tasks

'3 seconds hard wait. '
Thread.sleep(3000)

'Get text of the object.'
crn = WebUI.getText(findTestObject('Objects.OpenCaseFromMyTask/a_case ref'))

'Transfer the value of to a global variable.'
GlobalVariable.CRN = crn

'Highlight the task description.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.OpenCaseFromMyTask/a_task desc'))

'Click the task description.'
WebUI.click(findTestObject('Objects.OpenCaseFromMyTask/a_task desc'))

'3 seconds hard wait. '
Thread.sleep(1000)

