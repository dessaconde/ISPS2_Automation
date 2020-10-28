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
 * COMPONENT NAME: PFICheckboxHashmap		                  				*
 * TESTER: Krizia Manuel                                           			*
 * CREATE DATE: 30-July-2020                                       			*
 * PURPOSE: To verify the checkbox against the URS 						    *
 * =========================================================================*
 */

def CheckboxTBL = [
	(1) : [('MainForm') : 'Residential'],
	(2) : [('MainForm') : 'Commercial'],
	(3) : [('MainForm') : 'Industrial'],
	(4) : [('MainForm') : 'Institutional'],
	(5) : [('MainForm') : 'Others'],
	(6) : [('MainForm') : 'Safe'],
	(7) : [('MainForm') : 'Unsafe'],
	(8) : [('MainForm') : 'Require Repair'],
	(9) : [('MainForm') : 'Require Full Facade Investigation'],
	(10) : [('MainForm') : 'Tile'],
	(11) : [('MainForm') : 'Curtain Wall with Structural Sealant Glazing (SSG)'],
	(12) : [('MainForm') : 'Composite Alum cladding (ACP)'],
	(13) : [('MainForm') : 'Building Board cladding (Calcium Silicate, cement board, Fibre etc.)'],
	(14) : [('MainForm') : 'Timber Cladding'],
	(15) : [('MainForm') : 'Brick Infill/Wall'],
	(16) : [('MainForm') : 'Precast Concrete Wall'],
	(17) : [('MainForm') : 'Green Wall'],
	(18) : [('MainForm') : 'Others'],
	(19) : [('MainForm') : 'Plaster'],
	(20) : [('MainForm') : 'Curtain Wall w/o SSG'],
	(21) : [('MainForm') : 'Metal Cladding w/o ACP'],
	(22) : [('MainForm') : 'Brick Cladding'],
	(23) : [('MainForm') : 'Stone Cladding'],
	(24) : [('MainForm') : 'Glass Block Infill Wall'],
	(25) : [('MainForm') : 'Screen Wall'],
	(26) : [('MainForm') : 'Tension Cable Facade'],
	(27) : [('MainForm') : 'Metal Sunshade'],
	(28) : [('MainForm') : 'Lighting Fixtures'],
	(29) : [('MainForm') : 'Glass Louvre'],
	(30) : [('MainForm') : 'Concrete Fin'],
	(31) : [('MainForm') : 'Glass Fin'],
	(32) : [('MainForm') : 'Clothes Drying Racks'],
	(33) : [('MainForm') : 'Others'],
	(34) : [('MainForm') : 'Sunshade (other than metal)'],
	(35) : [('MainForm') : 'Metal Louvre'],
	(36) : [('MainForm') : 'Concrete Louvre'],
	(37) : [('MainForm') : 'Metal Fin'],
	(38) : [('MainForm') : 'Advertisement / Signage'],
	(39) : [('MainForm') : 'Photovoltaic Panels'],

]

switch (Name) {
		case 'MainForm':
		GlobalVariable.ValueFound = CheckboxTBL.find { it.value.MainForm == FindValue }
			break

		default:
		WebUI.comment('Not found in the List!')

		break
}
