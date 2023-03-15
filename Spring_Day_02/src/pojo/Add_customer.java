package pojo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Add_customer {

	public static void main(String[] args) {
		
		
		
		Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        
        Customer add=(Customer) factory.getBean("cus");
        System.out.println(add);
	}

}
