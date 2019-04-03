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

WebUI.setText(findTestObject('Object Repository/Page_Laravel/input_First name _firstname (1) (1) (1)'), 'Sindhu')

WebUI.setText(findTestObject('Object Repository/Page_Laravel/input_Last name _lastname (1) (1) (1)'), 'Pilla')

WebUI.setText(findTestObject('Object Repository/Page_Laravel/input_Date of birth _birthday (1) (1) (1)'), '19-01-1997')

WebUI.setText(findTestObject('Object Repository/Page_Laravel/input_Email _email (1) (1)'), 'sindhu@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Laravel/input_Password _password (1)'), 'EKDr/xws5XY=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Laravel/input_Confirm password _password_confirmation (1)'), 
    'EKDr/xws5XY=')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Laravel/button_REGISTER'))

