import com.lx.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Mybatis测试类
 */
public class Demo01 {

    @Test
    public void test() throws IOException {

        //获取applicationContext文件并加载
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取UserDao对象
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");

        //执行方法
        System.out.println(userDao.userCount());
    }
}
