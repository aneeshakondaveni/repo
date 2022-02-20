package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() {
		File src=new File("C:\\Users\\Chandra Shekar\\eclipse-workspace\\Ibanking\\Configurations\\config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getURL() {
		String url=pro.getProperty("URL");
		return url;
	}
	public String getUname() {
		String url=pro.getProperty("uname");
		return url;
	}
	public String getpsdL() {
		String url=pro.getProperty("pswd");
		return url;
	}
	
	public String getcromepath() {
		String url=pro.getProperty("chromepath");
		return url;
	}
	
	public String getfirefoxpath() {
		String url=pro.getProperty("firefoxpath");
		return url;
	}

}
