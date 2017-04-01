package exceptionbasics;

import javax.swing.JOptionPane;

public class Customer {
    private String state;
    private String zipCode;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        if(zipCode.length() == 10) {
            String[] parts = zipCode.split("-");
            if(parts.length != 2) {
                throw new IllegalArgumentException("Invalid Zip Code: 10-digit zip codes must cotain a hypen");
            }
            
            for(String part : parts) {
                char[] chars = part.toCharArray();
                for(char c : chars) {
                    if(!Character.isDigit(c)) {
                        throw new IllegalArgumentException("Invalid Zip Code: Zip Codes can only contain numbers and hypens");
                    }
                }
            }
        } else {
            if(zipCode.length() != 5) {
                throw new IllegalArgumentException("Invalid Zip Code: Zip Codes must contain a minimum of 5 numbers");
            } else {
                char[] chars = zipCode.toCharArray();
                for(char c : chars) {
                    if(!Character.isDigit(c)) {
                        throw new IllegalArgumentException("Invalid Zip Code: Zip Codes must contain only numers");
                    }
                }
            }
        }
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    /**
     * A method that sets the state for this customer.
     * @param state - a two-character abbreviation for state
     * @throws IllegalArgumentException if state is not 2 characters in length
     */
    public void setState(String state) throws IllegalArgumentException {

        if(state == null || state.length() != 2) {
            throw new IllegalArgumentException (
                    "state must be 2 characters in length");

        }
        this.state = state;
    }


}
