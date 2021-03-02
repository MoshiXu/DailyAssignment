package evaluation;

import java.io.Serializable;

public class PrivilegedCustomer2 extends Customer2 implements Serializable {
 
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
