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

Thread.sleep(1000)

WebUI.click(findTestObject('Objects.VerifyBuilder/Page_ISPS2/div_Builder'))

Thread.sleep(5000)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyBuilder/Page_ISPS2/div_Builder_Header'))

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyQualifiedPerson/Page_ISPS2/XPA_QualifiedPersonTable1'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyBuilder/Page_ISPS2/XP_FirmName'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyBuilder/Page_ISPS2/XP_Name'))

Thread.sleep(2000)

WebUI.click(findTestObject('Objects.VerifyBuilder/Page_ISPS2/div_Summary'))

Thread.sleep(5000)

WebUI.scrollToElement(findTestObject('Objects.VerifyQualifiedPerson/Page_ISPS2/div_Qualified Person_SummaryPage'), 0)

