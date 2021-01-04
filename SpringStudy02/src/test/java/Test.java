import com.hq.pojo.Personal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Personal  personal = context.getBean("personal",Personal.class);
        personal.getCat().shout();
        personal.getDog().shout();
    }
}
