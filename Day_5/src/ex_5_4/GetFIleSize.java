package ex_5_4;

import java.io.File;

public class GetFIleSize {
	public static void main(String[] args) { 
		File file = new File("C:\\Users\\Safwathullah\\Desktop\\test.txt");
		if(file.exists()) { 
	         double bytes = file.length();
	         double kilobytes = (bytes / 1024);
	         double megabytes = (kilobytes / 1024);
	         double gigabytes = (megabytes / 1024);
	         
	         System.out.println("bytes : " + bytes);
	         System.out.println("kilobytes : " + kilobytes);
	         System.out.println("megabytes : " + megabytes);
	         System.out.println("gigabytes : " + gigabytes);
	         
	      }
		
		else {
	         System.out.println("File not found");
	      }
	}
	     

}
