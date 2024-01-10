package SeleniumDemoProject.SeleniumDemoProject;

import org.apache.commons.codec.binary.Base64;

public class EncodingDecoding {

	public static void main(String[] args) {
		String str="test123";
		byte[] encode=Base64.encodeBase64(str.getBytes()); // here first we have to change string into bytes thne we will store it into byte data type
		// since the encoded string is in byte format so we have to convert the byte format to string format.
		System.out.println("the encoded string is"+(new String(encode)));
		

		
		// Decoding
		byte[] decode=Base64.decodeBase64(encode);
		System.out.println("the decoded string is"+(new String(decode)));
	}

}
