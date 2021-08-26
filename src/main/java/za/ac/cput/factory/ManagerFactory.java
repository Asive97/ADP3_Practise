package za.ac.cput.factory;

import za.ac.cput.entity.Manager;
import za.ac.cput.util.GenericHelper;

public class ManagerFactory {
    public  static Manager createManager(String name){
        String managerId = GenericHelper.generateId();
        Manager manager = new Manager.Builder()
                .setId(managerId)
                .setName(name)
                .build();
        return manager;
    }
}
