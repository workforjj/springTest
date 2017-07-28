package secondDao;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/25.
 */
@Aspect
public class Cutpoint {
    private  String name;
    @Pointcut("execution(* dao.TestDao.getargsfun(String))&& args(names)")
    public  void  dealfun(String names){}
    @Before("dealfun(names)")
    public void beforeTest(String names){
        this.name = names;
        System.out.print("之前...");
    }
    @After("dealfun(names)")
    public void afterTest(String names){
        System.out.print("之后...");
    }
}
