import java.util.ArrayList;
import java.util.Iterator; 

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> chilDrivingData = new ArrayList<>();
		
	    String[][] chilDrivingSampleData = {
	    		{"Monday","8:10","8:30"},
	    		{"Tuesday","8:20","8:40"},
	    		{"Wednesday","8:30","8:50"},
	    		{"Thursday","8:34","8:54"},
	    		{"Firday","8:21","8:41"},
	    		{"Saturday","8:19","8:39"},
	    };

	    //Store the sampledata into the ArrayList
		for (int i = 0 ; i < chilDrivingSampleData.length ; i++ ){
			 chilDrivingData.add(chilDrivingSampleData[i]);  //<-- Research more about using add method, 
		 }
	    
		//First of all, you can not add the sample data to ArrayList with the above way. 
		// iterating means that retrieve all stored data
		
	    // iterating all elements from the ArrayList // I don't understand the exact meaning of iterating in this context. Do you want me to print all elements?
	    // use Iterator
		// I put Enumeration and Collection docs within the readme.MD file
		Iterator<String> chilDrivingDataIterator = chilDrivingData.iterator();

	    // use Enumeration and Collections // I don't know what it Enumeration. Could you explain about it?
	    
	    
	    
	    
	    
	}

}
