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
import java.util.LinkedHashMap as GroovyHashMap

/* ============================================================*
 * COMPONENT NAME: VerifyDefaultValue					       *
 * TESTER: Rhodessa Conde                                      *
 * CREATED DATE: 15-May-2020                                   *
 * PURPOSE: This is to verify the default value of input field *
 *  ===========================================================*
 */
'Wait 1 sec'
Thread.sleep(1000)

'Default Value Hashmapping table'
def DefaultValueHM = [
	('periodType') : 'Working Day(s)',
	('noOfDays') : '14',
	('inspWeight') : '1',
	('inspModule') : 'PSI',
	('inspCaseType') : 'PSI Processing (SM)']

'Modify object property: XPath'
NewFieldNm = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.HighlightElements/input_field_index'), 
    'xpath', 'equals', ((('(//*[contains(@name,\'' + FieldNm) + '\')])[') + index) + ']', true)

'Set focus in input field'
WebUI.focus(NewFieldNm)

'Get input field value'
DefVal = WebUI.getAttribute(NewFieldNm, 'value', FailureHandling.STOP_ON_FAILURE)

'Determines the default value by field name'
switch (FieldNm) {
    case 'noOfDays':
		'Verify that the default value is equal to 14'
        WebUI.verifyEqual(DefVal, findTestData('PrecisionAndScaleDB').getValue('DefaultValue', 1))

        break
    case 'courtNo':
        'Get the Case Reference No text'
        getCaseRef = WebUI.getText(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/div_Case Ref No'))
		
        'Get the length of SubmNo'
        lengthSubmNo = (getCaseRef.length() - 36)
		
        'Get the length of Case Reference No'
        lengthCaseRef = (getCaseRef.length() - 16)
		
        'Remove the Submission No'
        RemoveSubmissionNo = getCaseRef.substring(0, lengthCaseRef)

        'Get the SM Case Ref No'
        SMCaseRef = getCaseRef.substring(16, lengthSubmNo)

        'Verify if the Case Reference is equal to the default value in Notic Order No field'
        WebUI.verifyMatch(DefVal, SMCaseRef, true, FailureHandling.STOP_ON_FAILURE)

        break
    case 'caseGrpDesc':
		
		'Go to Summary screen'
        WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)
		
		'Modify Object Property: Xpath'
        modifiedLabelFld = WebUI.modifyObjectProperty(NewFieldNm, 'xpath', 'equals', ((('//*[text()=\'' + labelNm) + 
            '\']//following::div[') + i) + ']', true)
		
		'Get the new modified label name'
        GrpDesc = WebUI.getText(modifiedLabelFld)

		'Highlight the modified label name'
        CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedLabelFld)

		'Verify that the default value is matched to Summary\'s Building Group Description'
        WebUI.verifyMatch(DefVal, GrpDesc, true)

		'Go back to Court Actions screen'
        WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Court Actions'], FailureHandling.STOP_ON_FAILURE)

        break
    case 'bldgGrpId':
		
		'Go to Summary screen'
        WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

		'Modified Object Property: Xpath'
        modifiedLabelFld = WebUI.modifyObjectProperty(NewFieldNm, 'xpath', 'equals', ((('//*[text()=\'' + labelNm) + 
            '\']//following::div[') + i) + ']', true)

		'Get the Bldg Grp ID'
        BldgID = WebUI.getText(modifiedLabelFld)
		
		'Highlight the label name'
		CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedLabelFld)

		'Verify that the default value is matched to Summary Bldg ID'
        WebUI.verifyMatch(DefVal, BldgID, true, FailureHandling.STOP_ON_FAILURE)

		'Go back to Court Actions screen'
        WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Court Actions'], FailureHandling.STOP_ON_FAILURE)

        break
    default:
	
		'Search for the corresponding default value'
		ExpectedDefVal = DefaultValueHM.get(FieldNm)
		
		'Verify if the Expected Default Value is not NULL'
		if (ExpectedDefVal != null) {
			
			'Verify that the Default value is matched to the Expected Value'
			WebUI.verifyMatch(DefVal,ExpectedDefVal, false)
		} else {
		
	        'Verify if the Default Value is blank'
	        WebUI.verifyMatch(DefVal, '', true)
		}

        break
}

