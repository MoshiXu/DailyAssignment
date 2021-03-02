package case1;

import java.io.Serializable;

class Customer implements Serializable {
 
    // instance variables
    int customerId;
    String customerName;
 
    // overriding toString() method
    @Override
    public String toString() {
        return "Customer ["
                + "customerId=" + customerId 
                + ", customerName=" + customerName
                + "]";
    }
}