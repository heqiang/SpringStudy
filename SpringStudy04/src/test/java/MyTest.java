import com.hq.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext  context = new  ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user", User.class);
        String name = user.getName();
        System.out.println(name);
    }
}
