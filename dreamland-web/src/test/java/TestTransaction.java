import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import top.aftery.entity.User;
import top.aftery.service.UserService;

/**
 * @ClassName TestTransaction
 * @Description TODO
 * @AUTHOR Aftery
 * @Date 2019-07-07
 **/
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class TestTransaction extends AbstractJUnit4SpringContextTests {

    @Autowired
    private UserService userService;

    @Test
    public  void testSave(){
        User user=new User();
        user.setNickName("封剑主-叹希奇");
        user.setEmail("123456@qq.com");
        userService.regist(user);
    }
}
