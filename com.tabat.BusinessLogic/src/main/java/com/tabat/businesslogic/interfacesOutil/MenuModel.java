/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabat.businesslogic.interfacesOutil;

import com.tabat.hibernate.dal.Categories;
import com.tabat.hibernate.dal.Products;
import java.util.List;

/**
 *
 * @author tababt
 */
public interface MenuModel {
     List<Categories> findAllCategories() throws Exception;

    Categories addCategory(Categories categories) throws Exception;

    Categories EditCategory(Categories categories) throws Exception;

    void deleteCategory(Categories categories) throws Exception;

    Categories findCategory(Categories categories) throws Exception;

    Products addProduct(Products products) throws Exception;

    Products EditProduct(Products products) throws Exception;

    void deleteProduct(Products products) throws Exception;

    List<Products> FindAllProducts() throws Exception;

    Products findProduct(Products products) throws Exception;
    
}
