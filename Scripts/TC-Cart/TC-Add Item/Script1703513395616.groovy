import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject

import internal.GlobalVariable as GlobalVariable

//"STEP : Start Application Mobile"
//Mobile.callTestCase(findTestCase('TC-Common/TC-Open Application Mobile'), [:], FailureHandling.STOP_ON_FAILURE)
//
//'STEP : INPUT FORM LOGIN'
//Mobile.callTestCase(findTestCase('TC-Login/TC-Login'), [('username') : GlobalVariable.username, ('password') : GlobalVariable.password], 
//    FailureHandling.STOP_ON_FAILURE)

'STEP : ADD Item'
CustomKeywords.'finalProjectKW.Cart.additem'(categoryItem, categoryName, quantity)

