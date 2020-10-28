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
import java.io.File
import java.io.IOException

/*================================================================================================*
 * COMPONENT NAME: VerifyNameValues			    			          							  *
 * TESTER: Krizia Manuel                                              							  *
 * CREATE DATE: 29-July-2020                                          							  *
 * PURPOSE: This is to validate the values for label, header, column, checkbox and radio button	  *
 * ===============================================================================================*
 */
'Initialize output file name.'
File OutputFile = new File('NameValuesResult.txt')

'Wait for 1 second.'
Thread.sleep(1000)

'Initialize the date.'
def TimeStamp = new Date()

'Modify the object\'s tag.'
modifiedTag = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyLabelName/labelName'), 'tag', 'equals', tagToModify, 
    true)

'Modify the object\'s text.'
modified = WebUI.modifyObjectProperty(modifiedTag, 'text', 'equals', textToModify, true)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(modified)

'Place the label name into a global variable.'
GlobalVariable.Name = Name

'Get attribute value and place it to a global variable.'
GlobalVariable.CopiedValue = WebUI.getText(modified)

'Call test case.'
WebUI.callTestCase(findTestCase(CallTCName), [('FindValue') : GlobalVariable.CopiedValue, ('Name') : GlobalVariable.Name], 
    FailureHandling.STOP_ON_FAILURE)

'Generate output file for searched value and found value.'
OutputFile.append(((((('Search Value: ' + GlobalVariable.CopiedValue) + ' ') + 'Found Value: ') + GlobalVariable.ValueFound) + TimeStamp) + '\n')

