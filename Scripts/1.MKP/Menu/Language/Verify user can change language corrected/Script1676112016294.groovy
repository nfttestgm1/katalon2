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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://market.test.yoverse.io/')

WebUI.waitForElementClickable(findTestObject('Object Repository/1.MKP/Menu/Language/button_Menu-button'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/1.MKP/Menu/Language/button_Menu-button'))

WebUI.click(findTestObject('Object Repository/1.MKP/Menu/Language/div_Language-selection'))

WebUI.verifyElementClickable(findTestObject('Object Repository/1.MKP/Menu/Language/div_Tieng-Viet'))

WebUI.verifyElementClickable(findTestObject('Object Repository/1.MKP/Menu/Language/div_Trung-phon-the'))

WebUI.verifyElementClickable(findTestObject('Object Repository/1.MKP/Menu/Language/div_Trung-gian-the'))

WebUI.verifyElementClickable(findTestObject('Object Repository/1.MKP/Menu/Language/div_English'))

WebUI.verifyElementClickable(findTestObject('Object Repository/1.MKP/Menu/Language/button_Save'))

WebUI.verifyElementClickable(findTestObject('Object Repository/1.MKP/Menu/Language/button_Cancel'))

//Change to Tiếng Việt
WebUI.click(findTestObject('Object Repository/1.MKP/Menu/Language/div_Tieng-Viet'))
WebUI.click(findTestObject('Object Repository/1.MKP/Menu/Language/button_Save'))
WebUI.verifyElementVisible(findTestObject('Object Repository/1.MKP/Menu/Language/div_For-Collectors_vn'))

//Change to Traditional Chinese
WebUI.click(findTestObject('Object Repository/1.MKP/Menu/Language/button_Menu-button'))
WebUI.click(findTestObject('Object Repository/1.MKP/Menu/Language/div_Language-selection'))
WebUI.click(findTestObject('Object Repository/1.MKP/Menu/Language/div_Trung-phon-the'))
WebUI.click(findTestObject('Object Repository/1.MKP/Menu/Language/button_Save'))
WebUI.verifyElementVisible(findTestObject('Object Repository/1.MKP/Menu/Language/div_For-Collectors_zh-TW'))

//Change to Simplified Chinese
WebUI.click(findTestObject('Object Repository/1.MKP/Menu/Language/button_Menu-button'))
WebUI.click(findTestObject('Object Repository/1.MKP/Menu/Language/div_Language-selection'))
WebUI.click(findTestObject('Object Repository/1.MKP/Menu/Language/div_Trung-gian-the'))
WebUI.click(findTestObject('Object Repository/1.MKP/Menu/Language/button_Save'))
WebUI.verifyElementVisible(findTestObject('Object Repository/1.MKP/Menu/Language/div_For-Collectors_zh-CN'))

//Change to English
WebUI.click(findTestObject('Object Repository/1.MKP/Menu/Language/button_Menu-button'))
WebUI.click(findTestObject('Object Repository/1.MKP/Menu/Language/div_Language-selection'))
WebUI.click(findTestObject('Object Repository/1.MKP/Menu/Language/div_English'))
WebUI.click(findTestObject('Object Repository/1.MKP/Menu/Language/button_Save'))
WebUI.verifyElementVisible(findTestObject('Object Repository/1.MKP/Menu/Language/div_For-Collectors_en'))

WebUI.closeBrowser()
