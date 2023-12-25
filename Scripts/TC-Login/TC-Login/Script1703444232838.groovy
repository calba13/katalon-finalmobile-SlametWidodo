import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'STEP : PILIH MENU'
WebUI.callTestCase(findTestCase('TC-Navigation/TC-Pilih Menu'), [('menu') : 'login'], FailureHandling.STOP_ON_FAILURE)

'STEP : INPUT FORM LOGIN'
CustomKeywords.'finalProjectKW.Login.login'(username, password)

//'STEP : Verify value Username'
//Mobile.verifyElementText(findTestObject('Object Repository/Mobile/Navigation/LogOut/nav001_Username'), username, FailureHandling.STOP_ON_FAILURE)

