package evaluation;

public class Customer2 {
	 
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