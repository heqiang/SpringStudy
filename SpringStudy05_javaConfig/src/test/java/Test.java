import com.hq.config.Config;
import com.hq.config.Config1;
import com.hq.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config1.class);
        User user = context.getBean("MyUser", User.class);
        System.out.println(user.getName());
    }
}
