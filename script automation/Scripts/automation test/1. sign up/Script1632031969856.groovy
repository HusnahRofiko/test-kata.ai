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

WebUI.waitForElementClickable(findTestObject('2. automation sign up/1. btn sign in'), 0)

WebUI.click(findTestObject('2. automation sign up/1. btn sign in'))

WebUI.setText(findTestObject('2. automation sign up/2. email'), GlobalVariable.gmail)

WebUI.click(findTestObject('2. automation sign up/2. btn create account'))

String title = GlobalVariable.title

if (title.equals('mr')) {
    WebUI.click(findTestObject('2. automation sign up/3. title mr'))
} else {
    WebUI.click(findTestObject('2. automation sign up/4. title mrs'))
}

WebUI.setText(findTestObject('2. automation sign up/5. first name'), GlobalVariable.nama)

WebUI.setText(findTestObject('2. automation sign up/5. last name'), GlobalVariable.nama)

WebUI.setText(findTestObject('2. automation sign up/6. password'), GlobalVariable.password)

WebUI.selectOptionByValue(findTestObject('2. automation sign up/7. birthday date'), GlobalVariable.date, false)

WebUI.selectOptionByValue(findTestObject('2. automation sign up/8. birthday month'), GlobalVariable.month, false)

WebUI.selectOptionByValue(findTestObject('2. automation sign up/9. birthday year'), GlobalVariable.year, false)

WebUI.setText(findTestObject('2. automation sign up/10. firstname_address'), GlobalVariable.nama)

WebUI.setText(findTestObject('2. automation sign up/12. lastname_address'), GlobalVariable.nama)

WebUI.setText(findTestObject('2. automation sign up/13. company'), GlobalVariable.company_name)

WebUI.setText(findTestObject('2. automation sign up/14. address'), GlobalVariable.address)

WebUI.setText(findTestObject('2. automation sign up/15. address2'), GlobalVariable.address)

WebUI.setText(findTestObject('2. automation sign up/16. city'), GlobalVariable.city)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('2. automation sign up/17. state'), GlobalVariable.state, false)

WebUI.setText(findTestObject('2. automation sign up/18. postal code'), GlobalVariable.postal_code)

WebUI.selectOptionByValue(findTestObject('2. automation sign up/19. country'), GlobalVariable.country, false)

WebUI.setText(findTestObject('2. automation sign up/20. additional information'), GlobalVariable.address)

WebUI.setText(findTestObject('2. automation sign up/21 home phone'), GlobalVariable.phone)

WebUI.setText(findTestObject('2. automation sign up/22. mobile phone'), GlobalVariable.phone)

WebUI.setText(findTestObject('2. automation sign up/24. assign address'), GlobalVariable.alias)

WebUI.click(findTestObject('2. automation sign up/23. button register'))

WebUI.waitForElementClickable(findTestObject('4. automation logout/1. btn logout'), 0)

WebUI.delay(2)

