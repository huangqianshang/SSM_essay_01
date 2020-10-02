package com.hqs.dao;

import com.hqs.domain.Product;
import com.hqs.domain.UserInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.core.userdetails.User;

import java.util.Date;
import java.util.List;


public class TestMybatis {
    private ProductDao dao;
    private UserDao userDao;
    @Before
    public void first(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        dao = ac.getBean (ProductDao.class);
        userDao = ac.getBean (UserDao.class);
    }
    @Test
    public void findAll(){
        List < Product > productList = dao.findAll ( );
        for (Product product:
             productList) {
            System.out.println (product );
        }
    }
    @Test
    public void insert(){
        Product product = new Product ();
        product.setId ("1");
        product.setDepartureTime (new Date ());
        product.setProductStatus (0);
        product.setCityName ("cs");
        product.setProductDesc ("ASdsa");
        product.setProductName ("Asdsa");
        product.setProductNum ("istes");
        product.setProductPrice (1000);
        dao.add (product);
    }
    @Test
    public void k(){
        List < UserInfo > all = userDao.findAll ( );
        for (UserInfo u:
             all) {
            System.out.println (u );
        }
    }
}
