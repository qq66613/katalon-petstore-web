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

WebUI.openBrowser(GlobalVariable.baseUrl)

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Login/Sign-in'))

WebUI.click(findTestObject('Login/Sign-in'))

WebUI.verifyElementVisible(findTestObject('Login/Username-field'))

WebUI.setText(findTestObject('Login/Username-field'), GlobalVariable.username)

WebUI.verifyElementVisible(findTestObject('Login/Password-field'))

WebUI.setText(findTestObject('Login/Password-field'), 'Nganjuk_009')

WebUI.verifyElementVisible(findTestObject('Login/Button-login'))

WebUI.click(findTestObject('Login/Button-login'))

WebUI.verifyElementText(findTestObject('Login/Invalid-credential'), 'Invalid username or password. Signon failed.')

WebUI.closeBrowser()

