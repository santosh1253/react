package spring.demo_proj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor staff=context.getBean(Doctor.class);
        staff.setQualification("MBBS");
        System.out.println(staff);
        Doctor doc=context.getBean(Doctor.class);
        System.out.println(doc);

    }
}
