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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://10.240.198.47/ui/login.html')

WebUI.setText(findTestObject('Object Repository/Page_1024019847 - Lenovo XClarity Administrator  Login/input_User name_username'), 
    GlobalVariable.G_login)

WebUI.setText(findTestObject('Object Repository/Page_1024019847 - Lenovo XClarity Administrator  Login/input_Password_password'), 
    GlobalVariable.G_Password)

WebUI.click(findTestObject('Object Repository/Page_1024019847 - Lenovo XClarity Administrator  Login/span_Log In_1'))

WebUI.click(findTestObject('Object Repository/Page_1024019847 - Lenovo XClarity Administrator/div_Hardware'))

WebUI.click(findTestObject('Object Repository/Page_1024019847 - Lenovo XClarity Administrator/td_Discover and Manage New Devices'))

WebUI.click(findTestObject('Object Repository/Page_1024019847 - Lenovo XClarity Administrator/span_Manual Input'))

WebUI.setText(findTestObject('Object Repository/Page_1024019847 - Lenovo XClarity Administrator/input_Host Name or IP Address_lxca_customUI_discovery_discovery_0_manualIputDialog0_singleIPaddrId'), 
    '10.240.193.218')

WebUI.click(findTestObject('Object Repository/Page_1024019847 - Lenovo XClarity Administrator/span_OK'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Page_1024019847 - Lenovo XClarity Administrator/div_Stored Credentials_dijitReset dijitArrowButtonInner'))

WebUI.click(findTestObject('Object Repository/Page_1024019847 - Lenovo XClarity Administrator/td_'))

WebUI.click(findTestObject('Object Repository/Page_1024019847 - Lenovo XClarity Administrator/input__dijit_form_CheckBox_4'))

WebUI.click(findTestObject('Object Repository/Page_1024019847 - Lenovo XClarity Administrator/span_Manage'))

WebUI.waitForPageLoad(30)

WebUI.closeBrowser()

