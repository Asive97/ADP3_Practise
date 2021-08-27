package za.ac.cput.service;

import za.ac.cput.entity.Manager;

import java.util.Map;
import java.util.Set;

public interface IManagerService extends IService<Manager,String>{
    public Set<Manager> getAll();
}
