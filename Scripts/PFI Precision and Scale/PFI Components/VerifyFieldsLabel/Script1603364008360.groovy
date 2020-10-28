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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

/* COMPONENT NAME: VerifyFieldsLabel
 * TESTER: Rhodessa Conde
 * CREATED DATE: 22-Oct-2020
 * PURPOSE: This is to verify that the fields label is in the hashmapping table. Also, serve that these fields are defined in URS.
 * REVIEWED BY:
 * REVISION BY:
 * REVISION DATE:
 */
'Modify XPath Object Property of Label Field'
modifiedLbl = WebUI.modifyObjectProperty(findTestObject('Objects.ReusableObjects/LabelXPathField'), 'xpath', 'equals', ((('//*[contains(text(),\'' + 
    HeaderLbl) + '\')]//following::span[') + index) + ']', true, FailureHandling.STOP_ON_FAILURE)

'Get Label text'
LblRemoveChar = WebUI.getText(modifiedLbl, FailureHandling.STOP_ON_FAILURE)

'Remove ":"'
GlobalVariable.FieldLbl = LblRemoveChar.replace(':', '')

'Validate the Get label text is in the Hashmap table'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/HashMap Tables/PFIUtilityFieldsValidation'), [('FieldLbl') : PFIUtil
        , ('FindLabel') : GlobalVariable.FieldLbl], FailureHandling.STOP_ON_FAILURE)

'Verify if the Value Found is not NULL, it should mark as Passed; else, mark it as Failed'
if (GlobalVariable.ValueFound != null) {
    KeywordUtil.markPassed('Match Found in Fields Validation Hashmap table')

    CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedLbl)
} else {
    KeywordUtil.markFailed('NOT Found in Fields Validation Hashmap table')
}

