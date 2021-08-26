package za.ac.cput.repository;

import za.ac.cput.entity.Manager;

import java.util.HashSet;
import java.util.Set;

public class ManagerRepository implements IManagerRepository{
    private static ManagerRepository repository = null;
    private Set<Manager> managerDB= null;

    public ManagerRepository(){

        managerDB = new HashSet<Manager>();
    }
    public static ManagerRepository getRepository(){
        if(repository == null){
            repository  = new ManagerRepository();
        }
        return repository;
    }


    @Override
    public Manager create(Manager manager) {
    boolean success = managerDB.add(manager);
    if(!success)
        return null;
      return manager;
    }

    @Override
    public Manager read(String managerId) {
        for (Manager c : managerDB)
            if (c.getId().equals(managerId)){
                return c;
            }
        return null;
    }

    @Override
    public Manager update(Manager manager) {
        Manager oldManger = read(manager.getId());
        if (oldManger != null){
            managerDB.remove(oldManger);
            managerDB.add(manager);
            return manager;
        }
        return null;
    }

    @Override
    public boolean delete(String managerId) {
        Manager managerToDelete = read(managerId);
        if (managerToDelete== null)

            return false;
        managerDB.remove(managerToDelete);
        return  true;
    }


    @Override
    public Set<Manager> getAll() {
        return managerDB;
    }
}
