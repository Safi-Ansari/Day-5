package ex_5_2;

import java.io.File;

public class FileExists {
	
	public static void main(String[] args) {
        // Create a File object
        File my_file_dir = new File("C:\\Users\\Safwathullah\\Desktop\\test.txt");
        
        if (my_file_dir.exists()) {
        	
        	System.out.println("The directory or file exists.\n");
        	
        }
        
        else {
        	
        	System.out.println("The directory or file does not exist.\n");
        	
        }
        
       }

}
