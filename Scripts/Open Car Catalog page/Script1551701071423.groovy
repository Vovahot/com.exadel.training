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

WebUI.openBrowser('https://www.onliner.by/')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Page_Onliner/img__onliner_logo'), 3)

WebUI.waitForElementPresent(findTestObject('Object Repository/script_mode/Page_Onliner/span_'), 3)

WebUI.click(findTestObject('Object Repository/script_mode/Page_Onliner/span_'))

WebUI.waitForPageLoad(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/script_mode/Page_        -/h1_'), 5)

WebUI.selectOptionByValue(findTestObject('script_mode/Page_/select_'), '5', false)

WebUI.waitForElementPresent(findTestObject('Object Repository/script_mode/Page_        -/h1_'), 5)

WebUI.waitForPageLoad(5)

String carCatalogTitle = WebUI.getText(findTestObject('Object Repository/script_mode/Page_        -/h1_'))

WebUI.verifyEqual(carCatalogTitle, 'BMW')

WebUI.closeBrowser()

