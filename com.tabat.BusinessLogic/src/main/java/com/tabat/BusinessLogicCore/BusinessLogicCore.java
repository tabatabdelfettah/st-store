/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabat.BusinessLogicCore;

import com.tabat.businesslogic.IMPL.BranchModuleImpl;
import com.tabat.businesslogic.IMPL.MenuModelImpl;
import com.tabat.businesslogic.interfacesOutil.BranchesModel;
import com.tabat.businesslogic.interfacesOutil.MenuModel;
import com.tabat.hibernate.dal.Categories;
import com.tabat.hibernate.dal.HibernateManager.HibernateDBManager;
import com.tabat.hibernate.dal.Products;
import java.util.List;

/**
 *
 * @author tababt
 */
public class BusinessLogicCore {
    private MenuModel menuModel;
    private BranchesModel branchesModel;

    public BusinessLogicCore() throws Exception {
        menuModel = new MenuModelImpl();
        branchesModel = new BranchModuleImpl();
        String DbconfigFilename="storejava.cfg.xml";
        HibernateDBManager.setDbconfigFilename(DbconfigFilename);
        HibernateDBManager.BuildSessionFactory();
    }

    public List<Categories> findAllCategories() throws Exception {
        return menuModel.findAllCategories();
    }

    public Categories addCategory(Categories categories) throws Exception {
        return menuModel.addCategory(categories);
    }

    public Categories EditCategory(Categories categories) throws Exception {
        return menuModel.EditCategory(categories);
    }

    public void deleteCategory(Categories categories) throws Exception {
        menuModel.deleteCategory(categories);
    }

    public Categories findCategory(Categories categories) throws Exception {
        return menuModel.findCategory(categories);
    }

    public Products addProduct(Products products) throws Exception {
        return menuModel.addProduct(products);
    }

    public Products EditProduct(Products products) throws Exception {
        return menuModel.EditProduct(products);
    }

    public void deleteProduct(Products products) throws Exception {
        menuModel.deleteProduct(products);
    }

    public List<Products> FindAllProducts() throws Exception {
        return menuModel.FindAllProducts();
    }

    public Products findProduct(Products products) throws Exception {
        return menuModel.findProduct(products);
    }
    
}
