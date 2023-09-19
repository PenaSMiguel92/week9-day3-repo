package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.dao.AssociateDaoInterface;
import com.revature.entity.Associate;

public class AssociateService implements AssociateInterfaceService {
    @Autowired(required = true)
    private AssociateDaoInterface associateDaoInterface;

    @Override
    public List<Associate> showAssociateService() {
        return associateDaoInterface.findAll();
    }

    @Override 
    public int updateAssociateService(Associate associate) {
        associateDaoInterface.saveAndFlush(associate);
        return 1;
    }

    @Override
    public void deleteAssociateService(Associate de) {
        associateDaoInterface.delete(de);
    }
}
