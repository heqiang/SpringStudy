import com.hq.pojo.User;
import com.hq.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService user = context.getBean("userService1", UserService.class);
        String name = user.getName();
        System.out.println(name);
    }
}
