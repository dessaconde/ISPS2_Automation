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

/*==========================================================*
 * COMPONENT NAME: PFILetterTemplateValidation			    *
 * TESTER: Rhodessa Conde                                   *
 * CREATE DATE: 15-May-2020                                 *
 * PURPOSE: This is to verify the letter templates for PFI  *
 * =========================================================*
 */

def PFILetterTemplateTBL = [
	(1) : [('Reminder') : 'Ministry Of Health'],
	(2) : [('Reminder') : 'Reminder Free Format Letter'],
	(3) : [('Reminder') : 'Reminder 1 (SF_ESID_SIS/SL-REM1)'],
	(4) : [('Reminder') : 'Reminder 1-G (SF_ESID_SIS/SL-REM1-G)'],
	(5) : [('Reminder') : 'Reminder 1A (SF_ESID_SIS/SL-REM1A)'],
	(6) : [('Reminder') : 'Reminder 1-M (SF_ESID_SIS/SL-REM1-M)'],
	(7) : [('Reminder') : 'Reminder 1A-M (SF_ESID_SIS/SL-REM1A-M)'],
	(8) : [('Reminder') : 'Reminder 2 (SF_ESID_SIS/SL-REM2)'],
	(9) : [('Reminder') : 'Reminder 2-G (SF_ESID_SIS/SL-REM2-G)'],
	(10) : [('IssueWD') : '[AAPSI816] SF_ESID_SISSF-D1-G Generate Govt Notice'],
	(11) : [('IssueWD') : '[AAPSI819]  S28 Periodical Inspection Of Buildings '],
	(12) : [('IssueWD'): '[SF_ESID_SIS_SL_PE_PRESENT] SF_ESID_SIS_SL_PE_PRESENT'],
	(13) : [('IssueWD') : '[AAPSI809] eT5'],
	(14) : [('IssueWD') : '[AAPSI810] eT6'],
	(15) : [('IssueWD') : '[AAPSI801] D1 (Single Owner With Structural Plan)'],
	(16) : [('IssueWD') : '[AAPSI801W] D1 (Single Owner Without Structural Plan)'],
	(17) : [('IssueWD') : '[AAPSI802] D1 (Multiple Owners With Structural Plan)'],
	(18) : [('IssueWD') : '[AAPSI814] D1 (Single Owner With Structural Plan) - Regeneration of Notice'],
	(19) : [('IssueWD') : '[AAPSI815] D1 (Multiple Owners With Structural Plan) - Regeneration of Notice'],
	(20) : [('IssueWD') : '[AAPSI815W] D1 (Multiple Owners Without Structural Plan) - Regeneration of Notice'],
	(21) : [('IssueWD') : '[AAPSI802W] D1 (Multiple Owners Without Structural Plan)'],
	(22) : [('IssueWD') : '[ AAPSI814W]  D1 (Single Owner Without Structural Plan) - Regeneration of Notice '],
	(23) : [('IssueWD') : '[[304]AAPSI801] D1 (Single Owner With Structural Plan)'],
	(24) : [('IssueWD') : '[[306]AAPSI802] D1 (Multiple Owners With Structural Plan)'],
	(25) : [('IssueWD') : '[[307]AAPSI814] D1 (Single Owner With Structural Plan) - Regeneration of Notice'],
	(26) : [('IssueWD') : '[[308]AAPSI815] D1 (Multiple Owners With Structural Plan) - Regeneration of Notice'],
	(27) : [('IssueWD') : '[[301]AAPSI816] SF_ESID_SISSF-D1-G Generate Govt Notice'],
	(28) : [('IssueWD') : '[AAPSI806] T1'],
	(29) : [('IssueWD') : '[AAPSI807] T3'],
	(30) : [('IssueWD') : '[AAPSI808] T4'],
	(31) : [('IssueWD') : '[AAPSI820] T7'],
	(32) : [('IssueWD') : '[AAPSI821] T7C'],
	(33) : [('IssueWD') : '[eAAPSI806] eT1'],
	(34) : [('IssueWD') : '[eAAPSI807] eT3'],
	(35) : [('IssueWD') : '[eAAPSI808] eT4'],
	(36) : [('IssueWD') : '[eAAPSI809] eT5'],
	(37) : [('IssueWD') : '[eAAPSI810] eT6'],
	(38) : [('IssueWD') : '[eAAPSI820] eT7'],
	(39) : [('IssueWD') : '[eAAPSI821] eT7C'],
	(40) : [('IssueWD') : '[[[EAAPSI821] EAAPSI821_ET7C] AAPSI821] [[EAAPSI821] EAAPSI821_ET7C] AAPSI821'],
	(41) : [('IssueWD') : '[PABP05450] [PABP05450] BP Refund Letter[PABP05450][1][1]'],
	(42) : [('IssueWD') : 'T1'],
	(43) : [('IssueWD') : 'eT1'],
	(44) : [('IssueStatus') : '[AAPSI816] SF_ESID_SISSF-D1-G Generate Govt Notice'],
	(45) : [('IssueStatus') : '[AAPSI809] eT5'],
	(46) : [('IssueStatus') : '[AAPSI810] eT6'],
	(47) : [('IssueStatus') : '[AAPSI801] D1 (Single Owner With Structural Plan)'],
	(48) : [('IssueStatus') : '[AAPSI801W] D1 (Single Owner Without Structural Plan)'],
	(49) : [('IssueStatus') : '[AAPSI802] D1 (Multiple Owners With Structural Plan)'],
	(50) : [('IssueStatus') : '[AAPSI814] D1 (Single Owner With Structural Plan) - Regeneration of Notice'],
	(51) : [('IssueStatus') : '[AAPSI815] D1 (Multiple Owners With Structural Plan) - Regeneration of Notice'],
	(52) : [('IssueStatus') : '[AAPSI815W] D1 (Multiple Owners Without Structural Plan) - Regeneration of Notice'],
	(53) : [('IssueStatus') : '[AAPSI806] T1'],
	(54) : [('IssueStatus') : '[AAPSI807] T3'],
	(55) : [('IssueStatus') : '[AAPSI808] T4'],
	(56) : [('IssueStatus') : '[AAPSI820] T7'],
	(57) : [('IssueStatus') : '[AAPSI821] T7C'],
	(58) : [('IssueStatus') : '[eAAPSI806] eT1'],
	(59) : [('IssueStatus') : '[eAAPSI807] eT3'],
	(60) : [('IssueStatus') : '[eAAPSI808] eT4'],
	(61) : [('IssueStatus') : '[eAAPSI809] eT5'],
	(62) : [('IssueStatus') : '[eAAPSI810] eT6'],
	(63) : [('IssueStatus') : '[eAAPSI820] eT7'],
	(64) : [('IssueStatus') : '[eAAPSI821] eT7C'],
	(65) : [('IssueStatus'): '[AAPSI803] AAPSI803-1st reminder for D2 - Appointment of PE (Single Owner Case)'],
	(66) : [('IssueStatus') : '[AAPSI804] Second reminder for D2 - Appointment of PE (Single Owner Case)'],
	(67) : [('IssueStatus') : '[AAPSI805] 1st REMINDER TO PE'],
	(68) : [('IssueStatus') : '[AAPSI811] Free format'],
	(69) : [('IssueStatus') : '[AAPSI812] First reminder for D2 - Appointment of PE (Multiple Owners Case)'],
	(70) : [('IssueStatus') : '[AAPSI813] Second reminder for D2 - Appointment of PE (Multiple Owners Case)'],
	(71) : [('IssueStatus') : '[AAPSI817] Reminder for appointment of Structural Engineer for Government Buildings'],
	(72) : [('IssueStatus') : '[AAPSI818] 2nd REMINDER TO PE'],
	(73) : [('IssueStatus'): '[AAPSI819]  S28 Periodical Inspection Of Buildings '],
	(74) : [('IssueStatus') : '[AAPSI802W] D1 (Multiple Owners Without Structural Plan)'],
	(75) : [('IssueStatus') : '[ AAPSI814W]  D1 (Single Owner Without Structural Plan) - Regeneration of Notice '],
	(76) : [('IssueStatus') : '[[[EAAPSI821] EAAPSI821_ET7C] AAPSI821] [[EAAPSI821] EAAPSI821_ET7C] AAPSI821'],
	(77) : [('IssueStatus') : '[SF_ESID_SIS_SL_PE_PRESENT] SF_ESID_SIS_SL_PE_PRESENT'],
	(78) : [('IssueStatus') : '[[304]AAPSI801] D1 (Single Owner With Structural Plan)'],
	(79) : [('IssueStatus') : '[[306]AAPSI802] D1 (Multiple Owners With Structural Plan)'],
	(80) : [('IssueStatus') : '[[307]AAPSI814] D1 (Single Owner With Structural Plan) - Regeneration of Notice'],
	(81) : [('IssueStatus'): '[[308]AAPSI815] D1 (Multiple Owners With Structural Plan) - Regeneration of Notice'],
	(82) : [('IssueStatus') : '[[301]AAPSI816] SF_ESID_SISSF-D1-G Generate Govt Notice'],
	(89) : [('GenerateNotice') : 'with structural plans'],
	(90) : [('GenerateNotice') : 'without structral plans']
]

switch (DropdownNm) {
	case 'Reminder':
	
	GlobalVariable.ValueFound = PFILetterTemplateTBL.find({
		it.value.Reminder == FindValue
	})
		break
	case 'IssueWD':
		
	GlobalVariable.ValueFound = PFILetterTemplateTBL.find({
		it.value.IssueWD == FindValue
	})
		break
	case 'IssueStatus':
		
	GlobalVariable.ValueFound = PFILetterTemplateTBL.find({
		it.value.IssueStatus == FindValue
	})
	case 'GenerateNotice':
	
	GlobalVariable.ValueFound = PFILetterTemplateTBL.find({
		it.value.GenerateNotice == FindValue
	})
		break
	default:
	WebUI.comment('Not found in the List')
		break
}
