/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabat.hibernate.dal.HibernateManager;

/**
 *
 * @author tababt
 */
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author tababt
 */
public class HibernateDBManager {

    private static SessionFactory DbSessionFactory;
    private static String DbconfigFilename;

    public static void setDbconfigFilename(String DbconfigFilename) {
        HibernateDBManager.DbconfigFilename = DbconfigFilename;
    }

    public static void BuildSessionFactory() throws Exception {

        try {
            if (DbSessionFactory != null) {
                return;
            }
            if (DbconfigFilename == null) {

                throw new Exception("Error:you must create  your file xml first");
            }
            Configuration configuration = new Configuration().configure(DbconfigFilename);
            StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
            serviceRegistryBuilder.applySettings(configuration.getProperties()).build();
            StandardServiceRegistry serviceRegestry = serviceRegistryBuilder.build();
            DbSessionFactory = configuration.buildSessionFactory(serviceRegestry);

        } catch (HibernateException ex) {

            DbSessionFactory = null;
            DbconfigFilename = null;
            throw ex;
        }

    }

    public static SessionFactory getDbSessionFactory() {
        return DbSessionFactory;
    }

    public static Session getcommonRepo() {
        return DbSessionFactory.getCurrentSession();
    }

    public static void BeginTransaction() {
        DbSessionFactory.getCurrentSession().beginTransaction();
    }

    public static void commitTransaction() {
        DbSessionFactory.getCurrentSession().getTransaction().commit();
    }

    public static void rollBackTransaction() {
        if (DbSessionFactory.getCurrentSession().getTransaction().isActive()) {
            DbSessionFactory.getCurrentSession().getTransaction().rollback();
        }
    }

}
