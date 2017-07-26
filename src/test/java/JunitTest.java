import dao.TestDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import secondDao.Cutpoint;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/7/25.
 */
public class JunitTest  {

private TestDao testDao;
    @Before
    public void before(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        testDao = context.getBean(TestDao.class);
    }

    @Test
    public void test1(){
        testDao.getName();
    }

    @Test
    public void test2(){
        System.out.println("1111");
    }

    @After
    public void after(){
        System.out.println("333333");
    }

    @Test
    public void test4(){
        System.out.println("222");
        ui:
        for (int i = 0; i < 100; i++) {
            if(i!=0&&i%10==0){
                continue ui;
            }
            System.out.println("-->"+i);
        }
    }
}
