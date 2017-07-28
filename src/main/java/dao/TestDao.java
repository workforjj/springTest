package dao;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/25.
 */
@Service
public class TestDao implements  testImpl{
    public  void  getName(){
        System.out.println("sucesss!");
    };
    public void showContents(){
        System.out.println("this is a showtime!");
    };
    public void  getargsfun(String name){
        System.out.println("是的"+name);
    }
}
