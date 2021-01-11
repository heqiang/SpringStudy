import com.hq.mapper.UserMapper;
import com.hq.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper  userMapper = context.getBean("userMapper",UserMapper.class);
        List<User>  userList = userMapper.userList();
        for (User user : userList) {
            System.out.println(user);
        }
        int res = userMapper.addUser(new User(8,"hq","111"));
        if (res>0){
            System.out.println("新增成功");
        }else {
            System.out.println("新增失败");
        }



    }
}
