package evaluation;



import java.io.Serializable;

class Customer1 implements Serializable {
 
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