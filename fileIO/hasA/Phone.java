package hasA;

import java.io.Serializable;

class Phone  {
 
    // instance variables
    int countryCode;
    int telephoneNumber;
 
    // 2-arg parameterized constructor
    public Phone(int countryCode, int telephoneNumber) {
        super();
        this.countryCode = countryCode;
        this.telephoneNumber = telephoneNumber;
    }
 
    // overriding toString() method
    @Override
    public String toString() {
        return "Phone ["
                + "countryCode=" + countryCode 
                + ", telephoneNumber=" + telephoneNumber
                + "]";
    }
}
