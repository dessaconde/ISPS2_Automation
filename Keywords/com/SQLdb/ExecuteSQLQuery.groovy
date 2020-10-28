package com.SQLdb

import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import java.sql.Connection
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import groovy.sql.Sql
import com.microsoft.sqlserver.jdbc.SQLServerDriver

public class ExecuteSQLQuery {

	public static Connection dbConnect = null;

	public String resValue = '';

	@Keyword

	def openDBConnection(String url, String Username, String Password){

		if(dbConnect != null && !dbConnect.isClosed()) {
			dbConnect.close()
		}

		dbConnect = DriverManager.getConnection(url, Username, Password)

		return dbConnect
	}

	@Keyword

	def executeQuery(queryString){

		Statement selectQry = dbConnect.createStatement()

		ResultSet queryResult = selectQry.executeQuery(queryString)

		while(queryResult.next()){
			resValue = queryResult.getString(1)
		}

		return resValue
	}

	@Keyword

	def closeDBConnection() {
		if(dbConnect != null && !dbConnect.isClosed()) {
			dbConnect.close()
		}

		dbConnect = null
	}
}