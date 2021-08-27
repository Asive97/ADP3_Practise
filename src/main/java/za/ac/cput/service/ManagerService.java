package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.Manager;
import za.ac.cput.repository.ManagerRepository;

import java.util.Set;

@Service
public class ManagerService implements IManagerService {
    private  ManagerRepository repository = null;
    public  static ManagerService service = null;

    public ManagerService(ManagerRepository repository) {
        this.repository = repository;
    }

    private ManagerService(){}
public static ManagerService getService(){
 if (service==null){
     service = new ManagerService();
 }
 return service;
}

    @Override
    public Set<Manager> getAll() {

        return this.repository.getAll();
    }

    @Override
    public Manager create(Manager manager) {


        return this.repository.create(manager);
    }

    @Override
    public Manager read(String managerId) {
        return this.repository.read(managerId);
    }

    @Override
    public Manager update(Manager manager) {
        return this.repository.update(manager);
    }

    @Override
    public boolean delete(String managerId) {
       return this.repository.delete(managerId);

    }

}
