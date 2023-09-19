package com.revature.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.revature.entity.Associate;

@Component
@Service
public interface AssociateInterfaceService {
    int addAssociateService(Associate associate);

    List<Associate> showAssociateService();

    int updateAssociateService(Associate associate);

    void deleteAssociateService(Associate de);
}
