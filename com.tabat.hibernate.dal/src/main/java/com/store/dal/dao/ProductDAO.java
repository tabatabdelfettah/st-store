package com.store.dal.dao;


import com.tabat.hibernate.dal.HibernateManager.HibernateDBManager;
import com.tabat.hibernate.entities.Product;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Query;
import org.hibernate.Session;


public class ProductDAO {
    
    public Product add(Product product) {
        HibernateDBManager.getcommonRepo().persist(product);
        return product;
    }
    
    public Product update(Product product) {
        HibernateDBManager.getcommonRepo().update(product);
        return product;
    }
    
    public void remove(Integer productID) {
        HibernateDBManager.getcommonRepo().delete(productID);
        
    }
    
    public Product findByID(Integer productID) {
        return (Product) HibernateDBManager.getcommonRepo().get(Product.class, productID);
        
    }
    
//    public List<Product> findList() {
//        Session session = HibernateDBManager.getcommonRepo();
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<Product> productCriteriaQuery = builder.createQuery(Product.class);
//        Root<Product> root = productCriteriaQuery.from(Product.class);
//        productCriteriaQuery.select(root);
//        Query<Product> query = session.createQuery(productCriteriaQuery);
//        List<Product> results = query.getResultList();
//        return results;
//        
//    }

    public void patchRemove(List<Product> products) {
        if (products == null) {
            return;
        }
        products.forEach((product) -> {
            remove(product.getId());
        });
    }
    
}
