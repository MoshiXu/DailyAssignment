package case1;

class PrivilegedCustomer extends Customer {
	 
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