import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

//'STEP : Start Application Mobile'
//Mobile.callTestCase(findTestCase('TC-Common/TC-Open Application Mobile'), [:], FailureHandling.STOP_ON_FAILURE)
//
//'STEP : INPUT FORM LOGIN'
//Mobile.callTestCase(findTestCase('TC-Login/TC-Login'), [('username') : GlobalVariable.username, ('password') : GlobalVariable.password], 
//    FailureHandling.STOP_ON_FAILURE)

'STEP : CHECK OUT'
CustomKeywords.'finalProjectKW.Cart.checkoutCart'("cart")
