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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.delay(2)

/*BldrSpcName = WebUI.getText(findTestObject('Object.AdhocReport/Page_ISPS2/QueryBSPCName'))

BldrSpcFirm = WebUI.getText(findTestObject('Object.AdhocReport/Page_ISPS2/QueryBSPCFirmName'))

GlobalVariable.BSN = BldrSpcName
GlobalVariable.BSF = BldrSpcFirm*/
System.out.println(SPL_BldgValue1)

System.out.println(SPL_BldgValue2)

//WebUI.verifyElementText(findTestObject('Object.AdhocReport/Page_ISPS2/SPL_BLDGWORKS_ROW2Value'),' ')

if ((SPL_BldgValue1 == '') && (SPL_BldgValue2 == ''))
	{
		KeywordUtil.markFailed('Failed')
	}

if ((SPL_BldgValue1 == '') || (SPL_BldgValue2 == '')) {
    //WebUI.verifyTextPresent(SPL_BldgValue2, true)
    //WebUI.verifyTextPresent(SPL_BldgValue1, true)
    if (SPL_BldgValue1 == '') {
        WebUI.verifyTextPresent(SPL_BldgValue2, true)
    } else if (SPL_BldgValue2 == '') {
        WebUI.verifyTextPresent(SPL_BldgValue1, true)
    } else {
        KeywordUtil.markFailed('Failed')
    }

}

