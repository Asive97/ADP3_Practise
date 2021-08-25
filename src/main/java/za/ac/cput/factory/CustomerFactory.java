

package za.ac.cput.factory;
import za.ac.cput.entity.Customer;
import za.ac.cput.util.generateID;

public class CustomerFactory
{

    public static Customer createCustomer(String firstName, String lastName, long number, String address)
    {
        String customerID = generateID.GenerateID();
        Customer customer = new Customer.Builder().setCustomerID(customerID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setNumber(number)
                .setAddress(address)
                .build();
        return customer;
    }
}