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

'Login to ISPS2. '
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 16), ('Password') : findTestData(
            'Datatable').getValue('Password', 15)], FailureHandling.STOP_ON_FAILURE)

'Navigate the user to \'My Tasks\' tab.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Filter tasks - \'Process EME Waiver Application\'.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME Waiver Application'], FailureHandling.STOP_ON_FAILURE)

'Select a case type depending on input - Lift/Escalator.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/SmartSelectForEMECaseType'), [('caseType') : 'Lift'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Main Form.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

'Sets a value for WAP Meeting Date. '
WebUI.callTestCase(findTestCase('Components/ManipulateWAPMeeting'), [('WAPMeetingDate') : '16/06/2020'], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Back\' button in Main Form - Lift Details page to check its functionality.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Back', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Adds an entry/record in Lift Number section.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/AddNewLiftOrEscNumber'), [('entryNumber') : 'L001'], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Adds an entry/record in Lift Number section.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/AddNewLiftOrEscNumber'), [('entryNumber') : 'L002'], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Adds an entry/record in Lift Number section.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/AddNewLiftOrEscNumber'), [('entryNumber') : 'L003'], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Adds an entry/record in Lift Number section.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/AddNewLiftOrEscNumber'), [('entryNumber') : 'L004'], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Adds an entry/record in Lift Number section.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/AddNewLiftOrEscNumber'), [('entryNumber') : 'L005'], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Adds an entry/record in Lift Number section.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/AddNewLiftOrEscNumber'), [('entryNumber') : 'L001'], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Delete\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Delete', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'No\' button in the pop-up to verify its functionality. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'No', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Delete\' button in Main Form - Lift Details page to finally verify its functionality. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Delete', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Yes\' button in the pop-up to verify its functionality. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Yes', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Selects a dynamic value from radio button. '
WebUI.callTestCase(findTestCase('Components/SelectOptionFromRadioButtons'), [('radioButtonLabel') : 'SS 550:2009'], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Adds a record in the \'Regulatory Requirement\' table!'
WebUI.callTestCase(findTestCase('Components/NewRegulatoryRequirement'), [('categoryOfProvision') : 'Lift Well', ('provisionMadeOn') : 'Plan'
        , ('regulationClause') : '\'Regulation/Clause\' automated populate test. ', ('Description') : '\'Description\' automated populate test. '], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Adds a record in the \'Regulatory Requirement\' table!'
WebUI.callTestCase(findTestCase('Components/NewRegulatoryRequirement'), [('categoryOfProvision') : 'Machine and pulley spaces'
        , ('provisionMadeOn') : 'Site', ('regulationClause') : '\'Regulation/Clause\' automated populate test. ', ('Description') : '\'Description\' automated populate test. '], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Adds a record in the \'Regulatory Requirement\' table!'
WebUI.callTestCase(findTestCase('Components/NewRegulatoryRequirement'), [('categoryOfProvision') : 'Landing doors', ('provisionMadeOn') : 'Plan'
        , ('regulationClause') : '\'Regulation/Clause\' automated populate test. ', ('Description') : '\'Description\' automated populate test. '], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Adds a record in the \'Regulatory Requirement\' table!'
WebUI.callTestCase(findTestCase('Components/NewRegulatoryRequirement'), [('categoryOfProvision') : 'Cars', ('provisionMadeOn') : 'Site'
        , ('regulationClause') : '\'Regulation/Clause\' automated populate test. ', ('Description') : '\'Description\' automated populate test. '], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Adds a record in the \'Regulatory Requirement\' table!'
WebUI.callTestCase(findTestCase('Components/NewRegulatoryRequirement'), [('categoryOfProvision') : 'Counterweights', ('provisionMadeOn') : 'Plan'
        , ('regulationClause') : '\'Regulation/Clause\' automated populate test. ', ('Description') : '\'Description\' automated populate test. '], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Adds a record in the \'Regulatory Requirement\' table!'
WebUI.callTestCase(findTestCase('Components/NewRegulatoryRequirement'), [('categoryOfProvision') : 'Suspension, compensation and overspeed protection'
        , ('provisionMadeOn') : 'Site', ('regulationClause') : '\'Regulation/Clause\' automated populate test. ', ('Description') : '\'Description\' automated populate test. '], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Adds a record in the \'Regulatory Requirement\' table!'
WebUI.callTestCase(findTestCase('Components/NewRegulatoryRequirement'), [('categoryOfProvision') : 'Guide rails, buffers and final limit switches'
        , ('provisionMadeOn') : 'Plan', ('regulationClause') : '\'Regulation/Clause\' automated populate test. ', ('Description') : '\'Description\' automated populate test. '], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Adds a record in the \'Regulatory Requirement\' table!'
WebUI.callTestCase(findTestCase('Components/NewRegulatoryRequirement'), [('categoryOfProvision') : 'Clearances and runbys'
        , ('provisionMadeOn') : 'Site', ('regulationClause') : '\'Regulation/Clause\' automated populate test. ', ('Description') : '\'Description\' automated populate test. '], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Adds a record in the \'Regulatory Requirement\' table!'
WebUI.callTestCase(findTestCase('Components/NewRegulatoryRequirement'), [('categoryOfProvision') : 'Lift machine', ('provisionMadeOn') : 'Plan'
        , ('regulationClause') : '\'Regulation/Clause\' automated populate test. ', ('Description') : '\'Description\' automated populate test. '], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Adds a record in the \'Regulatory Requirement\' table!'
WebUI.callTestCase(findTestCase('Components/NewRegulatoryRequirement'), [('categoryOfProvision') : 'Electric installations and appliances'
        , ('provisionMadeOn') : 'Site', ('regulationClause') : '\'Regulation/Clause\' automated populate test. ', ('Description') : '\'Description\' automated populate test. '], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Adds a record in the \'Regulatory Requirement\' table!'
WebUI.callTestCase(findTestCase('Components/NewRegulatoryRequirement'), [('categoryOfProvision') : 'Emergency operations for lifts'
        , ('provisionMadeOn') : 'Plan', ('regulationClause') : '\'Regulation/Clause\' automated populate test. ', ('Description') : '\'Description\' automated populate test. '], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Adds a record in the \'Regulatory Requirement\' table!'
WebUI.callTestCase(findTestCase('Components/NewRegulatoryRequirement'), [('categoryOfProvision') : 'Energy conservation'
        , ('provisionMadeOn') : 'Site', ('regulationClause') : '\'Regulation/Clause\' automated populate test. ', ('Description') : '\'Description\' automated populate test. '], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Adds a record in the \'Regulatory Requirement\' table!'
WebUI.callTestCase(findTestCase('Components/NewRegulatoryRequirement'), [('categoryOfProvision') : 'Interferences', ('provisionMadeOn') : 'Plan'
        , ('regulationClause') : '\'Regulation/Clause\' automated populate test. ', ('Description') : '\'Description\' automated populate test. '], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Adds a record in the \'Regulatory Requirement\' table!'
WebUI.callTestCase(findTestCase('Components/NewRegulatoryRequirement'), [('categoryOfProvision') : 'Type test requirements'
        , ('provisionMadeOn') : 'Site', ('regulationClause') : '\'Regulation/Clause\' automated populate test. ', ('Description') : '\'Description\' automated populate test. '], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button in Main Form - Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Adds a record in the \'Regulatory Requirement\' table!'
WebUI.callTestCase(findTestCase('Components/NewRegulatoryRequirement'), [('categoryOfProvision') : 'Others', ('provisionMadeOn') : 'Plan'
        , ('regulationClause') : '\'Regulation/Clause\' string limit test (1000Strings): Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Enim ut sem viverra aliquet eget sit. Venenatis a condimentum vitae sapien pellentesque habitant. Facilisi cras fermentum odio eu feugiat pretium nibh ipsum consequat. Ut etiam sit amet nisl purus in. Tellus in metus vulputate eu scelerisque felis. Vitae suscipit tellus mauris a diam maecenas sed enim. Vel risus commodo viverra maecenas accumsan lacus vel. Ullamcorper malesuada proin libero nunc consequat interdum. Habitant morbi tristique senectus et netus. Sed augue lacus viverra vitae congue eu. Tellus integer feugiat scelerisque varius morbi enim. Vitae proin sagittis nisl rhoncus mattis rhoncus urna neque viverra. Odio morbi quis commodo odio aenean sed adipiscing diam. Faucibus pulvinar elementum integer enim neque volutpat. Nibh sit amet commodo nulla facilisi nullam vehicula ipsum. Integer malesuada nun.'
        , ('Description') : '\'Description\' string limit test (1000Strings): Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Magna etim tempor orci eu lobortis elementum nibh tellus molestie. Dui vivamus arcu felis bibendum. Semper feugiat nibh sed pulvinar proin gravida. Mauris cursus mattis molestie a iaculis at. Volutpat consequat mauris nunc congue nisi vitae suscipit. In fermentum et sollicitudin ac orci phasellus egestas tellus rutrum. Pretium viverra suspendisse potenti nullam ac tortor vitae. Porttitor massa id neque aliquam vestibulum morbi blandit. Tellus pellentesque eu tincidunt tortor aliquam. Diam quam nulla porttitor massa id neque aliquam vestibulum morbi. Faucibus turpis in eu mi bibendum neque egestas. Massa tempor nec feugiat nisl pretium. Eu ultrices vitae auctor eu augue ut lectus arcu. Posuere lorem ipsum dolor sit amet consectetur adipiscing elit. Maecenas volutpat blandit aliquam etiam erat. Ferment gutom na me huhu.'], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Save\' button to apply changes.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify successful saved changes. '
WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Save\' button to apply changes.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Navigate to Main Form.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Verify that the data manipulated in Main Form is reflected in Summary page. '
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/VerifyManipulatedDataInEMEWaiver'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate to Homepage before logging the user out. '
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Logs the user out. '
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

