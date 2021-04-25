package com.anil.automation.test.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestUtils {

	Properties pr = new Properties();
	public String GetValue(String key) {
		FileInputStream is;
		try {
			is = new FileInputStream("src/main/resources/com/anil/automation/config/TestConfig.properties");
			try {
				pr.load(is);
				return(pr.get(key).toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return(pr.get(key).toString());
	}
}
