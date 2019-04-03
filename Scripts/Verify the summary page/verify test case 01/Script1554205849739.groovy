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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.0.28:90/register')

WebUI.delay(10)

WebUI.click(findTestObject('Verify summary/Page_Laravel/Page_Laravel/a_SIGN IN INSTEAD (1)'))

WebUI.setText(findTestObject('Object Repository/Verify summary/Page_Laravel/Page_Laravel/input_Email_email'), 'sindhu@gmail.com')

WebUI.click(findTestObject('Object Repository/Verify summary/Page_Laravel/Page_Laravel/button_NEXT'))

WebUI.setEncryptedText(findTestObject('Object Repository/Verify summary/Page_Laravel/Page_Laravel/input_Password_password'), 
    'EKDr/xws5XY=')

WebUI.click(findTestObject('Object Repository/Verify summary/Page_Laravel/Page_Laravel/button_LOGIN'))

WebUI.verifyTextPresent('Welcome, Sindhu! ', false)

