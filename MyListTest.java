import java.util.ArrayList;
import java.util.Iterator; 
public class MyListTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	
		 ArrayList<String> sampleData = new ArrayList<>();	 // Use only Generic Type prior of instance variable. 

		 String[] elementArr = {"aa", "bb", "cc", "dd"};
		 
		
		 for (int i = 0 ; i < elementArr.length ; i++ ){
			 sampleData.add(elementArr[i]);
		 }
         
		 // display stored data using the below code .. Do not need to use MyList!
		 Iterator<String> sampleIterator = sampleData.iterator();
		 
		 
		MyList myList = new MyList();
		MySet mySet = new MySet();
		
		 
		int index = 0;
		while (index < sampleData.size()) {
			myList.add(sampleData.get(index));
			index++;
		}

		
		for (int i = 0; i < sampleData.size(); i++) { // test add
			mySet.add(sampleData.get(i));
		}
		
		System.out.println("sampleData contains: " + sampleData.toString()); 
		System.out.println("myList contains: " + myList.toString()); // test MyList's toString
		System.out.println("mySet contains: " + mySet.toString()); // test MySet's toString
		System.out.println("myList contains: " + myList.get(1) + "at the index 1, and it will be removed."); 
		
		myList.remove(myList.get(1));
		
		System.out.println("Now, myList contains: " +  myList.toString()); // test MyList's remove
		System.out.println("Now, mySet contains: " +  myList.toString()); // test MySet's remove
		
	}
}
	

