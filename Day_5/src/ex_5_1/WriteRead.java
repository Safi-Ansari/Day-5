package ex_5_1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteRead {
	public static void main(String[] args) {

	    String data = "This is a test file.";
	    
	    //writing to file

	    try {
	      PrintWriter output = new PrintWriter("C:\\Users\\Safwathullah\\Desktop\\test.txt");

	      output.print(data);
	      output.close();
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
	    
	    //reading from file
	    
	    BufferedReader objReader = null;
	    try {
	     String input;
	     objReader = new BufferedReader(new FileReader("C:\\Users\\Safwathullah\\Desktop\\test.txt"));
	     while ((input = objReader.readLine()) != null) {
	      System.out.println(input);
	     }
	    }
	    catch (IOException e) {
	        System.out.println("Exception caught is: "+e);
	    }	    
	    
	  }
}
