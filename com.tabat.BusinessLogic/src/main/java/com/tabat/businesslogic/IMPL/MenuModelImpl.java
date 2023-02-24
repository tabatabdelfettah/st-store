/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabat.businesslogic.IMPL;

import com.tabat.businesslogic.interfacesOutil.MenuModel;
import com.tabat.hibernate.dal.Categories;
import static com.tabat.hibernate.dal.HibernateManager.HibernateDBManager.BeginTransaction;
import static com.tabat.hibernate.dal.HibernateManager.HibernateDBManager.commitTransaction;
import static com.tabat.hibernate.dal.HibernateManager.HibernateDBManager.getcommonRepo;
import static com.tabat.hibernate.dal.HibernateManager.HibernateDBManager.rollBackTransaction;
import com.tabat.hibernate.dal.Products;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;


/**
 *
 * @author tababt
 */
public class MenuModelImpl implements MenuModel {

    @Override
    public List<Categories> findAllCategories() throws Exception {
        Session currentsesion = getcommonRepo();

        try {
            BeginTransaction();
            Criteria criteria = currentsesion.createCriteria(Categories.class).addOrder(Order.asc("name"));
            List<Categories> categoryList = criteria.list();
            commitTransaction();
            return categoryList;
        } catch (HibernateException ex) {
            System.out.println(ex.getMessage());
            rollBackTransaction();
            throw ex;
        }

    }

    @Override
    public Categories addCategory(Categories categories) throws Exception {
        Session currentsesion = getcommonRepo();

        try {
            BeginTransaction();
            int cat = (Integer) currentsesion.save(categories);
            categories.setId(cat);

            commitTransaction();
            return categories;
        } catch (Exception ex) {
            rollBackTransaction();
            throw ex;
        }

    }

    @Override
    public Categories EditCategory(Categories categories) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCategory(Categories categories) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categories findCategory(Categories categories) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Products addProduct(Products products) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Products EditProduct(Products products) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteProduct(Products products) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Products> FindAllProducts() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Products findProduct(Products products) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
