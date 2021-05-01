import java.util.ArrayList; 
public class MyListTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. write some code to use MyList 
		//2. use ArrayList as data storage
		
	//	ArrayList<String> sampleData = new ArrayList<>(); //  A ,
		ArrayList<String> sampleData = new ArrayList<String>(); // B, What is different between A and B?
	// Ans: Is there a difference between A and B? As I know, they work same. Could you let me know the certain difference? 
		
	//	String[] sampleData = {"aa","bb","cc","cc"};  //C, what if you are using straing array, what happen?  why do you need ArrayList?
	/* Ans: I don't think there will be a big difference between using String array and ArrayList. 
	    String array won't have some methods like add(), remove(), get() that ArrayList will has, so I need to write more codes. 
		Also String array will have a fixed size while ArrayList has size flexibility.
	*/	
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
	//	System.out.println("mySet contains: " + mySet.get(1) + "at the index 1. and it will be also removed."); //  no get method in your mySet object // I forgot about that... Thnank you for reminding.
		
		myList.remove(myList.get(1));
	//	mySet.remove(mySet.get(1));
		
		System.out.println("Now, myList contains: " +  myList.toString()); // test MyList's remove
		System.out.println("Now, mySet contains: " +  myList.toString()); // test MySet's remove
		
	}
}
	

