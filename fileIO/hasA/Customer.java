package hasA;

import java.io.Serializable;

class Customer implements Serializable {
 
    // instance variables
    int customerId;
    String customerName;
    Address address;
    Phone phone;
 
    // 4-arg parameterized constructor
    public Customer(int customerId, String customerName,
            Address address, Phone phone) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }
 
    // overriding toString() method
    @Override
    public String toString() {
        return "Customer ["
                + "customerId=" + customerId 
                + ", customerName=" + customerName 
                + ", address=" + address
                + ", phone=" + phone
                + "]";
    }
}
