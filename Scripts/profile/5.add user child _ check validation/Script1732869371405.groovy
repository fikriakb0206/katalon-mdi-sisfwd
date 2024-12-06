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

WebUI.navigateToUrl(url)

WebUI.waitForElementClickable(findTestObject('Object Repository/Login/Page_Home  Rajawali Putra Logistik/x_pop_up'), 0)

WebUI.click(findTestObject('Object Repository/Login/Page_Home  Rajawali Putra Logistik/x_pop_up'))

WebUI.click(findTestObject('Object Repository/Login/Page_Home  Rajawali Putra Logistik/button_Login'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Login  Rajawali Putra Logistik/username'), username)

WebUI.setText(findTestObject('Login/Page_Login  Rajawali Putra Logistik/password'), password)

WebUI.click(findTestObject('Object Repository/Login/Page_Login  Rajawali Putra Logistik/button_Masuk'))

WebUI.click(findTestObject('profile/Page_Akun  Rajawali Putra Logistik/menu_akun_staff'))

WebUI.click(findTestObject('Object Repository/profile/add user child/add_user_child'))

WebUI.click(findTestObject('Object Repository/profile/add user child/button_Simpan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/profile/add user child/validation/validation_office_wajib_dipilih'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/profile/add user child/validation/validation_username_wajib_diisi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/profile/add user child/validation/validation_email_wajib_diisi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/profile/add user child/validation/validation_password_wajib_diisi_min_6_karakter'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/profile/add user child/validation/validation_konfirmasi_password_wajib_diisi_minimal_6_karakter'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/profile/add user child/validation/validation_telepon_wajib_diisi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/profile/add user child/validation/validation_role_wajib_dipilih'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/profile/add user child/validation/validation_divisi_wajib_dipilih'), 
    0)

WebUI.closeBrowser()

