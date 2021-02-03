import com.hq.pojo.Hello;
import com.hq.pojo.UserDao;
import com.hq.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.soap.SOAPBinding;

public class MyTest {
    public static void main(String[] args) {
//        获取spring 的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //我们的对象都在spring中的管理了
        Hello hello = context.getBean("hello3", Hello.class);
        Hello hello1 = context.getBean("hello3", Hello.class);
        System.out.println(hello == hello1);


    }
}
