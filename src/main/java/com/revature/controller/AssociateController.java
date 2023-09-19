package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entity.Associate;
import com.revature.service.AssociateInterfaceService;

@DependsOn("AssociateInterfaceService")
@Component
@RestController
public class AssociateController {
    @Autowired
    AssociateInterfaceService associateInterfaceService;

    @PostMapping("/AddAssociate")
    public String addAssociate(@RequestBody Associate associate) {
        int i = associateInterfaceService.addAssociateService(associate);
        if (i > 0)
            return "Associate Added Successfully";
        else
            return "Could Not Add Associate";
    }
    
    @GetMapping("/ShowAssociate")
    public List<Associate> showAssociate() {
        List<Associate> ll = associateInterfaceService.showAssociateService();
        return ll;
    }

    @PutMapping("UpdateAssociate/{a_id}")
    public String updateAssociate(@PathVariable("a_id") int userId, @RequestBody Associate associate) {
        associate.setAid(userId);
        int i = associateInterfaceService.updateAssociateService(associate);
        return "Updated Associate Details";
    }

    @DeleteMapping("deleteStudent/{a_id}")
    public String deleteStudent(@PathVariable("a_id") int userId) {
        Associate de = new Associate();
        de.setAid(userId);
        associateInterfaceService.deleteAssociateService(de);
        return "Associate Deleted";
    }

}
