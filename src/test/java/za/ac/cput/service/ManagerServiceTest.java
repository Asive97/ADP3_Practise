package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Manager;
import za.ac.cput.factory.ManagerFactory;
import za.ac.cput.repository.ManagerRepository;

import static org.junit.jupiter.api.Assertions.*;

class ManagerServiceTest {
private static ManagerRepository repository = new ManagerRepository();
private static Manager manager = ManagerFactory.createManager("Asive");

    @Test
    void getAll() {
        System.out.println("Show All");
        System.out.println(repository.getAll());
    }

    @Test
    void create() {
Manager created = repository.create(manager);
assertEquals(manager.getId(),created.getId());
        System.out.println("created" + created);
    }

    @Test
    void read() {
Manager read = repository.read(manager.getId());
        System.out.println("Read" + read);
    }

    @Test
    void update() {
Manager updated = new Manager.Builder().copy(manager).setId("21452").build();
        System.out.println("Updated" + updated);
    }

    @Test
    void delete() {
         repository.delete(manager.getId());
        System.out.println("delete" + manager.getId());
    }
}