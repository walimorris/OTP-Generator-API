/** 
 * OTP Generator stands for One Time Password generator and is something we 
 * all need when we lock ourselves out of phones, emails or online accounts
 * The OTP GEN API allows a client program to easily generate an OTP for any 
 * user
 *
 * @author Wali Morris<walimmorris@gmail.com>
 * 
 */

import java.util.*; 

public class OTPGEN { 
    private String otp; 
    private int length; 
    
    /**
     * @param length : passed is the proposed length of the random password
     */
    public OTPGEN(int length) { 
	this.otp = null; 
        this.length = length; 
    }
    
    /**
     * letters, number and special key lookup table for random generation
     */
    final public void generatePassword() { 
	String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        String lower = "abcdefghijklmnopqrstuvwxyz"; 
        String number = "0123456789"; 
        String special = "`~!@#$%^&*+=-/><";

	/* Creates a String containing all characters from key lookup table */ 
	String keys = upper + lower + number + special;  
        
	/**
	 * Generate a new array that'll store each randomly generated character. Generates
	 * a random character for the length of password. 
	 */
	Random r = new Random(); 
	Character[] password = new Character[this.length]; 

	/* Keys is a String containing all special characters from character loop up table. Iterate a loop from 
	 * 1 - length of desired OTP. Select a random character and append to the password arround */ 
	for ( int i = 0; i < this.length; i++ ) {
            password[i] = keys.charAt(r.nextInt(keys.length()));
        }
        try { 
	    /* Will attempt to throw null exception, generate an empty password String to begin adding chars */ 
            if ( this.otp.equals(null) ) {
                this.otp = "";
            }
        } catch ( NullPointerException e) {
            this.otp = "";
        }
	/* Appends each character from password aroudn to randomly generated OTP */ 
        Arrays.stream(password).forEach (key -> this.otp += key);
    }
    
    /** 
     * @return password as a string, *add to string method here
     */
    public String getPassword() {
        return this.otp;
    }
    
    /** 
     * @return the length of the password
     */ 
    public int getLength() {
        return this.length;
    }
}
   
