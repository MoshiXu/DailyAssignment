package evaluation;

public class PrivilegedCustomer1 extends Customer1{

	 // instance variables
    float discountRate;
    int bonusPoints;
 
    @Override
    public String toString() {
        return "PrivilegedCustomer ["
                + "customerId=" + customerId 
                + ", customerName=" + customerName 
                + ", discountRate=" + discountRate 
                + ", bonusPoints=" + bonusPoints 
                + "]";
    }
}
