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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.baidu.com/')

WebUI.setText(findTestObject('Object Repository/baidu/Page_/input__wd'), 'katalon')

WebUI.click(findTestObject('Object Repository/baidu/Page_/input__su'))

WebUI.click(findTestObject('baidu/Page_katalon_/a_Katalon  Simplify Web API Mobile Desktop _e116d6'))

WebUI.getWindowIndex(FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex('1')

WebUI.waitForElementClickable(findTestObject('baidu/Page_Katalon  Simplify Web API Mobile Deskt_8a6745/a_Sign In'), 300)

WebUI.click(findTestObject('Object Repository/baidu/Page_Katalon  Simplify Web API Mobile Deskt_8a6745/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/baidu/Page_Sign in  Katalon Solution/input_Sign in to Katalon_user_email'), 
    'ggshen50@163.com')

WebUI.setEncryptedText(findTestObject('Object Repository/baidu/Page_Sign in  Katalon Solution/input_Sign in to Katalon_user_pass'), 
    'yx8Xcl2RSsRRq0fO56n8Yw==')

WebUI.click(findTestObject('Object Repository/baidu/Page_Sign in  Katalon Solution/form_Remember me'))

WebUI.click(findTestObject('Object Repository/baidu/Page_Sign in  Katalon Solution/input_Remember me_login-btn'))

WebUI.waitForElementClickable(findTestObject('baidu/Page_Katalon Account  Katalon Solution/close_limit_instruction'), 120)

WebUI.click(findTestObject('baidu/Page_Katalon Account  Katalon Solution/close_limit_instruction'))

WebUI.getText(findTestObject('baidu/Page_Katalon Account  Katalon Solution/full_name'))

WebUI.closeBrowser()

