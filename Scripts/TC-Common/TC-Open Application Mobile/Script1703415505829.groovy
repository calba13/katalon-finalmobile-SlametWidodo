import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

"STEP : Set configuration Local Mechine "
String userDirectory = System.getProperty('user.dir')

"STEP : Set configuration Path APK"
String filePath = userDirectory + '/APKPath/Advantagedemo32.apk'

"STEP : Start Application Mobile"
Mobile.startApplication(filePath, true)