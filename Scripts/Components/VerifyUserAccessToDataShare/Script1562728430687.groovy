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

'Hard coded wait for visualization purposes. '
Thread.sleep(3000)

'Finds the username of the user in the current session. '
WebUI.verifyElementPresent(findTestObject('Objects.VerifyUserAccessToDataShare/ScriptContainingUsername'), 0)

//WebUI.getAttribute(findTestObject('Objects.VerifyUserAccessToDataShare/ScriptContainingUsername'), 'text')
'After locating the username, get the \'text\' attribute of the object. \r\n\'Text\' attribute contains the username string in it. '
rawTextValueOfScript = WebUI.getAttribute(findTestObject('Objects.VerifyUserAccessToDataShare/ScriptContainingUsername'), 
    'text')

'If the username extracted is in the list of authenticated users, then verify that the user can access the Data Share page. '
if (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((( //Group (G446)
rawTextValueOfScript.contains('SYSADMIN') || rawTextValueOfScript.contains('KWANWYE')) || rawTextValueOfScript.contains(
    'LEONGSIONG')) || rawTextValueOfScript.contains('SHUNING')) || rawTextValueOfScript.contains('USACFM')) || rawTextValueOfScript.contains(
    'WANGQIN')) || //User (U450)
rawTextValueOfScript.contains('KHENGWAH')) || //User (R72 - Role?)
rawTextValueOfScript.contains('AARON')) || rawTextValueOfScript.contains('AGO')) || rawTextValueOfScript.contains('ANGELINEC')) || 
rawTextValueOfScript.contains('ANNA')) || rawTextValueOfScript.contains('BERNARD')) || rawTextValueOfScript.contains('BPMJTC')) || 
rawTextValueOfScript.contains('BPMLTA')) || rawTextValueOfScript.contains('CHARMAINE')) || rawTextValueOfScript.contains(
    'CHEEKAI')) || rawTextValueOfScript.contains('CHILEONG')) || rawTextValueOfScript.contains('CLARYCE')) || rawTextValueOfScript.contains(
    'CLEMENT')) || rawTextValueOfScript.contains('CMLIAN')) || rawTextValueOfScript.contains('DWEIKAY')) || rawTextValueOfScript.contains(
    'EEPENG')) || rawTextValueOfScript.contains('ENGHUAT')) || rawTextValueOfScript.contains('EVONNE')) || rawTextValueOfScript.contains(
    'FARIDA')) || rawTextValueOfScript.contains('HAISAN')) || rawTextValueOfScript.contains('HOONGING')) || rawTextValueOfScript.contains(
    'JIAHNG')) || rawTextValueOfScript.contains('JOANNE')) || rawTextValueOfScript.contains('JORDAN')) || rawTextValueOfScript.contains(
    'JWUYIH')) || rawTextValueOfScript.contains('KAIHUI')) || rawTextValueOfScript.contains('KELUN')) || rawTextValueOfScript.contains(
    'KINMING')) || rawTextValueOfScript.contains('KOKLAM')) || rawTextValueOfScript.contains('KUNLIN')) || rawTextValueOfScript.contains(
    'KWANJOO')) || rawTextValueOfScript.contains('LAIPOH')) || rawTextValueOfScript.contains('LEEMENG')) || rawTextValueOfScript.contains(
    'MAGTAN')) || rawTextValueOfScript.contains('MAXXU')) || rawTextValueOfScript.contains('MUNHUNG')) || rawTextValueOfScript.contains(
    'NKKOH')) || rawTextValueOfScript.contains('NNHB')) || rawTextValueOfScript.contains('ORHHAI')) || rawTextValueOfScript.contains(
    'PEISHI')) || rawTextValueOfScript.contains('PEISZE')) || rawTextValueOfScript.contains('PHLEE-DEFUCNT')) || rawTextValueOfScript.contains(
    'RACHELTAN')) || rawTextValueOfScript.contains('RAYMOND')) || rawTextValueOfScript.contains('SIAMIMM')) || rawTextValueOfScript.contains(
    'SIANGLOONG')) || rawTextValueOfScript.contains('SIEWHENG')) || rawTextValueOfScript.contains('SINKAI')) || rawTextValueOfScript.contains(
    'SIONGBOON')) || rawTextValueOfScript.contains('TENGHAN')) || rawTextValueOfScript.contains('TZESIANG')) || rawTextValueOfScript.contains(
    'USAANS')) || rawTextValueOfScript.contains('USABMA-DEFUNCT')) || rawTextValueOfScript.contains('USACCN')) || rawTextValueOfScript.contains(
    'USADVL')) || rawTextValueOfScript.contains('USAFLC')) || rawTextValueOfScript.contains('USAGIE')) || rawTextValueOfScript.contains(
    'USAHBT')) || rawTextValueOfScript.contains('USAHKC')) || rawTextValueOfScript.contains('USAHVC')) || rawTextValueOfScript.contains(
    'USAKHY')) || rawTextValueOfScript.contains('USAKTL')) || rawTextValueOfScript.contains('USALCY')) || rawTextValueOfScript.contains(
    'USALJJ')) || rawTextValueOfScript.contains('USALSH')) || rawTextValueOfScript.contains('USAMKS')) || rawTextValueOfScript.contains(
    'USANSL')) || rawTextValueOfScript.contains('USASLL')) || rawTextValueOfScript.contains('USATCE')) || rawTextValueOfScript.contains(
    'USAWPC')) || rawTextValueOfScript.contains('USAWWK')) || rawTextValueOfScript.contains('YEEHAR')) || rawTextValueOfScript.contains(
    'YENNEE-DEFUNCT')) || rawTextValueOfScript.contains('YEWKHEONG')) || rawTextValueOfScript.contains('YICHUN')) {
    'The text "You are not authorized to view this page." should not be displayed if the user has access to Data Share page. '
    WebUI.verifyTextNotPresent('You are not authorized to view this page.', false)
} else {
    'Else, if the username extracted is not in the list of authenticated users then the user should see the text "You are not authorized to view this page.".'
    WebUI.verifyTextPresent('You are not authorized to view this page.', false)
}

