public class OTPExample { 
    public static void main(String[] args) {
	OTPGEN password1 = new OTPGEN(10); 
	OTPGEN password2 = new OTPGEN(14);
        int passwordLength1 = password1.getLength();
        int passwordLength2 = password2.getLength(); 	
        System.out.println("Password Length 1: " + passwordLength1);
        System.out.println("Password Length 2: " + passwordLength2); 

        // Generate a new password, a new password will be generated every time 
	password1.generatePassword(); 
        password2.generatePassword(); 	
	final String password1Final = password1.getPassword(); 
	final String password2Final = password2.getPassword(); 

	System.out.println("Password1: " + password1Final); 
	System.out.println("Password2: " + password2Final); 	
    } 
}     
	
