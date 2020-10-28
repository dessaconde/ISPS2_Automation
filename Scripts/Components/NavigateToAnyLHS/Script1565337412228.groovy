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

//Component Name: NavigateToAnyLHS
//Dev: Shayne Cardona
//Purpose: To be able to navigate to any lhs by just modifying the object's text

//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
'Wait for a moment before proceeding to further automated actions. '
Thread.sleep(1000)

'Modifies the \'text\' property of the object to dynamically click it. '
modifiedLHS = WebUI.modifyObjectProperty(findTestObject('Objects.NavigateToAnyLHS/Page_ISPS2/LHSToModify'), 'text', 'equals', 
    LHS, true)

'Clicks the modified object and navigates the user to the desired LHS. '
WebUI.click(modifiedLHS)

'Get the \'text\' of the current LHS.'
GlobalVariable.currentLHS = WebUI.getText(modifiedLHS)

'Wait for 5 secs.'
Thread.sleep(5000)

