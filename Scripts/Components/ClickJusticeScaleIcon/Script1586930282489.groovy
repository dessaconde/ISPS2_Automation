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

//Component Name: ClickJusticeScaleIcon
//Author: Krizia Manuel
//Purpose: Click on Edit Page Section and Decision
'Wait for a second before proceeding to further automated steps.'
Thread.sleep(1000)

'Modify Object '
modifiedIcon = WebUI.modifyObjectProperty(findTestObject('Objects.ClickJusticeScaleIcon/Icon'), 'xpath', 'equals', ('(//div[@class=\'x-action-col-icon x-action-col-3  ncn-icon-action-decision\'])[' + 
    Index) + ']', true)

'Click.'
WebUI.click(modifiedIcon)

