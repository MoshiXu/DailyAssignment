package case2;

class Customer {
	 
    // instance variables
    int customerId;
    String customerName;
 
    // overriding toString() method
    @Override
    public String toString() {
        return "Customer [customerId=" + customerId 
                + ", customerName=" + customerName + "]";
    }
}