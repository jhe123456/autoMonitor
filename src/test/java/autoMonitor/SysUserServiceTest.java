package autoMonitor;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hp.autoMonitor.web.model.SysUser;
import com.hp.autoMonitor.web.service.UserService;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

public class SysUserServiceTest {
//	private ApplicationContext ac = null;
  @Resource
  private UserService userService = null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

  @SuppressWarnings("deprecation")
@Test
  public void test1() {
      for (int i=0;i<10;i++){
      SysUser user = new SysUser();
      user.setId(i);
      user.setUserName("test"+i);
      user.setFullName("测试"+i);
      user.setWorkEmail(i+"@gmail.com");
      userService.insert(user);

      }
  }

    public static final void main(String[] args){
      System.out.println("--------");

    }
}