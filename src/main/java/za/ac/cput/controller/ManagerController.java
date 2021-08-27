package za.ac.cput.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.Manager;
import za.ac.cput.factory.ManagerFactory;
import za.ac.cput.service.ManagerService;

@RestController
@RequestMapping ("/manager")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Manager create(@RequestBody Manager manager) {
        Manager newContact = ManagerFactory.createManager(manager.getName());
        return managerService.create(newContact);
    }
}
