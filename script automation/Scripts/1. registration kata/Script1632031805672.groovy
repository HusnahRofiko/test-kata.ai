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

WebUI.navigateToUrl('https://platform.kata.ai/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('1. registration/1. btn sign up'))

WebUI.waitForElementVisible(findTestObject('1. registration/2. username'), 0)

WebUI.setText(findTestObject('1. registration/2. username'), GlobalVariable.nama)

WebUI.setText(findTestObject('1. registration/3. email'), GlobalVariable.gmail)

String role = GlobalVariable.role

if (role.equals('profesional')) {
    WebUI.click(findTestObject('1. registration/4. role profesional'))

    WebUI.setText(findTestObject('1. registration/7. company name'), GlobalVariable.company_name)
} else {
    WebUI.click(findTestObject('1. registration/5. role student'))

    WebUI.setText(findTestObject('1. registration/8. student name'), GlobalVariable.school_name)
}

'waktu input captcha manual'
WebUI.delay(2)

'waktu input captcha manual'
WebUI.delay(15)

WebUI.click(findTestObject('1. registration/9. btn sign up'))

WebUI.navigateToUrl('https://platform.kata.ai/login')

