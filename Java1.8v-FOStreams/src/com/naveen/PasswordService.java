package com.naveen;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {

	public static void main(String[] args) throws Exception {
		
		String pwd = "test@123";
		
		// Encoding and Decoding
		Encoder encoder = Base64.getEncoder();
		
		//converting string to byte[] and passing as input for encode() method
		byte[] encode = encoder.encode(pwd.getBytes());
		
		// converting byte[] to String
		String encodedPwd = new String(encode);
		
		System.out.println(encodedPwd);
		
		Decoder decoder = Base64.getDecoder();
		
		byte[] decode = decoder.decode(encodedPwd);
		String decodedPwd = new String(decode);
		System.out.println(decodedPwd);
		
	}

}
