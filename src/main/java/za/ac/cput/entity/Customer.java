package za.ac.cput.entity;

import sun.security.provider.certpath.Builder;

public class Customer
{
    private String customerID;
    private String firstName, lastName, address;
    private String number;



    public Customer(Builder builder)
    {
        this.customerID = builder.customerID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.number = builder.address;
        this.address = builder.address;

    }

    public String getCustomerID() {
        return customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }


    public static class Builder
    {
        private String customerID;
        private String firstName, lastName, address;
        private long number;

        public Builder setCustomerID(String customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAddress( String address) {
            this.address = address;
          return this;
        }

        public Builder setNumber(long number) {
            this.number = number;
            return this;
        }

        public Customer build()
        {
            return new Customer(this);
        }

        public Builder copy(Customer customer)
        {
            this.customerID = customer.customerID;
            this.firstName = firstName;
            this.address = address;
            this.address = address;
            this.number = number;
            return this;
        }

    }
    public Customer setFirstName(String firstName)
    {
        this.firstName = firstName;
        return this;
    }

    public Customer setLastName(String lastName)
    {
        this.lastName =lastName;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }



}
