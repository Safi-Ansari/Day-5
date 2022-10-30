package ex_5_3;

import java.io.File;

public class ListingFiles {
	
	public static void main(String a[]){
		File file = new File("C:\\Users\\Safwathullah\\Desktop\\");
		String[] fileList = file.list();
		
		for(String name:fileList){
			
			System.out.println(name);
       }
   }

}
