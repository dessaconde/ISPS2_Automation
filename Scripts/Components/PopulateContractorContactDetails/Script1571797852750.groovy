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

//Component Name: PopulateContractorContactDetails
//Dev: Shayne Cardona
//Purpose: To populate the contact details section in Contractor LHS


'Wait for 1 sec.'
Thread.sleep(1000)

'Highlight tel no field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateContractorContactDetails/Page_ISPS2/input_telNo'))

'Populate tel no field.'
WebUI.setText(findTestObject('Objects.PopulateContractorContactDetails/Page_ISPS2/input_telNo'), telNo)

'Hightlight ext no field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateContractorContactDetails/Page_ISPS2/input_telExtNo'))

'Populate ext no field.'
WebUI.setText(findTestObject('Objects.PopulateContractorContactDetails/Page_ISPS2/input_telExtNo'), extNo)

'Highlight fax no field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateContractorContactDetails/Page_ISPS2/input_faxNo'))

'Populate fax no field.'
WebUI.setText(findTestObject('Objects.PopulateContractorContactDetails/Page_ISPS2/input_faxNo'), faxNo)

'Highlight mobile no field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateContractorContactDetails/Page_ISPS2/input_mobileNo'))

'Populate mobile no field.'
WebUI.setText(findTestObject('Objects.PopulateContractorContactDetails/Page_ISPS2/input_mobileNo'), mobileNo)

'Highlight email address field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateContractorContactDetails/Page_ISPS2/input_emailAddress'))

'Populate email address field.'
WebUI.setText(findTestObject('Objects.PopulateContractorContactDetails/Page_ISPS2/input_emailAddress'), emailAddress)

'Wait for a moment before proceeding to execute further automated actions. '
Thread.sleep(3000)

