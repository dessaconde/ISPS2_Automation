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

'Wait for a second before proceeding to further automated actions. '
Thread.sleep(1000)

'Verify that the user is in \'Main Form\' LHS. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/div_Main Form'))

'Verify that \'Project Title\' field is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/span_Project Title'))

'Locates the \'Project Title\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/input__projectTitle'))

'Populates the \'Project Title\' field with dynamic variable. '
WebUI.setText(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/input__projectTitle'), projectTitle)

'Verify that \'Description of Building Works\' field is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/span_Description of Building Works'))

'Populates the \'Description of Building Works\' field with dynamic variable. '
WebUI.setText(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/textarea_Description of Building Works_descBldgWorks'), 
    descriptionOfBuildingWorks)

'Verify that \'Amendment to Plan No.\' field is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/span_Amendment to Plan No'))

'Verify that \'Classification of Works\' field is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/span_Classification of Works'))

'Locates the \'Major Alteration Works\'.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/label_Major Alteration Works'))

'Ticks the \'Major Alteration Works\'.'
WebUI.click(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/label_Major Alteration Works'))

'Locates the \'Retention Works\'. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/label_Retention Works'))

'Ticks the \'Retention Works\'.'
WebUI.click(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/label_Retention Works'))

'Verify that \'Notification of Appointment/Authorisation Form\' field is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/span_Notification of AppointmentAuthorisation Form'))

'Ticks the \'...had been previously submitted on\' radio button to enable respective date field. '
WebUI.click(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/XPI_span_had been previously submitted on_1st'))

'Locates the \'Notification of Appointment/Authorisation Form\' date field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/input_had been previously submitted on_appntPrevSubDate_1st'))

'Populates the date field with dynamic variable.'
WebUI.setText(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/input_had been previously submitted on_appntPrevSubDate_1st'), 
    notificationOfAppointmentDate)

'Verify that \'Alternative Solution Form\' field is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/span_Alternative Solution Form'))

'Ticks the \'...had been previously submitted on\' radio button to enable respective date field. '
WebUI.click(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/XPI_span_had been previously submitted on_2nd'))

'Locates the \'Alternative Solution Form\' date field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/input_had been previously submitted on_altSolutionPrevSubDate'))

'Populates the date field with dynamic variable.'
WebUI.setText(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/input_had been previously submitted on_altSolutionPrevSubDate'), 
    alternativeSolutionDate)

'Verify that \'Waiver/Modification Form\' field is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/span_WaiverModification Form'))

'Ticks the \'...had been previously submitted on\' radio button to enable respective date field. '
WebUI.click(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/XPI_span_had been previously submitted on_3rd'))

'Locates the \'Waiver/Modification Form\' date field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/input_had been previously submitted on_waiverModPrevSubDate'))

'Populates the date field with dynamic variable.'
WebUI.setText(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/input_had been previously submitted on_waiverModPrevSubDate'), 
    waiverModificationFormDate)

'Verify that \'Submitted all documents with the exception of\' field is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/span_Submitted all documents with the exception of'))

'Locates the \'Submitted all documents with the exception of\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/input_Submitted all documents with the exception of_subDocExcept'))

'Populates the field with dynamic variable.'
WebUI.setText(findTestObject('Objects.VerifyEMEMainForm/Page_ISPS2/input_Submitted all documents with the exception of_subDocExcept'), 
    submittedDocuments)

