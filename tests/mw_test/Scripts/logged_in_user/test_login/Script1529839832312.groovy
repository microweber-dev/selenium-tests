import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('http://slave01.ci.microweber.com:8080/admin')
def driver = DriverFactory.getWebDriver()
driver.manage().window().maximize();


String baseUrl = "http://slave01.ci.microweber.com:8080/admin"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.windowMaximize()

selenium.open("http://slave01.ci.microweber.com:8080/admin")
for (int second = 0;; second++) {
	if (second >= 60) fail("timeout");
	try { if (selenium.isVisible("name=username")) break; } catch (Exception e) {}
	Thread.sleep(1000);
}

selenium.click("name=username")
selenium.type("name=username", "admin")
for (int second = 0;; second++) {
	if (second >= 60) fail("timeout");
	try { if (selenium.isVisible("name=password")) break; } catch (Exception e) {}
	Thread.sleep(1000);
}

selenium.click("name=password")
selenium.type("name=password", "password")
selenium.click("//input[@value='Login']")
selenium.click("link=Website")
for (int second = 0;; second++) {
	if (second >= 60) fail("timeout");
	try { if (selenium.isVisible("link=Add new page")) break; } catch (Exception e) {}
	Thread.sleep(1000);
}

