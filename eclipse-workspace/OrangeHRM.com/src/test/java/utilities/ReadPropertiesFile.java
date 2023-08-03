package utilities;
import java.io.FileReader;
import java.util.Properties;
public class ReadPropertiesFile {
	
	public  void  readProp() {
		String path="C:\\Users\\pawle\\eclipse-workspace\\OrangeHRM.com\\src\\test\\resources\\configfiles\\config.properties";
	try {
		FileReader  fis=new  FileReader(path);
		Properties pro=new Properties();
		pro.load(fis);
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("url"));
		
	} catch (Exception e) 
	{
		// TODO: handle exception
	}
}
	
}
