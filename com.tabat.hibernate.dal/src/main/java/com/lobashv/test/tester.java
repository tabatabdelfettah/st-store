/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lobashv.test;



import com.store.dal.dao.CityDAO;
import org.hibernate.Session;
import static com.tabat.hibernate.dal.HibernateManager.HibernateDBManager.*;
import com.tabat.hibernate.entities.City;

/**
 *
 * @author tababt
 */
public class tester {

    public static void main(String[] args) {
        try {
            String filename = "hibernate.cfg.xml";
            setDbconfigFilename(filename);
            BuildSessionFactory();
//            Session currentsesion = getcommonRepo();

            BeginTransaction();
            CityDAO d=new CityDAO();
            City ct=new City("aaaammm", "nnnnnnn");
            d.add(ct);
            commitTransaction();
        } catch (Exception ex) {
            rollBackTransaction();
            System.err.println(ex.getMessage());
        }
    }
}
