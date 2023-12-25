package finalProjectKW

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement

public class Cart {


	@Keyword
	def selectItemByName(String categoryName) {

		boolean itemFound = false
		AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()
		MobileElement listItemCategory = driver.findElementByXPath("//*[@class = 'android.widget.GridView' and @resource-id = 'com.Advantage.aShopping:id/gridViewProducts']")
		List<MobileElement> dataItems = listItemCategory.findElementsByXPath("//*[@class = 'android.widget.RelativeLayout' and @resource-id = 'com.Advantage.aShopping:id/RelativeLayoutProductControl' and @package = 'com.Advantage.aShopping']")
		int items_count = dataItems.size()

		// println("total list category ada $items_count")

		LOOP: for (int dataSelection = 0; dataSelection < items_count; dataSelection++) {

			MobileElement itemCategory = dataItems.get(dataSelection).findElementByXPath("//*[@class = 'android.widget.TextView' and @resource-id = 'com.Advantage.aShopping:id/textViewProductName']")
			// new customKW.common().cetak("ini isi itemCategory Text : ${itemCategory.getText()}");
			if (itemCategory.getText() == categoryName) {
				// new customKW.common().cetak("KLIK");
				itemCategory.click()
				Mobile.delay(GlobalVariable.MaxLoading)
				itemFound = true
				LOOP: break
			}
		}

		return itemFound
	}



	@Keyword
	def additem(String categoryItem, String categoryName, String qty) {
		def defaultVar = new customKW.common().defaultVar();
		String tcTitle = "Add Product to Cart"
		try {

			if(Mobile.verifyElementExist(findTestObject('Object Repository/Mobile/Navigation/nav000_HamburgerMenu'), GlobalVariable.MaxLoading, FailureHandling.OPTIONAL)) {
				Mobile.tap(findTestObject('Object Repository/Mobile/Navigation/nav000_HamburgerMenu'), GlobalVariable.MaxLoading)
			}

			Mobile.callTestCase(findTestCase('TC-Navigation/TC-Pilih Menu'), [('menu') : categoryItem], FailureHandling.STOP_ON_FAILURE)

			boolean isLoop = true
			while(isLoop) {

				boolean isFound = selectItemByName(categoryName)

				if(isFound) {
					isLoop = false
				} else {
					Mobile.scrollToText(categoryName, FailureHandling.STOP_ON_FAILURE)
					Mobile.delay(GlobalVariable.MaxLoading)
				}
			}

			int quantity = qty.toInteger()

			if(quantity != 1) {
				Mobile.tap(findTestObject('Object Repository/Mobile/CART/ListProduct/screenDetailProduct/btn_Quantity'), GlobalVariable.MaxLoading)
				Mobile.delay(GlobalVariable.MaxLoading)
				for(int i=1; i < quantity; i++) {
					Mobile.tap(findTestObject('Object Repository/Mobile/CART/ListProduct/screenDetailProduct/screenUpdateQuantity/btn_plusQuantity'), GlobalVariable.MaxLoading)
					//Mobile.delay(GlobalVariable.MaxLoading)
				}
				Mobile.tap(findTestObject('Object Repository/Mobile/CART/ListProduct/screenDetailProduct/screenUpdateQuantity/btn_applyUpdateQuantity'), GlobalVariable.MaxLoading)
			}

			Mobile.delay(GlobalVariable.MaxLoading)
			Mobile.tap(findTestObject('Object Repository/Mobile/CART/ListProduct/screenDetailProduct/btn_AddToCart'), GlobalVariable.MaxLoading)

			Mobile.delay(GlobalVariable.MaxLoading)
			Mobile.tap(findTestObject('Object Repository/Mobile/CART/ListProduct/screenDetailProduct/btn_BackToScreen'), GlobalVariable.MaxLoading)

			defaultVar["messageList"] << ["message" : "TestCase : ${tcTitle}"]
			defaultVar["messageList"] << ["message" : "QC STATUS : GOOD"]
			defaultVar["messageList"] << ["message" : ""]
		} catch (Exception e) {

			defaultVar["isSuccess"] = false;
			defaultVar["messageList"] << ["message" : "TestCase : ${tcTitle}"]
			defaultVar["messageList"] << ["message" : "Remark : Error Exception_ ${e}"]
			defaultVar["messageList"] << ["message" : "QC STATUS : NOT GOOD"]
			defaultVar["messageList"] << ["message" : ""]
		}

		new customKW.common().cetak("defaultVar : ${defaultVar}");
		new customKW.common().generateStepReport(defaultVar["isSuccess"], defaultVar["messageList"])
	}
	
	
	@Keyword
	def checkoutCart(String selectMenu) {
		def defaultVar = new customKW.common().defaultVar();
		String tcTitle = "Check Out Cart"
		try {

//			Mobile.tap(findTestObject('Mobile/Navigation/nav07_divCart'), 0)
			Mobile.callTestCase(findTestCase('TC-Navigation/TC-Pilih Menu'), [('menu') : selectMenu], FailureHandling.STOP_ON_FAILURE)
			
			// Mobile.delay(GlobalVariable.MaxLoading)
			Mobile.tap(findTestObject('Mobile/CART/CheckOut/btn_CHECKOUT'), 0)
			
			Mobile.delay(GlobalVariable.MaxLoading)
			// Handle if Login Error (No Connection)
			boolean isErrorCHECKOUT = true
			
			while (isErrorCHECKOUT) {
				if (Mobile.verifyElementVisible(findTestObject('Mobile/CART/CheckOut/btn_CHECKOUT'), GlobalVariable.MaxLoading, FailureHandling.OPTIONAL)) {
					Mobile.tap(findTestObject('Mobile/CART/CheckOut/btn_CHECKOUT'), GlobalVariable.MaxLoading)
				} else {
					isErrorCHECKOUT = false
				}
			}
			
			Mobile.tap(findTestObject('Mobile/CART/CheckOut/Order Payment/03 btn-PAY NOW'), 0)
			Mobile.takeScreenshot()
			Mobile.tap(findTestObject('Object Repository/Mobile/CART/CheckOut/Order Payment/btn_closeAlert'), 0)
			

			defaultVar["messageList"] << ["message" : "TestCase : ${tcTitle}"]
			defaultVar["messageList"] << ["message" : "QC STATUS : GOOD"]
			defaultVar["messageList"] << ["message" : ""]
		} catch (Exception e) {

			defaultVar["isSuccess"] = false;
			defaultVar["messageList"] << ["message" : "TestCase : ${tcTitle}"]
			defaultVar["messageList"] << ["message" : "Remark : Error Exception_ ${e}"]
			defaultVar["messageList"] << ["message" : "QC STATUS : NOT GOOD"]
			defaultVar["messageList"] << ["message" : ""]
		}

		new customKW.common().cetak("defaultVar : ${defaultVar}");
		new customKW.common().generateStepReport(defaultVar["isSuccess"], defaultVar["messageList"])
	}
}
