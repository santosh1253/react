package Test;

import Beans.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client
{
	public static void main(String args[])
	{
		Resource r=new ClassPathResource("resoures/spring.xml");
		BeanFactory fac=new XmlBeanFactory(r);
		Object obj=fac.getBean("t");
		Test t=(Test)obj;
		t.hello();		 
	}
}