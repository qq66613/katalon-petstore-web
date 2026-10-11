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

WebUI.setText(findTestObject('Login/Password-field'), GlobalVariable.password)

WebUI.verifyElementVisible(findTestObject('Login/Button-login'))

WebUI.click(findTestObject('Login/Button-login'))

WebUI.verifyElementVisible(findTestObject('Beranda Success Login/MyAccount'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Beranda Success Login/Welcome-user'))

// List category
def categoryViews = ['View-Product/Bird-view', 'View-Product/cat-view', 'View-Product/dogs-view', 'View-Product/fish-view'
    , 'View-Product/reptile-view']

// List verification
def categoryVerifications = ['View-Product/verify-birds', 'View-Product/verify-cats', 'View-Product/verify-dogs', 'View-Product/verify-fish'
    , 'View-Product/verify-reptils']

for (int i = 0; i < categoryViews.size(); i++) {
    WebUI.click(findTestObject(categoryViews[i]))

    WebUI.verifyElementPresent(findTestObject(categoryVerifications[i]), 10)

    WebUI.verifyElementPresent(findTestObject('Return-to-menu/to-menu'), 5)

    WebUI.click(findTestObject('Return-to-menu/to-menu'))
}

WebUI.click(findTestObject('View-Product/dogs-view'))

WebUI.verifyElementPresent(findTestObject('to-detail/dogs-view-product-poodles'), 10)

WebUI.verifyElementPresent(findTestObject('to-detail/dogs-id-product-poodles'), 10)

WebUI.click(findTestObject('to-detail/dogs-id-product-poodles'))

WebUI.verifyTextPresent('Poodle', true)

def productDetails = ['detail-product-pet/view-product-poodle-dog-id', 'detail-product-pet/view-product-poodel-dog', 'detail-product-pet/List-Price-1-Poodle-dog'
    , 'detail-product-pet/Desc-product-poodle-dog', 'detail-product-pet/Add-To-Cart-On-Page-Poodle-dog']

for (String objectPath : productDetails) {
    WebUI.verifyElementPresent(findTestObject(objectPath), 10)
}

WebUI.click(findTestObject('detail-product-pet/Click-To-detail-View-Poodle'))


WebUI.closeBrowser()

