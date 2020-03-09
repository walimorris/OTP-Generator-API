/** 
 * OTP Generator stands for One Time Password generator and is something we 
 * all need when we lock ourselves out of phones, emails or online accounts
 * The OTP GEN API allows a client program to easily generate an OTP for any 
 * user
 *
 * @author Wali Morris 
 * 
 */

import java.util.*; 

public class OTPGEN { 
    private String otp; 
    private int length; 

    public OTPGEN(int length) { 
	this.otp = ""; 
        this.length = length; 
    }

    public OTPGEN() { 
	this(0); 
    } 

    final public void generatePassword() { 
	String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        String lower = "abcdefghijklmnopqrstuvwxyz"; 
        String number = "0123456789"; 
        String special = "`~!@#$%^&*+=-/><";

	String keys = upper + lower + number + special;  

	Random r = new Random(); 
	Character[] password = new Character[this.length]; 

	for ( int i = 0; i < this.length; i++ ) {
            password[i] = keys.charAt(r.nextInt(keys.length()));
        }
        try {
            if ( this.otp.equals(null) ) {
                this.otp = "";
            }
        } catch ( NullPointerException e) {
            this.otp = "";
        }
        Arrays.stream(password).forEach (key -> this.otp += key);
    }

    public String getPassword() {
        return this.otp;
    }

    public int getLength() {
        return this.length;
    }
}
   
