package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Manager;
import za.ac.cput.factory.ManagerFactory;

import static org.junit.jupiter.api.Assertions.*;

class ManagerRepositoryTest {
    public static ManagerRepository repository = new ManagerRepository();
    private Manager manager=
            ManagerFactory.createManager("Savage");
    @Test
    void a_create() {
        Manager created = repository.create(manager);
        assertEquals(manager.getId(),created.getId());
        System.out.println("created" + created);
    }

    @Test
    void b_read() {
        Manager read = repository.read(manager.getId());
        System.out.println("read" + read);
    }

    @Test
    void c_update() {
        Manager updated = new Manager.Builder().copy(manager).setId("1").build();
        System.out.println("updated" + updated);
    }

    @Test
    void e_delete() {
        repository.delete(manager.getId());
        System.out.println("Delete" + manager.getId() + ' ');
    }

    @Test
    void d_getAll() {
        System.out.println("Show All");
        System.out.println(repository.getAll());
    }
}