import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
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
import org.openqa.selenium.By as By
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver

//Component Name: VerifyPlanFeesPaidByQP
//Dev: Shayne Cardona
//Date Finished: 25Mar2020
//Purpose: To verify that the Plan Fees Paid By QP displayed is correct

'Hard wait for 2 seconds.'
Thread.sleep(2000)

'Access WebDriver'
WebDriver driver = DriverFactory.getWebDriver()

'Hard wait for 2 seconds.'
Thread.sleep(10000)

'Get the tables in the page.'
listOfElements = driver.findElements(By.xpath('//span[text()=\'Used By\']//ancestor::div[@class=\'x-column-header-inner x-leaf-column-header\']//ancestor::div[@class=\'x-grid-header-ct x-docked x-ltr x-grid-header-ct-default x-docked-top x-grid-header-ct-docked-top x-grid-header-ct-default-docked-top x-box-layout-ct x-noborder-trl\']//following-sibling::div[@class=\'x-panel-body x-grid-no-row-lines x-grid-body x-panel-body-default x-panel-body-default x-noborder-rbl\']//table'))

'Hard wait for 2 seconds.'
Thread.sleep(10000)

'Count the number of table that was found in the page.'
elem = listOfElements.size()

'Convert to string.'
elem1 = elem.toString()

for (int i = 1; i <= elem; i++) {
	'Modify object.'
    modifiedDivContainingTheDateOfTheColumn = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyPlanFeesPaidByQP/divContainingTheDataOfTheColumn'), 
        'xpath', 'equals', ('//span[text()=\'Used By\']//ancestor::div[@class=\'x-column-header-inner x-leaf-column-header\']//ancestor::div[@class=\'x-grid-header-ct x-docked x-ltr x-grid-header-ct-default x-docked-top x-grid-header-ct-docked-top x-grid-header-ct-default-docked-top x-box-layout-ct x-noborder-trl\']//following-sibling::div[@class=\'x-panel-body x-grid-no-row-lines x-grid-body x-panel-body-default x-panel-body-default x-noborder-rbl\']//table[' + 
        i) + ']//td[5]//div', true)

    if (WebUI.verifyElementText(modifiedDivContainingTheDateOfTheColumn, GlobalVariable.CRN, FailureHandling.OPTIONAL)) {

		'Modify object.'
        modifiedPlanFeesCollectedColumn = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyPlanFeesPaidByQP/planFeesCollectedColumn'), 
            'xpath', 'equals', ('//span[text()=\'Used By\']//ancestor::div[@class=\'x-column-header-inner x-leaf-column-header\']//ancestor::div[@class=\'x-grid-header-ct x-docked x-ltr x-grid-header-ct-default x-docked-top x-grid-header-ct-docked-top x-grid-header-ct-default-docked-top x-box-layout-ct x-noborder-trl\']//following-sibling::div[@class=\'x-panel-body x-grid-no-row-lines x-grid-body x-panel-body-default x-panel-body-default x-noborder-rbl\']//table[' + 
            i) + ']//td[7]', true)
		
		'Get the text of the object.'
        a = WebUI.getText(modifiedPlanFeesCollectedColumn)

		'Comment the obtained text.'
        WebUI.comment(a)

		'Convert to integer.'
        int x = Integer.parseInt(a)
		
		'Add.'
        planFeesCollectedTotal = (GlobalVariable.sum + x)

		'Convert to string.'
        b = Integer.toString(planFeesCollectedTotal)

		'Comment the obtained text.'
        WebUI.comment(b)

		'Transfer the value into a global variable.'
        GlobalVariable.sum = planFeesCollectedTotal
    }
}

'Highlight element.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyPlanFeesPaidByQP/planFeesPaidByQP'))

'Get text of the object.'
planFeesPaidByQPVal = WebUI.getText(findTestObject('Objects.VerifyPlanFeesPaidByQP/planFeesPaidByQP'))

'Compare the values. Then verify that they are equal.'
WebUI.verifyEqual(GlobalVariable.sum, planFeesPaidByQPVal)

