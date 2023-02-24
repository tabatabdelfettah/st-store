/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester2;

import com.tabat.BusinessLogicCore.BusinessLogicCore;
import com.tabat.hibernate.dal.Categories;
import static com.tabat.hibernate.dal.HibernateManager.HibernateDBManager.BeginTransaction;

import static com.tabat.hibernate.dal.HibernateManager.HibernateDBManager.commitTransaction;
import static com.tabat.hibernate.dal.HibernateManager.HibernateDBManager.getcommonRepo;
import static com.tabat.hibernate.dal.HibernateManager.HibernateDBManager.rollBackTransaction;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

/**
 *
 * @author tababt
 */
public class tt {
    public static void main(String[] args) {
        
        try {
            BusinessLogicCore bb=new BusinessLogicCore();
 
             try {
           
            Session currentsesion = getcommonRepo();

            BeginTransaction();
           Categories cat = new Categories("tdedestingt", "nhaefefefr je555uefefefedi", null);
            currentsesion.save(cat);
            commitTransaction();
        } catch (Exception ex) {
            rollBackTransaction();
            System.err.println(ex.getMessage());
        }
            
        } catch (Exception ex) {
            Logger.getLogger(tt.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
