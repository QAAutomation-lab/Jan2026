package day21.propertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Example1 {

	public static void main(String[] args) throws IOException {
		/*
		 * File path:
		 * 	1. Absolute path: from start till to target file
		 * 			F:\Workplaces\CoreJava_Workspace\19thJan2026CoreJavaSession\TestData\TestingData.properties
		 *  2. Relative path: start from anywhere till the target file
		 *  	using current working dir(.):
		 *  		.\TestData\TestingData.properties
		 *  	using current working dir like:
		 *  		System.getProperty("user.dir"); 
		 */
		String path="F:\\Workplaces\\CoreJava_Workspace\\19thJan2026CoreJavaSession\\TestData\\TestingData.properties";
			//or
		//String path="F:/Workplaces/CoreJava_Workspace/19thJan2026CoreJavaSession/TestData/TestingData.properties";
		
		FileInputStream fis=new FileInputStream(path);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		System.out.println("url: "+prop.getProperty("url"));
		System.out.println("username: "+prop.getProperty("username"));
		System.out.println("password: "+prop.getProperty("password"));
	}

}
/*
Steps to read data from property file:
	First find the location where you have stored property file
	Create an instance of FileInputStream class and pass the property file location to its constructor.
	Create an instance of Properties class
	With the help of properties reference variable call load() properties class and pass
     FileInputStream class reference to this method
	Call getProperty(key) of Properties class to read data from property file

*/