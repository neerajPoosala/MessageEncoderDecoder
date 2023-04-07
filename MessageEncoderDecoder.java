import java.util.Base64;
import java.util.Scanner;

public class MessageEncoderDecoder {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter 1 to Encode");
	System.out.println("Enter 2 to Decode");
	System.out.print("Enter the value: ");
	int message = scanner.nextInt();
        int originalString = message;
        
	switch(message){
	
	case 1:
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Enter the Message to Encode:");
		String message1 = scanner1.nextLine();
        	String originalString1 = message1;
       		// Encoding the string using Base64
       		String encodedString = Base64.getEncoder().encodeToString(originalString1.getBytes());
       		System.out.println("Encoded Message: " + encodedString);
		break;
	case 2:
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Enter the Message to Decode:");
		String message2 = scanner2.nextLine();
        	String originalString2 = message2;
        	// Decoding the string using Base64
        	byte[] decodedBytes = Base64.getDecoder().decode(originalString2);
        	String decodedString = new String(decodedBytes);
        	System.out.println("Decoded Message: " + decodedString);
		break;
	default :
	    System.out.print("Entered value is Incorrect");
			}

    }
}
