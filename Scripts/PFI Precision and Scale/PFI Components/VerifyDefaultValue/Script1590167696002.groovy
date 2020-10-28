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

/* ============================================================*
 * COMPONENT NAME: VerifyDefaultValue					       *
 * TESTER: Rhodessa Conde                                      *
 * CREATED DATE: 15-May-2020                                   *
 * PURPOSE: This is to verify the default value of input field *
 *  ===========================================================*
 */
'Wait 1 sec'
Thread.sleep(1000)

'Modify the Input Name'
NewFieldNm = WebUI.modifyObjectProperty(findTestObject('Objects.HighlightElements/input_field'), 'name', 'equals', FieldNm, 
    true)

'Set focus in input field'
WebUI.focus(NewFieldNm)

'Get input field value'
DefVal = WebUI.getAttribute(NewFieldNm, 'value', FailureHandling.STOP_ON_FAILURE)

switch (FieldNm) {
    case 'noOfDays':
        WebUI.verifyEqual(DefVal, findTestData('PrecisionAndScaleDB').getValue('DefaultValue', 1))

        break
    case 'NoticeOrderNo':
        'Get the Case Reference No text'
        getCaseRef = WebUI.getText(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/div_Case Ref No'))

        'Get the length of SubmNo'
        lengthSubmNo = (getCaseRef.length() - 35)

        'Get the length of Case Reference No'
        lengthCaseRef = (getCaseRef.length() - 17)

        'Remove the Submission No'
        RemoveSubmissionNo = getCaseRef.substring(0, lengthCaseRef)

        'Get the SM Case Ref No'
        SMCaseRef = getCaseRef.substring(16, lengthSubmNo)

        'Verify if the Case Reference is equal to the default value in Notic Order No field'
        WebUI.verifyMatch(DefVal, SMCaseRef, true, FailureHandling.STOP_ON_FAILURE)

        break
    case 'GrpBldgID':
        WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

        BldgID = WebUI.getText(findTestObject('Object Repository/Objects.VerifyDefaultValue/Page_ISPS2/label_field'))

        WebUI.verifyMatch(DefVal, BldgID, true, FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Court Actions'], FailureHandling.STOP_ON_FAILURE)

        break
    case 'periodType':
        WebUI.verifyMatch(DefVal, findTestData('PrecisionAndScaleDB').getValue('DefaultValue', 2), false)

        break
    default:
        'Verify if the Default Value is blank'
        WebUI.verifyMatch(DefVal, '', true)

        break
}

