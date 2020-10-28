
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


def static "com.reusableComponents.clickUsingJS.clickUsingJS"(
    	TestObject to	
     , 	int timeout	) {
    (new com.reusableComponents.clickUsingJS()).clickUsingJS(
        	to
         , 	timeout)
}

def static "com.SQLdb.ExecuteSQLQuery.openDBConnection"(
    	String url	
     , 	String Username	
     , 	String Password	) {
    (new com.SQLdb.ExecuteSQLQuery()).openDBConnection(
        	url
         , 	Username
         , 	Password)
}

def static "com.SQLdb.ExecuteSQLQuery.executeQuery"(
    	Object queryString	) {
    (new com.SQLdb.ExecuteSQLQuery()).executeQuery(
        	queryString)
}

def static "com.SQLdb.ExecuteSQLQuery.closeDBConnection"() {
    (new com.SQLdb.ExecuteSQLQuery()).closeDBConnection()
}

def static "com.reusableComponents.HighlightElement.run"(
    	TestObject objectto	) {
    (new com.reusableComponents.HighlightElement()).run(
        	objectto)
}
