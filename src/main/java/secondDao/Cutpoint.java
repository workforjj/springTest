package secondDao;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/25.
 */
public class Cutpoint {
    public void beforeTest(){
        System.out.print("之前...");
    }
    public void afterTest(){
        System.out.print("之后...");
    }
}
