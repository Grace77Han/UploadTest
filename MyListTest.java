import java.util.ArrayList; 
public class MyListTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. write some code to use MyList 
		//2. use ArrayList as data storage
		
	//	ArrayList<String> sampleData = new ArrayList<>(); //  A ,
		ArrayList<String> sampleData = new ArrayList<String>(); // B, What is different between A and B?
		
	//	String[] sampleData = {"aa","bb","cc","cc"};  //C, what if you are using straing array, what happen?  why do you need ArrayList?
		
		sampleData.add("aa");
		sampleData.add("bb");
		sampleData.add("cc");
		sampleData.add("cc");
		
	
		MyList myList = new MyList();
		MySet mySet = new MySet();
		
		// copy all values of the sampleData arraylist into myList
		// same data will be added as arraylist
		for (int i = 0; i < sampleData.size(); i++) { // test add
			myList.add(sampleData.get(i));
		}
		
		// copy values of the sampleData arraylist into mySet
		// same data will be added as arraylist except 4th element "cc" 
		for (int i = 0; i < sampleData.size(); i++) { // test add
			mySet.add(sampleData.get(i));
		}
		
		System.out.println("sampleData contains: " + sampleData.toString()); 
		System.out.println("myList contains: " + myList.toString()); // test MyList's toString
		System.out.println("mySet contains: " + mySet.toString()); // test MySet's toString
		System.out.println("myList contains: " + myList.get(1) + "at the index 1, and it will be removed."); 
	//	System.out.println("mySet contains: " + mySet.get(1) + "at the index 1. and it will be also removed."); //  no get method in your mySet object
		
		myList.remove(myList.get(1));
	//	mySet.remove(mySet.get(1));
		
		System.out.println("Now, myList contains: " +  myList.toString()); // test MyList's remove
		System.out.println("Now, mySet contains: " +  myList.toString()); // test MySet's remove
		
	}
}
	

