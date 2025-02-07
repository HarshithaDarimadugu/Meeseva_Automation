package file_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * THIS CLASS WILL PROVIDE THE UTILITY TO READ THE DATA FROM PROPERTIES FILE DYNAMICALLY
 * 
 * @author Vijay
 */
public class PropertiesUtility {
	/**
	 * @param key which mentioned in properties file
	 * @return data which is associated with key
	 * @throws IOException
	 * @author Vijay
	 */
	public String readProperty(String key) throws IOException
	{
		String path="./src/test/resources/commondata/common.properties";
		FileInputStream fis=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}

	public void storeData(String key,String value) throws IOException
	{
		String path="./src/test/resources/commondata/common.properties";
		FileInputStream fis=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fis);
		p.setProperty(key, value);
		FileOutputStream out=new FileOutputStream(path);
		p.store(out, "");
	}
	
	public String readProperty(String filepath,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(filepath);
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
	public void storeData(String filepath,String key,String value) throws IOException
	{
		FileInputStream fis=new FileInputStream(filepath);
		Properties p=new Properties();
		p.load(fis);
		p.setProperty(key, value);
		FileOutputStream out=new FileOutputStream(filepath);
		p.store(out, "");
	}
	
//	public static void main(String[] args) throws IOException {
//		PropertiesUtility p=new PropertiesUtility();
//		String path="C:\\Users\\Vijay\\Desktop\\NPPMS\\src\\test\\resources\\common_data\\supplier_local_review.properties";
//		System.out.println(p.readProperty(path, "time"));
//	}
}
