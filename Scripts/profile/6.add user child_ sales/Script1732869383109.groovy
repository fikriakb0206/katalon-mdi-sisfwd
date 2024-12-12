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

WebUI.navigateToMaskedUrl(url)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Home  Rajawali Putra Logistik/x_pop_up'), 0)

WebUI.click(findTestObject('Object Repository/Login/Page_Home  Rajawali Putra Logistik/x_pop_up'))

WebUI.click(findTestObject('Object Repository/Login/Page_Home  Rajawali Putra Logistik/button_Login'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Login  Rajawali Putra Logistik/username'), username)

WebUI.setText(findTestObject('Object Repository/Login/Page_Login  Rajawali Putra Logistik/password'), password)

WebUI.click(findTestObject('Object Repository/Login/Page_Login  Rajawali Putra Logistik/button_Masuk'))

WebUI.click(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/menu_akun_staff'))

WebUI.click(findTestObject('Object Repository/profile/add user child/add_user_child'))

WebUI.click(findTestObject('Object Repository/profile/add user child/office'))

WebUI.click(findTestObject('Object Repository/profile/add user child/list_office RPL Jakarta'))

WebUI.setText(findTestObject('Object Repository/profile/add user child/username'), username1)

WebUI.setText(findTestObject('Object Repository/profile/add user child/email'), email)

WebUI.setText(findTestObject('Object Repository/profile/add user child/password'), password1)

WebUI.setText(findTestObject('Object Repository/profile/add user child/Konfirmasi Password'), konfirmasi_pass)

WebUI.setText(findTestObject('Object Repository/profile/add user child/telepon'), tlp)

WebUI.click(findTestObject('Object Repository/profile/add user child/role'))

WebUI.click(findTestObject('Object Repository/profile/add user child/role_sales'))

WebUI.click(findTestObject('Object Repository/profile/add user child/division'))

WebUI.click(findTestObject('Object Repository/profile/add user child/div_sales'))

WebUI.click(findTestObject('Object Repository/profile/add user child/menu/menu_quotation'))

WebUI.click(findTestObject('Object Repository/profile/add user child/menu/menu_sales_order'))

WebUI.click(findTestObject('Object Repository/profile/add user child/menu/menu_bidding'))

WebUI.click(findTestObject('Object Repository/profile/add user child/menu/menu_bidding_project'))

WebUI.click(findTestObject('Object Repository/profile/add user child/menu/menu_bidding_daily'))

WebUI.click(findTestObject('Object Repository/profile/add user child/menu/menu_company'))

WebUI.click(findTestObject('Object Repository/profile/add user child/menu/menu_contact'))

WebUI.click(findTestObject('Object Repository/profile/add user child/button_Simpan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/profile/add user child/pop_up_User_Berhasil_ditambahkan'), 0)

WebUI.closeBrowser()



