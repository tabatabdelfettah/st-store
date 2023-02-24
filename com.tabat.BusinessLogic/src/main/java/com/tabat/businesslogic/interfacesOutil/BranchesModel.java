/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabat.businesslogic.interfacesOutil;

import com.tabat.hibernate.dal.Branches;

/**
 *
 * @author tababt
 */
public interface BranchesModel {
     Branches addBranch(Branches branches) throws Exception;

    Branches editBranch(Branches branches) throws Exception;

    void deleteBranch(Branches branches) throws Exception;

    Branches getBranch(Branches branches) throws Exception;

    void getAllBranch() throws Exception;
    
    
}
