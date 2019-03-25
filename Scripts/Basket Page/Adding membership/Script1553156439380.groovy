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

WebUI.navigateToUrl('http://192.168.0.28:90/list')

WebUI.navigateToUrl('http://192.168.0.28:90/detail/5/PREMIER/0')

WebUI.click(findTestObject('Object Repository/Adding membership_OR/Page_PREMIER/small_Add to Basket  Checkout'))

WebUI.click(findTestObject('Object Repository/Adding membership_OR/Page_PREMIER/a_Membership'))

WebUI.navigateToUrl('http://192.168.0.28:90/detail/6/FULL/1')

WebUI.click(findTestObject('Object Repository/Adding membership_OR/Page_FULL/small_Add to Basket  Checkout'))

WebUI.click(findTestObject('Object Repository/Adding membership_OR/Page_FULL/a_2680.00'))

F = WebUI.getAttribute(findTestObject('Full'), '1')

P = WebUI.getAttribute(findTestObject('Premier'), '1')

int T = F + P

V=WebUI.getAttribute(findTestObject('Cart(2)'), '2')

