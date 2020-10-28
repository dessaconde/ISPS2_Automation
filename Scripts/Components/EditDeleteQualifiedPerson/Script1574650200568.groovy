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
import org.openqa.selenium.Keys as Keys


//Component Name: EditDEleteQualifiedPerson
//Author: Shayne Cardona
//Purpose: To edit and delete a record in qualified person lhs

'Wait for a moment before proceeding to execute further automated actions. '
Thread.sleep(1000)

'Highlight qp name.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyQualifiedPersonV2/XPIA_Name'))

not_run: WebUI.click(findTestObject('Objects.EditDeleteQualifiedPerson/XPIA_Name'))

'Click the qp name field.'
CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.EditDeleteQualifiedPerson/XPIA_Name'), 
    0)

'Populate the qp name field.'
WebUI.setText(findTestObject('Objects.EditDeleteQualifiedPerson/input__qpName'), qpNameToDelete)

'Wait for a moment before proceeding to execute further automated actions. '
Thread.sleep(2000)

'Send enter key on qp name field.'
WebUI.sendKeys(findTestObject('Objects.EditDeleteQualifiedPerson/input__qpName'), Keys.chord(Keys.ENTER))

'Click save button.'
WebUI.click(findTestObject('Objects.EditDeleteQualifiedPerson/span_save'))

'Wait for a moment before proceeding to execute further automated actions. '
Thread.sleep(3000)

'Verify that the record was updated successfully.'
WebUI.verifyTextPresent('Updated Successfully!', false)

'Wait for a moment before proceeding to execute further automated actions. '
Thread.sleep(3000)

'Click delete button.'
WebUI.click(findTestObject('Objects.EditDeleteQualifiedPerson/XPI_Delete'))

'Wait for a moment before proceeding to execute further automated actions. '
Thread.sleep(3000)

'Verify that the record was deleted succesfully.'
WebUI.verifyTextPresent('Selected Record(s) are deleted successfully.', false)

