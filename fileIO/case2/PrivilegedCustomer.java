package case2;

import java.io.Serializable;

class PrivilegedCustomer extends Customer implements Serializable {
 
    // instance variables
    float discountRate;
    int bonusPoints;
 
    @Override
    public String toString() {
        return "PrivilegedCustomer [customerId=" + customerId 
                + ", customerName=" + customerName 
                + ", discountRate=" + discountRate 
                + ", bonusPoints=" + bonusPoints + "]";
    }
}
