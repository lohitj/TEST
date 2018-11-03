package com.capg.jee.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil 
{
	public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException
	{
		Connection con1 = null;
		
		Properties properties = loadDBProperties();
		
		Class.forName(properties.getProperty("driver"));
		
		con1=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
		
		return con1;
	}

	private static Properties loadDBProperties() throws IOException 
	{
		String path ="database.properties";
		InputStream propsFile=null;
		Properties dbProperties=new Properties();
		
		propsFile =new FileInputStream(path);
		dbProperties.load(propsFile);
		
		return dbProperties;
	}
}
