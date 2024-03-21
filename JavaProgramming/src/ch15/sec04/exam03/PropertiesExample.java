package ch15.sec04.exam03;

import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));

		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		System.out.println("username : " + username);
		System.out.println("password : " + password);

	}

}
