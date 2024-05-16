package com.cognizant.model;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.cognizant.helper.returnClass;
import com.cognizant.library.DBConnector;
import com.cognizant.library.IDGenerator;
public class FeedbackModel {
 public String message;
 public String email;
 public String userID;
 final public static Logger logger = Logger.getLogger(UserModel.class);
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserID() {
	return userID;
}
public void setUserID(String userID) {
	this.userID = userID;
}
public static Logger getLogger() {
	return logger;
}
public boolean insertFeedbackData() throws SQLException {
	// this.userID=generateUserId();
	String table = "user";
	String column = "userId";
	IDGenerator idg = new IDGenerator();
	this.userID = idg.generateId(column, table);
	String query = "insert into feedback values('" + this.userID + "','"
			+ this.message + "','" + this.email + " '); ";

	int numRows = 0;
	DBConnector dbc = new DBConnector();
	try {
		logger.setLevel(Level.INFO);
		logger.info("query fired is: " + query);
		numRows = dbc.fireExecuteUpdate(query);
	} catch (Exception e) {
		System.out.println("Email already in use");
		// MainClass.homePage();
	}

	dbc.close();
	if (numRows > 0) {
		return true;
	} else {
		return false;
	}
	
}

}
