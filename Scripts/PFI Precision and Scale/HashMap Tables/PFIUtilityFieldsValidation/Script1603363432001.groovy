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
import com.kms.katalon.core.util.KeywordUtil

/* COMPONENT NAME: PFIUtilityFieldsValidation
 * TESTER: Rhodessa Conde
 * CREATED DATE: 22-Oct-2020
 * PURPOSE: This is a hashmapping table for fields label validation in PFI Utility
 * REVIEWED BY:
 * REVISION BY:
 * REVISION DATE:
 */

def FieldsTBL = [
	(1) : [('CPFI') : 'Professional Board'],
	(2) : [('CPFI') : 'Qp No'],
	(3) : [('CPFI') : 'Name'],
	(4) : [('CPFI') : 'Company'],
	(5) : [('CPFI') : 'Is Active?'],
	(6) : [('CreateNewBldg') : 'BP No:'],
	(7) : [('CreateNewBldg') : 'Group Name'],
	(8) : [('CreateNewBldg') : 'BP No'],
	(9) : [('CreateNewBldg') : 'Group Name'],
	(10) : [('CreateNewBldg') : 'Group Building Type *'],
	(11) : [('CreateNewBldg') : 'Grade Type *'],
	(12) : [('CreateNewBldg') : 'Grp Building Category'],
	(13) : [('CreateNewBldg') : 'Agency'],
	(14) : [('CreateNewBldg') : 'Agency Owner'],
	(15) : [('CreateNewBldg') : 'TOP/CSC Reference No'],
	(16) : [('CreateNewBldg') : 'TOP/CSC Date *'],
	(17) : [('CreateNewBldg') : 'Owner Type *'],
	(18) : [('CreateNewBldg') : 'MC ST No'],
	(19) : [('CreateNewBldg') : 'Project Title Description'],
	(20) : [('CreateNewBldg') : 'Group Description *'],
	(21) : [('CreateNewBldg') : 'Last Inspection Date *'],
	(22) : [('CreateNewBldg') : 'Created Date *'],
	(23) : [('CreateNewBldg') : 'is Active?'],
	(24) : [('MergeBldg') : 'Group Building ID 1 *'],
	(25) : [('MergeBldg') : 'Group Building ID 2 *'],
	(26) : [('FacadeInspDet'): 'FI Reg No.'],
	(27) : [('FacadeInspDet'): 'NRIC'],
	(28) : [('FacadeInspDet'): 'Name'],
	(29) : [('FacadeInspDet'): 'Is Active?'],
]

switch (FieldLbl) {
	case 'CPFI':
		GlobalVariable.ValueFound = FieldsTBL.find({
				it.value.CPFI == FindLabel
			})
		break
		
	case 'CreateNewBldg':
		GlobalVariable.ValueFound = FieldsTBL.find({
				it.value.CreateNewBldg == FindLabel
			})
		break
		
	case 'MergeBldg':
		GlobalVariable.ValueFound = FieldsTBL.find({
				it.value.MergeBldg == FindLabel
			})
		break
	case 'FacadeInspDet':
		GlobalVariable.ValueFound = FieldsTBL.find({
				it.value.FacadeInspDet == FindLabel
			})
		break
	default:
		KeywordUtil.markFailedAndStop('Not in the list. Please double check.')

		break
}
