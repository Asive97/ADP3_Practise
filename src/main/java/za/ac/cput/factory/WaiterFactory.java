package za.ac.cput.factory;
import za.ac.cput.entity.Waiter;
import za.ac.cput.util.GenericHelper;

public class WaiterFactory {
public  static Waiter createWaiter(String name){
    String waiterId = GenericHelper.generateId();
    Waiter waiter = new Waiter.Builder()
                   .setId(waiterId)
                   .setName(name)
                   .build();
    return waiter;

}
}
