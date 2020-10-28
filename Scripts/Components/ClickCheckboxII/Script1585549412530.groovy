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

//Component Name: ClickCheckboxII
//Author: Krizia Manuel
//Purpose: Click checkbox for Submission Details page.

'Wait for a second before proceeding to further automated steps.'
Thread.sleep(1000)

'Verify that \'Checklist of Blocks Assigned to PE\' is present on the page'
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.CheckListOfBlocksAssignedToPE/Page_ISPS2/div_LIST OF BLOCKS ASSIGNED TO PE'))

'Selects a record from the list'
not_run: CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.CheckListOfBlocksAssignedToPE/Page_ISPS2/Checkbox'), 
    0)

'Modify Object '
modifiedCheckBox = WebUI.modifyObjectProperty(findTestObject('Objects.ClickCheckBox/Page_ISPS2/Checkbox3'), 'xpath', 'equals', 
    ('(//div[@class=\'x-form-item-body x-form-item-body-default x-form-cb-wrap x-form-cb-wrap-default  \'])[' + Index) + 
    ']', true)

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedCheckBox)

'Click the checkbox'
not_run: CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(modifiedCheckBox, 0)

'Click.'
WebUI.click(modifiedCheckBox)

