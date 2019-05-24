package pwd_encription;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.mail.internet.MimeUtility;

import org.apache.commons.codec.binary.Base64;



public class EncryptionUtility {

	private static final String ALGORITHM = "AES";
	private static final String DIGEST = "SHA-256";
	//private static final String DIGEST = "MD5";
	private static final int ITERATIONS = 2;
    private static final byte[] keyValue =
        new byte[] { 'C', 'r', 'e', 'd', 'i', 't', 'P', 'r', 'o', 'c', 'e', 's', 's', 'i', 'n', 'g'};

    /**
     * Encodes the bytes array to a string
     * Uses Base64 encoding
     * 
     * @param byteArray - Byte Array
     * @return
     */
    public static String encodeBytesToString(byte[] byteArray){
    	ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream base64OutputStream;
		try {
			base64OutputStream = MimeUtility.encode(baos, "base64");
	        base64OutputStream.write(byteArray);
	        base64OutputStream.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//log("encoded String " + baos.toString());
        return baos.toString();
    	
    }
    
    /**
     * Encrypts the password using a specified algorithm
     * Also uses a specified digest to ensure one way encoding
     * 
     * @param value - Value of the String to be encrypted
     * @param salt - Salt value to be used for encrypting
     * @return
     */
    public static String encrypt(String value, String salt) {
    	Key key;
        String encryptedValue=value;
    	try {
	        key = generateKey();
	        Cipher c = Cipher.getInstance(ALGORITHM);
	        c.init(Cipher.ENCRYPT_MODE, key);
	        String valueToEnc = null;
	        //log("First encryptedValue: "+encryptedValue);
	        for (int i = 0; i < ITERATIONS; i++) {
	            valueToEnc = salt + encryptedValue;
	            byte[] encValue = c.doFinal(valueToEnc.getBytes());
	            //encryptedValue = encodeBytesToString(encValue);	            
	            encryptedValue = new String(new Base64().encode(encValue));
	        }
    	}catch (Exception e) {
			e.printStackTrace();
		}
    	/*log("Last encryptedValue: "+encryptedValue);*/
    	encryptedValue =  getDigest(encryptedValue,DIGEST);
        return encryptedValue;
    }

    private static Key generateKey() throws Exception {
        return new SecretKeySpec(keyValue, ALGORITHM);

    }
    
    /**
     * Uses a digest to ensure one way encryption
     * 
     * @param input - String to be encoded
     * @param digestAlgo - Algorithm for the digest
     * @return
     */
    public static String getDigest(String input,String digestAlgo) {
    	try {            
	    		MessageDigest md = MessageDigest.getInstance(digestAlgo);    
	    		byte[] messageDigest = md.digest(input.getBytes());       
	    		BigInteger number = new BigInteger(1, messageDigest); 
	    		String hashtext = number.toString(16);            
	    		// Now we need to zero pad it if you actually want the full 32 chars.            
	    		while (hashtext.length() < 32) {                
	    			hashtext = "0" + hashtext;           
	    		}            
	    		return hashtext;        
    		}        catch (NoSuchAlgorithmException e) {            
    			throw new RuntimeException(e);        
    		}    
    }

	
   /**
    * Convert password string to Hex
    */    
   public  static String toHex(String password){
	   BigInteger number = new BigInteger(1, password.getBytes()); 
		String hashtext = number.toString(16);            
		// Now we need to zero pad it if you actually want the full 32 chars.            
		while (hashtext.length() < 32) {                
			hashtext = "0" + hashtext;           
		} 
		return hashtext;
   }
   
   
	/*
	 * This 
	 */
	public static String convertStringToHex(String str) {

		char[] chars = str.toCharArray();

		StringBuffer hex = new StringBuffer();
		for (int i = 0; i < chars.length; i++) {
			hex.append(Integer.toHexString((int) chars[i]));
		}
		return hex.toString();
	}

	public static String convertHexToString(String hex) {

		StringBuilder sb = new StringBuilder();
		// 49204c6f7665204a617661 split into two characters 49, 20, 4c...
		for (int i = 0; i < hex.length() - 1; i += 2) {

			// grab the hex in pairs
			String output = hex.substring(i, (i + 2));
			// convert hex to decimal
			int decimal = Integer.parseInt(output, 16);
			// convert the decimal to character
			sb.append((char) decimal);

		}

		return sb.toString();
	}
	
}