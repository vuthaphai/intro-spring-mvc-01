package com.vp.learning.spring.mvc.springmvc.services;

import com.vp.learning.spring.mvc.springmvc.domain.DomainObject;
import com.vp.learning.spring.mvc.springmvc.domain.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service
public class ProductServiceImpl extends AbstractMapService implements ProductService {

    private Map<Integer, Product> products;


    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }



    @Override
    public Product getById(Integer id) {
        return (Product) super.getById(id);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

    @Override
    public Product saveOrUpdate(Product domainObject) {
        return (Product) super.saveOrUpdate(domainObject);
    }



    @Override
    protected void loadDomainObjects() {
        products = new HashMap<>();

        Product product1 = new Product();
        product1.setId(1);
        product1.setDescription("Product 1");
        product1.setPrice(new BigDecimal("12.99"));
        product1.setImageUrl("http://example.com/product1");

        products.put(1, product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setDescription("Product 2");
        product2.setPrice(new BigDecimal("14.99"));
        product2.setImageUrl("http://example.com/product2");

        products.put(2, product2);

        Product product3 = new Product();
        product3.setId(3);
        product3.setDescription("Product 3");
        product3.setPrice(new BigDecimal("34.99"));
        product3.setImageUrl("http://example.com/product3");

        products.put(3, product3);

        Product product4 = new Product();
        product4.setId(4);
        product4.setDescription("Product 4");
        product4.setPrice(new BigDecimal("44.99"));
        product4.setImageUrl("http://example.com/product4");

        products.put(4, product4);

        Product product5 = new Product();
        product5.setId(5);
        product5.setDescription("Product 2");
        product5.setPrice(new BigDecimal("25.99"));
        product5.setImageUrl("http://example.com/product5");

        products.put(5, product5);
    }

}
