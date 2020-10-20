package com.hqs.service.imp;

import com.hqs.domain.Product;
import com.hqs.service.ProductService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestProductServiceImp {
    private ApplicationContext ac;

    @Before
    public void first() {
        ac = new ClassPathXmlApplicationContext ("spring/applicationContext.xml");
    }

    @Test
    public void testProductServiceImp() {
        ProductService productService = (ProductService) ac.getBean ("productService");
        List < Product > products = productService.findAll (1,4);
        for (Product p :
                products) {
            System.out.println (p);
        }
    }

}
