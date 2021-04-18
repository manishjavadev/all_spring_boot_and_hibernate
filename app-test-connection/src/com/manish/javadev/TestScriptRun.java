package com.manish.javadev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestScriptRun {
	public static void main(String[] args) throws InterruptedException {
		String username = "root";
		String password = "manish";
		String url = "jdbc:mysql://localhost:3306/hibernatedb";

		Connection connection = null;
		try {

			connection = DriverManager.getConnection(url, username, password);

			// create ScripRunner object
			ScriptRunner scriptExecutor = new ScriptRunner(con, false, false);
			// initialize file reader
			reader = new BufferedReader(new FileReader(scriptFilePath));
			// execute script with file reader as input
			scriptExecutor.runScript(reader);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close file reader
			if (reader != null) {
				reader.close();
			}
			// close db connection
			if (con != null) {
				con.close();
			}
		}
	}
}
