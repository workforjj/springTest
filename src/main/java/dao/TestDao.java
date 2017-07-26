package dao;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/25.
 */
@Service
public class TestDao {
    public  void  getName(){
        System.out.println("sucesss!");
    };
    public void showContents(){
        System.out.println("this is a showtime!");
    };
}
