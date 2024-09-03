package spring.jdbc_module;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        User user=(User) context.getBean("user");
       // user.createTable();
        //user.insertUser(1, "Guru");
        String uname=user.findUserNameById(1);
        System.out.println(uname);
        
    }
}
