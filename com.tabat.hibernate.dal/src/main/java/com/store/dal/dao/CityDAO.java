package com.store.dal.dao;

import com.tabat.hibernate.dal.HibernateManager.HibernateDBManager;
import com.tabat.hibernate.entities.City;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;


public class CityDAO {

    public City add(City city) {
        HibernateDBManager.getcommonRepo().persist(city);
        return city;
    }

    public City update(City city) {
        HibernateDBManager.getcommonRepo().update(city);
        return city;
    }

    public void remove(Integer cityID) {
        HibernateDBManager.getcommonRepo().delete(cityID);

    }

    public City findByID(Integer cityID) {
        return (City) HibernateDBManager.getcommonRepo().get(City.class, cityID);

    }

//    public List<City> findList() {
//        Session session = HibernateDBManager.getcommonRepo();
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<City> productCriteriaQuery = builder.createQuery(City.class);
//        Root<City> root = productCriteriaQuery.from(City.class);
//        productCriteriaQuery.select(root);
//        Query<City> query = session.createQuery(productCriteriaQuery);
//        List<City> results = query.getResultList();
//        return results;

//    }

    public void patchRemove(List<City> citys) {
        if (citys == null) {
            return;
        }
        for (City city : citys) {

            remove(city.getId());
        }
    }

}
