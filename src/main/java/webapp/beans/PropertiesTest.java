package webapp.beans;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

public class PropertiesTest {
	
	static Log log = LogFactory.getLog(PropertiesTest.class);
	
	@Test
	public void test() throws IOException {
		
		ClassPathResource resource = new ClassPathResource("/message.properties");
		
		Properties prop = new Properties();
		prop.load(resource.getInputStream());
		
		String value = prop.getProperty("required");
		
		log.info("value = " + value);
		
		log.info(prop.getProperty("typeMismatch"));
		
	}

}
