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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys
import java.util.LinkedHashMap

Thread.sleep(1000)

def NumLengthTBL = [
	('inspWeight') : 10,
	('noOfBldg') : 10,
	('postalCode') : 6,
	('noOfLevels') : 50,
	('unitInterval') : 50,
	('startUnitNo') : 50,
	('endUnitNo') : 50,
	('endUnitNo') : 50,
	('telNo') : 12,
	('extNo') : 4,
	('mobileNo') : 12,
	('faxNo') : 12,
	('pagerNo') : 12,

	
	]

generateRandomNum = RandomStringUtils.randomNumeric(numLength)

NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.HighlightElements/input_field_index'),
	'xpath', 'equals', '(//*[contains(@class,\'x-form-text\') and (@name=\'' + InputName + '\')])[' + index + ']', true)

WebUI.setText(NewInputNmField, generateRandomNum)

GetEnteredRandom =  WebUI.getAttribute(NewInputNmField, 'value', FailureHandling.STOP_ON_FAILURE)

GetLength = GetEnteredRandom.length()

MaxLength = NumLengthTBL.get(InputName)

WebUI.verifyEqual(GetLength, MaxLength)