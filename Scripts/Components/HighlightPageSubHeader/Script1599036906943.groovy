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

/* COMPONENT: VerifyPageHeader
 * TESTER: Rhodessa Conde
 * CREATED DATE: 02-Sep-2020
 * PURPOSE: This component is to verify the Page Sub-Header in ISPS2
 * REVIEWED BY:
 * REVISION BY:
 * REVISION DATE:
 */
'Wait for 1 sec'
Thread.sleep(1000)

'Modified Text of Page Header Component'
modifiedPgHdr = WebUI.modifyObjectProperty(findTestObject('Objects.ReusableObjects/PageSubHeader'), 'text', 'equals', PgSubHeader, 
    true)

'Highlight the modified Page Header Component'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedPgHdr)

'Wait for 1 sec'
Thread.sleep(1000)

