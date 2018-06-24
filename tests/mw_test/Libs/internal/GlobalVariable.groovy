package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object test_site_url
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['test_site_url' : 'http://slave01.ci.microweber.com'])
        allVariables.put('local', allVariables['default'] + ['test_site_url' : 'http://localhost/microweber/'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        test_site_url = selectedVariables['test_site_url']
        
    }
}
