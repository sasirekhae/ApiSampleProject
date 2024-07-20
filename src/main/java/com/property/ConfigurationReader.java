package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hpsf.PropertySet;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class ConfigurationReader {
	public Properties p;
	public ConfigurationReader() throws IOException {
		
		File f=new File("C:\\Users\\Nayanika\\eclipse-workspace\\MavenProject\\src\\main\\java\\com\\property\\Property");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
			
	}
	
	public String getbrowser() {
		String browser = p.getProperty("Browser");
		return browser;
		
	
}

	public String geturl() {
		String url = p.getProperty("Url");
		return url;
					
	}
	
	public String getuser() {
		String user = p.getProperty("Username");
		return user;
				
	}
	public String getpass() {
		String pass = p.getProperty("Password");
		return pass;
		
		
	}

}
