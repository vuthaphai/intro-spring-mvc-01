package com.vp.learning.spring.mvc.springmvc.controllers;

import com.vp.learning.spring.mvc.springmvc.domain.Product;
import com.vp.learning.spring.mvc.springmvc.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/product/list")
    public String listProducts(Model model){
        model.addAttribute("products", productService.listAll());
        return "product/list";
    }

    @RequestMapping("/product/show/{id}")
    public String getProduct(@PathVariable Integer id, Model model){

        model.addAttribute("product", productService.getById(id));
        return "product";

    }

    @RequestMapping("/product/new")
    public String createProduct( Model model){

        model.addAttribute("product", new Product());
        return "product-form";

    }

    @RequestMapping("/product")
    public String saveOrUpdateProduct( Product product){

        Product saveProduct = productService.saveOrUpdate(product);
        return "redirect:/product/" + saveProduct.getId();

    }

    @RequestMapping("product/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("product", productService.getById(id));
        return "product-form";
    }

    @RequestMapping("/product/delete/{id}")
    public String delete(@PathVariable Integer id){
        productService.delete(id);
        return "redirect:/products";
    }





}
