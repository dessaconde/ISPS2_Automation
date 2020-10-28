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

/*==========================================================================*
 * COMPONENT NAME: ConstantHashMap				                  			*
 * TESTER: Krizia Manuel                                           			*
 * CREATE DATE: 01-June-2020                                       			*
 * PURPOSE: This is to find the constant values in HashMap tables for PFIA  *
 * =========================================================================*
 */

def ConstantTBL = [
	(1) : [('PE') : '3214'],
	(2) : [('PE') : '0567'],
	(3) : [('PEName') : 'Dummy QP Name 3861'],
	(4) : [('PEName') : 'Dummy QP Name 115'],
	(5) : [('Material') : 'Concrete'],
	(6) : [('Material') : 'Steel/Aluminium/Other metals'],
	(7) : [('Material') : 'Timber/Others'],
	(8) : [('CheckTypes') : 'Building appears over loaded'],
	(9) : [('CheckTypes') : 'Building settlement / tilt'],
	(10) : [('CheckTypes') : 'Retaining Wall Defects'],
	(11) : [('StructureType') : 'Cantilever Structures'],
	(12) : [('StructureType') : 'Roof Structures'],
	(13) : [('StructureType') : 'Outdoor Metal Structures'],
	(14) : [('ReferTo') : 'BMD'],
	(15) : [('ReferTo') : 'ENF'],
	(16) : [('ReferTo') : 'FSSB'],
	(17) : [('ReferTo') : 'URA'],
	(18) : [('ReferTo') : 'OTH'],
	(19) : [('ReferToOfficer') : 'null (TEST232)'],
	(20) : [('ReferToOfficer') : 'null (TET261)'],
	(21) : [('ReferToOfficer') : 'null (TEST267)'],
	(22) : [('ReferToOfficer') : 'null (TEST270)'],
	(23) : [('ReferToOfficer') : 'null (TEST302)'],
	(24) : [('ReminderType') : 'Reminder 2 (SF_ESID_SIS/SL-REM2)'],
	(25) : [('GradeType') : 'A'],
	(26) : [('GradeType') : 'B'],
	(27) : [('GradeType') : 'C'],
	(28) : [('GradeType') : 'D'],

]

switch (DropdownNm) {
		case 'PE':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.PE == FindValue }
			break
			
		case 'PEName':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.PEName == FindValue }
			break
			
		case 'Material':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.Material == FindValue }
			break

		case 'StructureType':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.StructureType == FindValue }
			break
				
		case 'CheckTypes':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.CheckTypes == FindValue }
			break
			
		case 'ReferTo':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.ReferTo == FindValue }
			break
			
		case 'ReferToOfficer':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.ReferToOfficer == FindValue }
			break
			
			
		case 'ReminderType':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.ReminderType == FindValue }
			break
				
		case 'GradeType':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.GradeType == FindValue }
			break
			
		default:
		WebUI.comment('Not found in the List')

		break
}
